/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.RolDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.RolVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //1. Recibir datos de la vista
        String idUsuario = request.getParameter("textIdUsuario");
        String nombre = request.getParameter("textNombre");
        String apellido = request.getParameter("textApellido");
        String fechaNacimiento = request.getParameter("textFechaNacimiento");
        String tipoDocumento = request.getParameter("textTipoDocumento");
        String numDocumento = request.getParameter("textNumDocumento");
        String direccion = request.getParameter("textDireccion");
        String celular = request.getParameter("textCelular");
         String estadoUsuario = request.getParameter("textEstadoUsuario");
        String correoUsuario = request.getParameter("textCorreoUsuario");
        String password = request.getParameter("textPassword");
        String rolId = request.getParameter("textRolId");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        // id_Usuario , Usuario, Password,id_Rol 
        //2. ¿quien tiene los datos de forma segura? VO
        UsuarioVO usuVO = new UsuarioVO(idUsuario, nombre, apellido, fechaNacimiento, tipoDocumento, numDocumento, direccion, celular, estadoUsuario, correoUsuario, password, rolId);
        //3. ¿quien hace las operaciones? DAO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        //4. administrar operaciones 
        switch (opcion) {

            case 1: //Agregar registro
                if (usuDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario no se registro correctamente");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;
            case 2: //actualizar Registro
                if (usuDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "el usuario se actualizo correctamente");
                } else {
                    request.setAttribute("mensajeError", "el usuario NO se actualizo correctamente");
                }
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;
            case 3: //Iniciar sesion
            {
                if (usuDAO.inicioSesion(correoUsuario, password)) {
                    HttpSession misesion = request.getSession(true);
                    //crear objeto usuarioVO con los datos ingresados por el usuario.
                    usuVO = new UsuarioVO(idUsuario,nombre, apellido, fechaNacimiento, tipoDocumento, numDocumento, direccion, celular, estadoUsuario, correoUsuario, password, rolId);
                    misesion.setAttribute("datosUsuario", usuVO);

                    //Obtiene el rol del usuario
                    String rolId_is = usuDAO.rolId;
                    //condicion 
                    if (rolId_is.equals("1")) // Rol Administrador
                    {
                        request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                    } else if (rolId_is.equals("2")) // Rol Adoptante
                    {
                        request.getRequestDispatcher("formulario.jsp").forward(request, response);
                    }
                } //los datos ingresados no son validos
                else {
                    request.setAttribute("mensajeError", "¡Por favor, verifique sus datos de acceso!");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            }
            break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
