/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PersonaVO;
import Util.ConexionBd;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danna_bejarano
 */
public class PersonaDAO extends ConexionBd implements Crud
{
    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idPersona = "",
            idMascota = "",
            nombresPersona = "",
            apellidoPersona = "",
            fechaNacimiento = "",
            estadoPersona = "";

    public PersonaDAO() {
    }
    public PersonaDAO(PersonaVO perVO){
        super();
        try 
        {
            conexion = this.obtenerConexion();
            idPersona = perVO.getIdPersona();
            idMascota = perVO.getIdMascota();
            nombresPersona = perVO.getNombresPersona();
            apellidoPersona = perVO.getApellidoPersona();
            fechaNacimiento = perVO.getFechaNacimiento();
            estadoPersona = perVO.getEstadoPersona();
            
        } catch (Exception e) 
        {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
 @Override
    public boolean agregarRegistro() 
    {
        try 
        {
            sql = "insert into persona values (?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idPersona);
            puente.setString(2, idMascota);
            puente.setString(3, nombresPersona);
            puente.setString(4, apellidoPersona);
            puente.setString(5, fechaNacimiento);
            puente.setString(6, estadoPersona);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() 
    {
        try 
        {
            sql = "update persona set nombresPersona=?, apellidoPersona=?, fechaNacimiento=?, estadoPersona=? where idPersona=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idPersona);
            puente.setString(2, idMascota);
            puente.setString(3, nombresPersona);
            puente.setString(4, apellidoPersona);
            puente.setString(5, fechaNacimiento);
            puente.setString(6, estadoPersona);
          
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) 
        {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally 
        {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }
}
