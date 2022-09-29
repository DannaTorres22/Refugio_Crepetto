/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.MascotaVO;
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
 * @author Sena
 */
public class MascotaDAO extends ConexionBd implements Crud 
{
    //1. Declarar

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idMascota="", idUsuario="", fechaIngreso="", nombre="",  edad="", raza="", tipo="", estadoMascota="";

    public MascotaDAO() {
    }
    
    //2. Método principal para recibir datos del VO
    public MascotaDAO(MascotaVO masVO) {
        super();
        //2.1 Conectarse
        try {
            conexion = this.obtenerConexion();

            //2.2 Traigo los datos del VO
            idMascota = masVO.getIdMascota();
            idUsuario = masVO.getIdUsuario();
            fechaIngreso = masVO.getFechaIngreso();
            nombre = masVO.getNombre();
            edad = masVO.getEdad();
            raza = masVO.getRaza();
            tipo = masVO.getTipo();
            estadoMascota = masVO.getEstadoMascota();
        } catch (Exception e) 
        {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {

        try {
            sql = "insert into mascota (idUsuario, nombre, fechaIngreso, edad, raza, tipo, estadoMascota) VALUES (?,?,NOW(),?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idUsuario);
            puente.setString(2, nombre);
            puente.setString(3, edad);
            puente.setString(4, raza);
            puente.setString(5, tipo);
            puente.setString(6, estadoMascota);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally 
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update mascota set idUsuario=1,fechaIngreso=NOW(),nombre=?, edad=?, raza=?, tipo=?, estadoMascota=? where idMascota=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, edad);
            puente.setString(3, raza);
            puente.setString(4, tipo);
            puente.setString(5, estadoMascota);
            puente.setString(6, idMascota);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    public boolean eliminarRegistro() {
        try {
            sql = "update mascota set estadoMascota='Disponible' where estadoMascota='Adoptado'";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, estadoMascota);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    
    public MascotaVO consultarID(String idMascota) {
        MascotaVO masVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from mascota where idMascota = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idMascota);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                masVO = new MascotaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
            }
        } catch (Exception e) {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return masVO;
    }
    
   public ArrayList <MascotaVO>listar()
    {
        ArrayList<MascotaVO>listaMascotas = new ArrayList<>();
        
        try 
        {
            conexion = this.obtenerConexion();
            /*SELECT usuario.correoUsuario, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario*/
           sql = "SELECT mascota.idMascota, usuario.correoUsuario, mascota.fechaIngreso, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario";
           puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           while(mensajero.next())
           {
               MascotaVO masVO = new MascotaVO(
                       mensajero.getString(1),
                       mensajero.getString(2),
                       mensajero.getString(3),
                       mensajero.getString(4),
                       mensajero.getString(5),
                       mensajero.getString(6),
                       mensajero.getString(7),
                       mensajero.getString(8));
               listaMascotas.add(masVO);
           }
        } catch (SQLException e) 
        {
            Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(MascotaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaMascotas;
    }
   
   
}
