/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PreguntaVO;
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
 * @author Gabriela Moron
 */
public class PreguntaDAO extends ConexionBd implements Crud  {
      //1. Declarar

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idPregunta="",idUsuario="",nombre="",descripcion="";
 

    public PreguntaDAO() {
    }
    
    //2. Método principal para recibir datos del VO
    public PreguntaDAO(PreguntaVO preVO) {
        super();
        //2.1 Conectarse
        try {
            conexion = this.obtenerConexion();

            //2.2 Traigo los datos del VO
            idPregunta = preVO.getIdPregunta();
            idUsuario = preVO.getIdUsuario();
            nombre = preVO.getNombre();
            descripcion= preVO.getDescripcion();
          
        } catch (Exception e) 
        {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {

        try {
            sql = "insert into pregunta (idUsuario,nombre,descripcion) VALUES (?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idUsuario);
            puente.setString(2, nombre);
            puente.setString(3, descripcion);
           
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally 
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "UPDATE pregunta SET idUsuario=1, nombre=?, descripcion=? WHERE idPregunta=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nombre);
            puente.setString(2, descripcion);
            puente.setString(3, idPregunta);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    
    
    
    
    
  public boolean eliminarRegistro(String idPregunta) {
        try {
            sql = "DELETE FROM `pregunta` WHERE idPregunta=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idPregunta);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
    
    
    public PreguntaVO consultarID(String idpregunta) {
        PreguntaVO preVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from pregunta where idPregunta = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idPregunta);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                preVO = new PreguntaVO(mensajero.getString(3), mensajero.getString(4));
            }
        } catch (Exception e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return preVO;
    }
    
   public ArrayList <PreguntaVO>listar()
    {
        ArrayList<PreguntaVO>listaPreguntas = new ArrayList<>();
        
        try 
        {
            conexion = this.obtenerConexion();
            //SELECT usuario.correoUsuario, pregunta.nombre, pregunta.edad, pregunta.raza, pregunta.tipo, pregunta.estadopregunta FROM pregunta INNER JOIN usuario ON pregunta.idUsuario = usuario.idUsuario/
           sql = "SELECT pregunta.idPregunta, usuario.correoUsuario,  pregunta.nombre, pregunta.descripcion FROM pregunta INNER JOIN usuario ON pregunta.idUsuario = usuario.idUsuario";
           puente = conexion.prepareStatement(sql);
           mensajero = puente.executeQuery();
           while(mensajero.next())
           {
               PreguntaVO preVO = new PreguntaVO(
                       mensajero.getString(1),
                       mensajero.getString(2),
                       mensajero.getString(3),
                       mensajero.getString(4));
               listaPreguntas.add(preVO);
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
        return listaPreguntas;
    }
   
   
}