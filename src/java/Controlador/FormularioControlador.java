/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.FormularioDAO;
import ModeloVO.FormularioVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author julia_000
 */
@WebServlet(name = "FormularioControlador", urlPatterns = {"/Formulario"})
public class FormularioControlador extends HttpServlet {

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
       String idFormulario = request.getParameter("textIdFormulario");
        String idUsuario = request.getParameter("textIdUsuario");
          String idMascota = request.getParameter("textIdMascota");
        String p1 = request.getParameter("textP1");
        String p2 = request.getParameter("textP2");
        String p3 = request.getParameter("textP3");
        String p4 = request.getParameter("textP4");
        String p5 = request.getParameter("textP5");
        String p6 = request.getParameter("textP6");
        String p7 = request.getParameter("textP7");
        String p8 = request.getParameter("textP8");
        String p9 = request.getParameter("textP9");
        String p10 = request.getParameter("textP10");
        String estadoFormulario = request.getParameter("textEstadoFormulario");
        String fechaRegistro = request.getParameter("textFechaRegistro");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2.instanciar VO // infromacion
        FormularioVO formVO = new FormularioVO(idFormulario, idUsuario, idMascota, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, estadoFormulario, fechaRegistro);

        //3. instanciar Dao //opereaciones
        FormularioDAO formDAO = new FormularioDAO(formVO);

        //4. administrar operaciones
        switch (opcion) {
            case 1:  //agregar registro
                if (formDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "La Formulario se registro");
                } else {
                    request.setAttribute("MensajeError", "La Formulario no se pudo registrar");
                }
                request.getRequestDispatcher("registrarRespuestas.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (formDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La Formulario se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La Formulario no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarFormulario.jsp").forward(request, response);
                break;

            case 3:
                formVO = formDAO.consultarID(idFormulario);
                if (formVO != null) {
                    request.setAttribute("datosConsultados", formVO);
                    request.getRequestDispatcher("actualizarFormulario.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarFormulario.jsp").forward(request, response);
                }
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