/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.FormularioVO;
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
public class FormularioDAO extends ConexionBd implements Crud {

    //1. Declarar
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    String idFormulario = "", idUsuario = "", p1 = "", p2 = "", p3 = "", p4 = "", p5 = "", p6 = "", p7 = "", p8 = "", p9 = "", p10 = "", estadoFormulario = "", fechaRegistro = "";

    public FormularioDAO() {
    }

    public FormularioDAO(FormularioVO formVO) {
        super();
        try {
            conexion = this.obtenerConexion();
            idFormulario = formVO.getIdFormulario();
            idUsuario = formVO.getIdUsuario();
            p1 = formVO.getP1();
            p2 = formVO.getP2();
            p3 = formVO.getP3();
            p4 = formVO.getP4();
            p5 = formVO.getP5();
            p6 = formVO.getP6();
            p7 = formVO.getP7();
            p8 = formVO.getP8();
            p9 = formVO.getP9();
            p10 = formVO.getP10();
            estadoFormulario = formVO.getEstadoFormulario();
            fechaRegistro = formVO.getFechaRegistro();

        } catch (Exception e) {
            Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregarRegistro() {
        try {
            sql = "INSERT INTO formulario(idUsuario,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,estadoFormulario,fechaRegistro) VALUES (5,?,?,?,?,?,?,?,?,?,?,'Pendiente', NOW());";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, p1);
            puente.setString(2, p2);
            puente.setString(3, p3);
            puente.setString(4, p4);
            puente.setString(5, p5);
            puente.setString(6, p6);
            puente.setString(7, p7);
            puente.setString(8, p8);
            puente.setString(9, p9);
            puente.setString(10, p10);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            sql = "UPDATE formulario SET estadoFormulario='Pendiente' WHERE estadoFormulario=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, estadoFormulario);
            puente.executeUpdate();
            operacion = true;
        } catch (SQLException e) {
            Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public ArrayList<FormularioVO> listar() {
        ArrayList<FormularioVO> listaFormulario = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT usuario.correoUsuario,usuario.nombre,usuario.apellido, formulario.p1, formulario.p2, formulario.p3,formulario.p4,formulario.p5,formulario.p6,formulario.p7,formulario.p8,formulario.p9,formulario.p10,formulario.estadoFormulario, formulario.fechaRegistro FROM formulario INNER JOIN usuario ON formulario.idUsuario = usuario.idUsuario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                FormularioVO formVO = new FormularioVO(
                        mensajero.getString(1),
                        mensajero.getString(2),
                        mensajero.getString(3),
                        mensajero.getString(4),
                        mensajero.getString(5),
                        mensajero.getString(7),
                        mensajero.getString(8),
                        mensajero.getString(9),
                        mensajero.getString(10),
                        mensajero.getString(11),
                        mensajero.getString(12),
                        mensajero.getString(13),
                        mensajero.getString(14),
                        mensajero.getString(15));

                listaFormulario.add(formVO);
            }
        } catch (SQLException e) {
            Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaFormulario;
    }

    public FormularioVO consultarID(String idFormulario) {
        FormularioVO formVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from Formulario where idFormulario = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idFormulario);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                formVO = new FormularioVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(7),
                        mensajero.getString(8),
                        mensajero.getString(9),
                        mensajero.getString(10),
                        mensajero.getString(11),
                        mensajero.getString(12),
                        mensajero.getString(13),
                        mensajero.getString(14),
                        mensajero.getString(15));
            }
        } catch (Exception e) {
            Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(FormularioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return formVO;
    }
}


