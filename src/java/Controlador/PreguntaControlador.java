/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PreguntaDAO;
import ModeloVO.PreguntaVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriela Moron
 */
@WebServlet(name = "PreguntaControlador", urlPatterns = {"/Pregunta"})
public class PreguntaControlador extends HttpServlet {

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
        //1. datos de la vista
        String idPregunta = request.getParameter("textIdPregunta");
        String idUsuario = request.getParameter("textIdUsuario");
        String nombre = request.getParameter("textNombreP");
        String descripcion = request.getParameter("textDesc");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2.instanciar VO // infromacion
        PreguntaVO preVO = new PreguntaVO(idPregunta, idUsuario, nombre, descripcion);

        //3. instanciar Dao //opereaciones
        PreguntaDAO preDAO = new PreguntaDAO(preVO);

        //4. administrar operaciones
        switch (opcion) {
            case 1:  //agregar registro
                if (preDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "La pregunta se registro");
                } else {
                    request.setAttribute("MensajeError", "La pregunta no se pudo registrar");
                }
                request.getRequestDispatcher("registrarPregunta.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (preDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La pregunta se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La pregunta no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarPregunta.jsp").forward(request, response);
                break;

            case 3:

                preVO = preDAO.consultarID(idPregunta);
                if (preVO != null) {
                    request.setAttribute("datosConsultados", preVO);
                    request.setAttribute("idPregunta", idPregunta);

                    request.getRequestDispatcher("actualizarPregunta.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarPregunta.jsp").forward(request, response);
                }
                break;
          
            case 4:  //eliminarar registro
                if (preDAO.eliminarRegistro(idPregunta)) {
                    request.setAttribute("MensajeExito", "La pregunta se elimino");
                } else {
                    request.setAttribute("MensajeError", "La pregunta no se pudo eliminar");
                }
                request.getRequestDispatcher("consultarPregunta.jsp").forward(request, response);
                break; 

        }
    }

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