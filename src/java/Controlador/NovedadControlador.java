/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.NovedadDAO;
import ModeloVO.NovedadVO;
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
@WebServlet(name = "NovedadControlador", urlPatterns = {"/Novedad"})
public class NovedadControlador extends HttpServlet {

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
        String idNovedad = request.getParameter("textIdNovedad");
        String idMascota = request.getParameter("textIdMascota");
        String tipoNovedad = request.getParameter("textTipoNovedad");
        String observacionNovedad = request.getParameter("textObservacionNovedad");
        String fechaNovedad = request.getParameter("textFechaNovedad");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2.instanciar VO // infromacion
        NovedadVO novVO = new NovedadVO(idNovedad, idMascota, tipoNovedad, observacionNovedad, fechaNovedad);

        //3. instanciar Dao //opereaciones
        NovedadDAO novDAO = new NovedadDAO(novVO);

        //4. administrar operaciones
        switch (opcion) {
            case 1:  //agregar registro
                if (novDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "La novedad se registro");
                } else {
                    request.setAttribute("MensajeError", "La novedad no se pudo registrar");
                }
                request.getRequestDispatcher("registrarNovedad.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (novDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La novedad se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La novedad no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarNovedad.jsp").forward(request, response);
                break;

            case 3:
                novVO = novDAO.consultarID(idNovedad);
                if (novVO != null) {
                    request.setAttribute("datosConsultados", novVO);
                    request.getRequestDispatcher("actualizarNovedad.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarNovedad.jsp").forward(request, response);
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