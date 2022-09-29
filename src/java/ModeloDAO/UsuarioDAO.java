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
public class UsuarioDAO extends ConexionBd implements Crud
{
    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    public String idUsuario = "",
            correoUsuario = "",
            password = "",
            rolId="";
    
    public UsuarioDAO() {
    }
    public UsuarioDAO(UsuarioVO usuVO){
        super();
        try 
        {
            conexion = this.obtenerConexion();
            idUsuario = usuVO.getIdUsuario();
            correoUsuario = usuVO.getCorreoUsuario();
            password = usuVO.getPassword();
            
            if(usuVO.getRolId() != null){
                rolId = usuVO.getRolId();
            }else{
                // Por defecto el usuario se registra con el rol de adoptante, para ello
                // se obtiene el id rol de la base de datos y se le asigna en el registro al
                // al usuario a su atributo correspondiente :rolId
                String rolIdsql = "SELECT rolId FROM rol where rolTipo='Adoptante';";
                PreparedStatement ps = conexion.prepareStatement(rolIdsql);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    rolId = rs.getString("rolId");
                }
            }
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
    public boolean agregarRegistro() 
    {
        try 
        {
            sql = "insert into usuario values (?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idUsuario);
            puente.setString(2, correoUsuario);
            puente.setString(3, password);
            puente.setString(4, rolId);
           
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
       try {
            sql = "update usuario set correoUsuario=?,password=? where idUsuario=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idUsuario);
            puente.setString(2, correoUsuario);
            puente.setString(3, password);
            puente.executeUpdate();
            operacion = true;
            

        } catch (SQLException e) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    public boolean inicioSesion(String correoUsuario, String password) {
        try {
            conexion = this.obtenerConexion();
            sql =("SELECT * FROM usuario WHERE CORREOUSUARIO=? AND PASSWORD=?");
            puente = conexion.prepareStatement(sql);
            puente.setString(1, correoUsuario);
            puente.setString(2, password);
            
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                rolId = mensajero.getString("rolId");
                operacion = true;
            }
        }  catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
   
    
    public ArrayList <UsuarioVO>listar(){
        ArrayList<UsuarioVO>listaUsuarios = new ArrayList<>();
        
        try {
            conexion = this.obtenerConexion();
           sql = "select * from usuario;";
           puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           while(mensajero.next()){
               UsuarioVO usuVO = new UsuarioVO(
                       mensajero.getString(1),
                       mensajero.getString(2),
                       mensajero.getString(3),
                       mensajero.getString(4));
               listaUsuarios.add(usuVO);
           }
        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaUsuarios;
    }
    
    private void deneterConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}