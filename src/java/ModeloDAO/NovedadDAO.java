/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.NovedadVO;
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
public class NovedadDAO extends ConexionBd implements Crud {

    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String idNovedad = "", idMascota = "", tipoNovedad = "", observacionNovedad = "", fechaNovedad = "";

    public NovedadDAO() {
    }

    public NovedadDAO(NovedadVO novVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            idNovedad = novVO.getIdNovedad();
            idMascota = novVO.getIdMascota();
            tipoNovedad = novVO.getTipoNovedad();
            observacionNovedad = novVO.getObservacionNovedad();
            fechaNovedad = novVO.getFechaNovedad();

        } catch (Exception e) {
            Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO novedad(idMascota, tipoNovedad,observacion, fechaNovedad) VALUES (?,?,?, NOW());";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idMascota);
            puente.setString(2, tipoNovedad);
            puente.setString(3, observacionNovedad);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "UPDATE novedad SET idMascota=?, tipoNovedad=?, observacion=?, fechaNovedad=NOW() WHERE idNovedad=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idMascota);
            puente.setString(2, tipoNovedad);
            puente.setString(3, observacionNovedad);
            puente.setString(4, idNovedad);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public ArrayList<NovedadVO> listar() {
        ArrayList<NovedadVO> listaNovedad = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT mascota.nombre, novedad.tipoNovedad, novedad.observacion, novedad.fechaNovedad FROM novedad INNER JOIN mascota ON novedad.idMascota = mascota.idMascota;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                NovedadVO novVO = new NovedadVO(
                        mensajero.getString(1),
                        mensajero.getString(2),
                        mensajero.getString(3),
                        mensajero.getString(4));
                listaNovedad.add(novVO);
            }
        } catch (SQLException e) {
            Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaNovedad;
    }

    public NovedadVO consultarID(String idNovedad) {
        NovedadVO novVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from novedad where idNovedad = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idNovedad);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                novVO = new NovedadVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));
            }
        } catch (Exception e) {
            Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(NovedadDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return novVO;
    }
}