/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.MascotaDAO;
import ModeloVO.MascotaVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julia_000
 */
@WebServlet(name = "MascotaControlador", urlPatterns = {"/Mascota"})
public class MascotaControlador extends HttpServlet {

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
         String idMascota = request.getParameter("textIdMascota");
         String idUsuario = request.getParameter("textIdUsuario");
         String fechaIngreso = request.getParameter("textFIngreso");
         String nombre = request.getParameter("textNombreM");
         String edad = request.getParameter("textEdadM");
         String raza = request.getParameter("textRazaM");
         String tipo = request.getParameter("textTipoM");
         String estadoMascota = request.getParameter("textEstadoM");
        
         
         int opcion = Integer.parseInt(request.getParameter("opcion"));
          
         //2.instanciar VO // infromacion
          MascotaVO masVO = new MascotaVO(idMascota, idUsuario, fechaIngreso, nombre,  edad, raza, tipo, estadoMascota);
          
           //3. instanciar Dao //opereaciones
          MascotaDAO masDAO = new MascotaDAO (masVO);
          
          //4. administrar operaciones
         switch (opcion)
         {
            case 1:  //agregar registro
                if (masDAO.agregarRegistro())
                {
                    request.setAttribute("MensajeExito", "La mascota se registro");
                    }
                else
                {
                    request.setAttribute("MensajeError", "La mascota no se pudo registrar");
                }
                request.getRequestDispatcher("registrarMascota.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (masDAO.actualizarRegistro())
                {
                    request.setAttribute("MensajeExito", "La mascota se actualizo");
                }
                else
                {
                    request.setAttribute("MensajeError", "La mascota no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                break;
             
             case 3:  
               
                masVO = masDAO.consultarID(idMascota);
                if (masVO != null)
                {
                    request.setAttribute("datosConsultados", masVO);
                    request.getRequestDispatcher("actualizarMascota.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                }
                break;
            
            case 5:  //eliminarar registro
                if (masDAO.eliminarRegistro())
                {
                    request.setAttribute("MensajeExito", "La mascota se elimino");
                }
                else
                {
                    request.setAttribute("MensajeError", "La mascota no se pudo eliminar");
                }
                request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
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
