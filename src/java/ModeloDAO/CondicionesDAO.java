/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CondicionesVO;
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
public class CondicionesDAO extends ConexionBd implements Crud {
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    //variables para las opereaciones
    private boolean operacion = false;
    private String sql;
    //declarar las variables para la infromacion
    private String idCondicion= "",
            idRespuesta = "",
            nombre = "",
            fechaNacimiento = "",
            tipoDocumento= "",
            numDocumento = "",
            direccion = "",
            celular= "",
            profesion= "",
            trabajo= "",
            correo= "";
    
    public CondicionesDAO() {
    }

    public CondicionesDAO( CondicionesVO conVo) {
        super();
         {
            conexion = this.obtenerConexion();
            idCondicion = conVo.getIdCondicion();
            idRespuesta= conVo.getIdRespuesta();
            nombre= conVo.getNombre();
            fechaNacimiento = conVo.getFechaNacimiento();
            tipoDocumento= conVo.getTipoDocumento();
            numDocumento= conVo.getNumDocumento();
            direccion= conVo.getDireccion();
            celular= conVo.getCelular();
            profesion= conVo.getProfesion();
            trabajo = conVo.getTrabajo();
            correo= conVo.getCorreo();

        }// catch (Exception e) {
           // Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
       // }
   }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "insert into condiciones values(?,?,?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idCondicion);
            puente.setString(2, idRespuesta);
            puente.setString(3, nombre);
            puente.setString(4, fechaNacimiento );
            puente.setString(5, tipoDocumento);
            puente.setString(6, numDocumento);
            puente.setString(7, direccion);
            puente.setString(8, celular);
            puente.setString(9, profesion);
            puente.setString(10,trabajo);
            puente.setString(11,correo);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally  {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "update condiciones set  idRespuesta=?, nombre=?, fechaNacimiento=?,  tipoDocumento=?,direccion=?, celular=?, profesion=?, trabajo=?, correo=?  where numDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idCondicion);
            puente.setString(2, idRespuesta);
            puente.setString(3, nombre);
            puente.setString(4, fechaNacimiento );
            puente.setString(5, tipoDocumento);
            puente.setString(6, numDocumento);
            puente.setString(7, direccion);
            puente.setString(8, celular);
            puente.setString(9, profesion);
            puente.setString(10,trabajo);
            puente.setString(11,correo);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally  {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    public CondicionesVO consultarSolicitud (String Solicitud){
        CondicionesVO conVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from condiciones where numDocumento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Solicitud);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

                conVO =new CondicionesVO(
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
                        mensajero.getString(11));
            }

        } catch (SQLException e) {
            Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally    {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conVO;
    }

    public ArrayList<CondicionesVO> listar() {
        ArrayList<CondicionesVO> listaCondiciones = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from condiciones;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {

              CondicionesVO  conVO = new CondicionesVO(   
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
                        mensajero.getString(11));
              listaCondiciones.add(conVO);
              
            }

        } catch (SQLException e) {
            Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally  {
            try 
            {
                this.cerrarConexion();
            } catch (SQLException e) 
            {
                Logger.getLogger(CondicionesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaCondiciones;
    }


    
    

    

}