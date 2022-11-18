/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PersonaDAO;
import ModeloVO.PersonaVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Danna_Bejarano
 */
@WebServlet(name = "PersonaControlador", urlPatterns = {"/Persona"})
public class PersonaControlador extends HttpServlet {

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
        String idPersona = request.getParameter("textIdPersona");
        String idMascota = request.getParameter("textIdMascota");
        String nombresPersona = request.getParameter("textNombresPersona");
        String apellidoPersona = request.getParameter("textApellidoPersona");
        String fechaNacimiento = request.getParameter("textEdadPersona");
        String estadoPersona = request.getParameter("textEstadoPersona");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2.instanciar VO // infromacion
        PersonaVO perVO = new PersonaVO(idPersona, idMascota, nombresPersona, apellidoPersona, fechaNacimiento, estadoPersona);

        //3. instanciar Dao //opereaciones
        PersonaDAO perDAO = new PersonaDAO(perVO);

        //4. administrar operaciones
        switch (opcion) {
            case 1:  //agregar registro
                if (perDAO.agregarRegistro()) {
                    request.setAttribute("MensajeExito", "La persona se registro");
                } else {
                    request.setAttribute("MensajeError", "La persona no se pudo registrar");
                }
                request.getRequestDispatcher("registrarPersona.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (perDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La persona se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La persona no se pudo actualizar");
                }
                request.getRequestDispatcher("actualizarPersona.jsp").forward(request, response);
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
