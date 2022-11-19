/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.ConexionBd;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julia_000
 */
public class UsuarioDAO extends ConexionBd implements Crud {

    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    public String idUsuario = "", nombre = "", apellido = "", fechaNacimiento = "", tipoDocumento = "", numDocumento = "", direccion = "", celular = "", estadoUsuario = "", correoUsuario = "", password = "", rolId = "";

    public UsuarioDAO() {
    }

    public UsuarioDAO(UsuarioVO usuVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            idUsuario = usuVO.getIdUsuario();
            nombre = usuVO.getNombre();
            apellido = usuVO.getApellido();
            fechaNacimiento = usuVO.getFechaNacimiento();
            tipoDocumento = usuVO.getTipoDocumento();
            numDocumento = usuVO.getNumDocumento();
            direccion = usuVO.getDireccion();
            celular = usuVO.getCelular();
            estadoUsuario = usuVO.getEstadoUsuario();
            correoUsuario = usuVO.getCorreoUsuario();
            password = usuVO.getPassword();
            rolId = usuVO.getRolId();

            
            

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
             sql = "insert into usuario (nombre,apellido, fechaNacimiento, tipoDocumento, numDocumento, direccion, celular, estadoUsuario, correoUsuario, password,rolId) VALUES (?,?,?,?,?,?,?,'Activo',?,?,2)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, apellido);
            puente.setString(3, fechaNacimiento);
            puente.setString(4, tipoDocumento);
            puente.setString(5, numDocumento);
            puente.setString(6, direccion);
            puente.setString(7, celular);
            puente.setString(8, correoUsuario);
            puente.setString(9, password);
 

            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update usuario set nombre=?, apellido=?, fechaNacimiento=?, tipoDocumento=?, numDocumento=?, direccion=?, celular=?, estadoUsuario=?, correoUsuario=?, password=?, rolId=? where idUsuario=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, apellido);
            puente.setString(3, fechaNacimiento);
            puente.setString(4, tipoDocumento);
            puente.setString(5, numDocumento);
            puente.setString(6, direccion);
            puente.setString(7, celular);
            puente.setString(8, estadoUsuario);
            puente.setString(9, correoUsuario);
            puente.setString(10, password);
            puente.setString(11, rolId);
            puente.setString(12, idUsuario);
            
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }  finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public boolean inicioSesion(String correoUsuario, String password) {
        try {
            conexion = this.obtenerConexion();
            sql = ("SELECT * FROM usuario WHERE CORREOUSUARIO=? AND PASSWORD=?");
            puente = conexion.prepareStatement(sql);
            puente.setString(1, correoUsuario);
            puente.setString(2, password);

            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                rolId = mensajero.getString("rolId");
                operacion = true;
            }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
     public UsuarioVO consultarID(String idUsuario) {
        UsuarioVO usuVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario where idUsuario = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idUsuario);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),
                        mensajero.getString(9),
                        mensajero.getString(10),mensajero.getString(11),mensajero.getString(12));
            }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return usuVO;
    }

    public ArrayList<UsuarioVO> listar() {
        ArrayList<UsuarioVO> listaUsuarios = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT usuario.idUsuario, usuario.nombre, usuario.apellido, usuario.fechaNacimiento, usuario.tipoDocumento, usuario.numDocumento, usuario.direccion, usuario.celular, usuario.estadoUsuario, usuario.correoUsuario, usuario.password, usuario.rolId FROM usuario ";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                UsuarioVO usuVO = new UsuarioVO(
                        mensajero.getString(1),
                        mensajero.getString(2),
                        mensajero.getString(3),
                        mensajero.getString(4),
                        mensajero.getString(5),
                        mensajero.getString(6),
                        mensajero.getString(7),
                        mensajero.getString(8),
                        mensajero.getString(9),
                        mensajero.getString(10),
                        mensajero.getString(11),
                        mensajero.getString(12));
               listaUsuarios.add(usuVO);
            }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaUsuarios;
    }
/*
    private void deneterConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

}
