/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CondicionesDAO;
import ModeloVO.CondicionesVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriela Moron
 */
@WebServlet(name = "CondicionesControlador", urlPatterns = {"/Condiciones"})
public class CondicionesControlador extends HttpServlet {

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
         // 1. Recibir datos de las vistas
        String idCondicion= request.getParameter("textdocidcon");
        String idRespuesta = request.getParameter("textidres");
        String nombre = request.getParameter("textnombrecon");
        String fechaNacimiento = request.getParameter("textfechana");
        String tipoDocumento= request.getParameter("texttipdoc");
        String numDocumento = request.getParameter("textnumdoc");
        String direccion = request.getParameter("textdireccion");
        String celular= request.getParameter("textcel");
        String profesion = request.getParameter("textprofesion");
        String trabajo = request.getParameter("texttrabajo");
        String correo = request.getParameter("textcorreo");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. ¿Quién tiene los datos de forma segura? VO
        CondicionesVO conVO = new CondicionesVO(idCondicion,
                idRespuesta,
                nombre,
                fechaNacimiento,
                tipoDocumento,
                numDocumento,
                direccion,
                celular,
                profesion,
                trabajo,
                correo);

        //3. ¿Quién hace las operaciones? DAO
        CondicionesDAO conDAO = new CondicionesDAO(conVO);

          
          //4. administrar operaciones
         switch (opcion)
         {
            case 1:  //agregar registro
                if (conDAO.agregarRegistro())
                {
                    request.setAttribute("MensajeExito", "La condicion se registro");
                }
                else
                {
                    request.setAttribute("MensajeError", "La condicion no se pudo registrar");
                }
                request.getRequestDispatcher("solicitudes.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (conDAO.actualizarRegistro())
                {
                    request.setAttribute("MensajeExito", "La mascota se actualizo");
                }
                else
                {
                    request.setAttribute("MensajeError", "La mascota no se pudo actualizar");
                }
                request.getRequestDispatcher("actualizarMascota.jsp").forward(request, response);
                break;
             

        }
    }
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
        {
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
            throws ServletException, IOException
        {
            processRequest(request, response);
        }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo()
        {
            return "Short description";
        }// </editor-fold>
}
