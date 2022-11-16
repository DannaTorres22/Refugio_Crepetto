/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.MascotaVO;
import Util.ConexionBd;
import Util.Crud;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
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
    private Blob mysql;

    private String idMascota="", idUsuario="", fechaIngreso="",foto="",  nombre="",  edad="", raza="", tipo="", estadoMascota="";
    public MascotaDAO() {
    }
    
   public ArrayList <MascotaVO>listar()
    {
        ArrayList<MascotaVO>listaMascotas = new ArrayList<>();
        
        try 
        {
            conexion = this.obtenerConexion();
            /*SELECT usuario.correoUsuario, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario*/
           sql = "SELECT mascota.idMascota, usuario.correoUsuario, mascota.fechaIngreso, mascota.foto, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario where estadoMascota='Disponible'";
           puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           while(mensajero.next())
           {
               MascotaVO masVO = new MascotaVO();
                      masVO.setIdMascota(mensajero.getString(1));
                      masVO.setIdUsuario(mensajero.getString(2));
                      masVO.setFechaIngreso(mensajero.getString(3));
                      masVO.setFoto(mensajero.getBinaryStream(4));
                      masVO.setNombre(mensajero.getString(5));
                      masVO.setEdad(mensajero.getString(6));
                      masVO.setRaza(mensajero.getString(7));
                      masVO.setTipo(mensajero.getString(8));
                      masVO.setEstadoMascota(mensajero.getString(9));
               
                      
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
   
   public void listarImg(String idMascota, HttpServletResponse response){
       String sql="select * from mascota where idMascota="+idMascota;
       InputStream inputStream=null;
       OutputStream outputStream=null;
       BufferedInputStream bufferedInputStream=null;
       BufferedOutputStream bufferedOutputStream=null;
       try {
           outputStream=response.getOutputStream();
           conexion = this.obtenerConexion();
            puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           if (mensajero.next()) { 
               inputStream=mensajero.getBinaryStream("foto");
  
           }
           bufferedInputStream=new BufferedInputStream(inputStream);
           bufferedOutputStream=new BufferedOutputStream(outputStream);
           int i=0;
           while ((i=bufferedInputStream.read())!=-1) {               
               bufferedOutputStream.write (i);
           }
       } catch (Exception e) {
       }
   }
    
    //2. Método principal para recibir datos del VO
   /*
    public MascotaDAO(MascotaVO masVO) {
        super();
        //2.1 Conectarse
        try {
            conexion = this.obtenerConexion();

            //2.2 Traigo los datos del VO
            idMascota = masVO.getIdMascota();
            idUsuario = masVO.getIdUsuario();
            fechaIngreso = masVO.getFechaIngreso();
            foto = masVO.getFoto();
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
*/
    @Override
    public boolean agregarRegistro() {

        try {
            sql = "insert into mascota (idUsuario, fechaIngreso,nombre,foto edad, raza, tipo, estadoMascota) VALUES (1,NOW(),?,?,?,?,'Disponible')";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, foto);
            puente.setString(3, edad);
            puente.setString(4, raza);
            puente.setString(5, tipo);
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
            sql = "update mascota set estadoMascota='Adoptado' where idMascota=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, estadoMascota);
            puente.setString(2, idMascota);
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
                        mensajero.getString(3), mensajero.getBinaryStream(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),mensajero.getString(9));
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
   
    /*
   public ArrayList <MascotaVO>listar()
    {
        ArrayList<MascotaVO>listaMascotas = new ArrayList<>();
        
        try 
        {
            conexion = this.obtenerConexion();
            /*SELECT usuario.correoUsuario, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario  
           sql = "SELECT mascota.idMascota, usuario.correoUsuario, mascota.fechaIngreso, mascota.foto, mascota.nombre, mascota.edad, mascota.raza, mascota.tipo, mascota.estadoMascota FROM mascota INNER JOIN usuario ON mascota.idUsuario = usuario.idUsuario where estadoMascota='Disponible'";
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
                       mensajero.getString(8),
                       mensajero.getString(9)
                       );
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
     */
 
}
