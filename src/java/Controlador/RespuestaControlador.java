/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.RespuestaDAO;
import ModeloVO.RespuestaVO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriela Moron
 */
@WebServlet(name = "RespuestaControlador", urlPatterns = {"/Respuesta"})
public class RespuestaControlador extends HttpServlet {

    List<RespuestaVO> lista = new ArrayList<>();

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
        String idRespuesta = request.getParameter("textIdRespuesta");
        String idPregunta = request.getParameter("textIdPregunta");
        String idUsuario = request.getParameter("textUsuario");
        String respuesta = request.getParameter("textRespuesta");
        String estadoRespuesta = request.getParameter("txtEstadoR");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2.instanciar VO // infromacion
        RespuestaVO resVO = new RespuestaVO(idRespuesta, idPregunta, idUsuario, respuesta, estadoRespuesta);

        //3. instanciar Dao //opereaciones
        RespuestaDAO resDAO = new RespuestaDAO(resVO);

        //4. administrar operaciones
        switch (opcion) {

            case 1: //agregar registro
                String pregunta = request.getParameter("textIdPregunta");
                String respuesta2 = request.getParameter("textRespuesta");
                resVO = new RespuestaVO();
                resVO.setIdPregunta(pregunta);
                resVO.setRespuesta(respuesta2);
                lista.add(resVO);
                request.setAttribute("lista", lista);

            case 6:
                for (int i = 0; i < lista.size(); i++) {
                    resVO = new RespuestaVO();
                    resVO.setIdPregunta(lista.get(i).getIdPregunta());
                    resVO.setRespuesta(lista.get(i).getRespuesta());
                    resDAO.guardarRegistro(resVO);

                }
                request.getRequestDispatcher("formulario.jsp").forward(request, response);
                break;

            case 2: //actualizar registro
                if (resDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La Respuesta se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La Respuesta no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarRespuesta.jsp").forward(request, response);
                break;

            case 3:

                resVO = resDAO.consultarID(idRespuesta);
                if (resVO != null) {
                    request.setAttribute("datosConsultados", resVO);
                    request.getRequestDispatcher("consultarRespuesta.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarRespuesta.jsp").forward(request, response);
                }
                break;

            case 5: //eliminarar registro
                if (resDAO.eliminarRegistro()) {
                    request.setAttribute("MensajeExito", "La Respuesta esta adoptada ahora");
                } else {
                    request.setAttribute("MensajeError", "La Respuesta no se pudo adoptar");
                }
                request.getRequestDispatcher("consultarRespuesta.jsp").forward(request, response);
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
