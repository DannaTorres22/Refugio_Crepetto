/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.RespuestaVO;
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
public class RespuestaDAO extends ConexionBd implements Crud 
{
    //1. Declarar

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idRespuesta="", idPregunta="",idUsuario="",respuesta="",estadoRespuesta="";
    private int r;

    public RespuestaDAO() {
    }
    
    //2. Método principal para recibir datos del VO
    public RespuestaDAO(RespuestaVO resVO) {
        super();
        //2.1 Conectarse
        try {
            conexion = this.obtenerConexion();

            //2.2 Traigo los datos del VO
            idRespuesta = resVO.getIdRespuesta();
            idPregunta = resVO.getIdPregunta();
            idUsuario = resVO.getIdUsuario();
            respuesta = resVO.getRespuesta();
            estadoRespuesta = resVO.getEstadoRespuesta();
        } catch (Exception e) 
        {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int guardarRegistro(RespuestaVO resVO){
       try 
        {
            conexion = this.obtenerConexion();
            sql = "insert into respuesta (idPregunta,idUsuario,respuesta,estadoRespuesta) VALUES (?,1,?,'Pendiente')";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, resVO.getIdPregunta());
            puente.setString(2, resVO.getRespuesta());
            puente.executeUpdate();
        } 
        catch (Exception e) 
        {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } 
        return r;
    }
    @Override
  public boolean agregarRegistro() {

        try {
            sql = "insert into respuesta (idPregunta,idUsuario,respuesta,estadoRespuesta) VALUES (?,1,?,'Pendiente')";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idPregunta);
            //puente.setString(2, idUsuario);
            puente.setString(2, respuesta);
            
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally 
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

   @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update Respuesta set estadoRespuesta='Aceptado' where idRespuesta=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idRespuesta);
            puente.setString(2, estadoRespuesta);
           
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    public boolean eliminarRegistro() {
        try {
            sql = "update Respuesta set estadoRespuesta='Rechazado' where idRespuesta=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idRespuesta);
            puente.setString(2, estadoRespuesta);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    
    public RespuestaVO consultarID(String idRespuesta) {
        RespuestaVO resVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from respuesta inner join pregunta on respuesta.idpregunta = pregunta.idpregunta where idRespuesta = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idRespuesta);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                resVO = new RespuestaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4),mensajero.getString(5));
            }
        } catch (Exception e) {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return resVO;
    }
   
   public ArrayList <RespuestaVO>listar()
    {
        ArrayList<RespuestaVO>listaRespuestas = new ArrayList<>();
        
        try 
        {
            conexion = this.obtenerConexion();
           
           sql = "SELECT Respuesta.idRespuesta, pregunta.idPregunta, Respuesta.respuesta,Respuesta.estadoRespuesta FROM Respuesta INNER JOIN pregunta ON Respuesta.idPregunta = pregunta.idPregunta where estadoRespuesta='Disponible'";
           puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           while(mensajero.next())
           {
               RespuestaVO resVO = new RespuestaVO(
                       mensajero.getString(1),
                       mensajero.getString(2),
                       mensajero.getString(3),
                       mensajero.getString(4),
                       mensajero.getString(5));
       
               listaRespuestas.add(resVO);
           }
        } catch (SQLException e) 
        {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaRespuestas;
    }}



