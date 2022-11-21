/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.MascotaDAO;
import ModeloDAO.MascotaDAO;
import ModeloVO.MascotaVO;
import ModeloVO.MascotaVO;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *
 * @author julia_000
 */
@WebServlet(name = "MascotaControlador", urlPatterns = {"/Mascota"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
        maxFileSize = 1024 * 1024 * 10, // 10 MB
        maxRequestSize = 1024 * 1024 * 100 // 100 MB
)
public class MascotaControlador extends HttpServlet {

    private final static Logger LOGGER
            = Logger.getLogger(MascotaControlador.class.getCanonicalName());
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //2.instanciar VO // infromacion
    //3. instanciar Dao //opereaciones
    MascotaDAO masDAO = new MascotaDAO();
    MascotaVO masVO = new MascotaVO();
    List<MascotaVO> mascotas = new ArrayList<>();

    private String folderMain = "C:\\Users\\julia_000\\Documents\\fotosrefugio";
    private String server = "http://127.0.0.1/";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileUploadException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String idMascota = request.getParameter("textIdMascota");
        String idUsuario = request.getParameter("textIdUsuario");
        String fechaIngreso = request.getParameter("textFIngreso");
        String foto = request.getParameter("textFotoM");
        String nombre = request.getParameter("textNombreM");
        String edad = request.getParameter("textEdadM");
        String raza = request.getParameter("textRazaM");
        String tipo = request.getParameter("textTipoM");
        String estadoMascota = request.getParameter("textEstadoM");

        //2.instanciar VO // infromacion
        MascotaVO masVO = new MascotaVO(idMascota, idUsuario, fechaIngreso, tipo, nombre, edad, raza, tipo, estadoMascota);

        //3. instanciar Dao //opereaciones
        MascotaDAO masDAO = new MascotaDAO(masVO);

        // mascotas = masDAO.listar();
        switch (opcion) {
            case 1:  //agregar registro

                // creating path components for saving the file  
                response.setContentType("text/html;charset=UTF-8");
                // creating path components for saving the file  
                //final String path = request.getParameter("destination");  
                final Part filePart = request.getPart("file");
                final String fileName = getFileName(filePart);

                // declare instances of OutputStream, InputStream, and PrintWriter classes  
                OutputStream otpStream = null;

                InputStream iptStream = null;
                final PrintWriter writer = response.getWriter();

                // try section handles the code for storing file into the specified location  
                try {
                    // initialize instances of OutputStream and InputStream classes  
                    otpStream = new FileOutputStream(new File("C:\\Users\\julia_000\\Downloads\\latest-glassfish\\glassfish4\\glassfish\\domains\\domain1\\docroot" + File.separator + fileName));
                    String url = "http://localhost:8080/" + fileName;
                    masVO.setUrl(url);
                    iptStream = filePart.getInputStream();

                    int read = 0;

                    // initialize bytes array for storing file data  
                    final byte[] bytes = new byte[1024];

                    // use while loop to read data from the file using iptStream and write into  the desination folder using writer and otpStream  
                    while ((read = iptStream.read(bytes)) != -1) {
                        otpStream.write(bytes, 0, read);
                    }

                    System.out.println("ARCHIVO CREADO");
                    //LOGGER.log(Level.INFO, "File{0}being uploaded to {1}", new Object[]{fileName, "C:\\upload\\"}); 
                    request.setAttribute("MensajeExito", "La mascota se registro");
                } // catch section handles the errors   
                catch (FileNotFoundException fne) {
                    System.out.println(fne);
                    System.out.println("error de cargar archivo");
                    LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}", new Object[]{fne.getMessage()});
                    request.setAttribute("MensajeExito", "La mascota se registro");
                } // finally section will close all the open classes  
                finally {
                    if (otpStream != null) {
                        otpStream.close();
                    }
                    if (iptStream != null) {
                        iptStream.close();
                    }
                    if (writer != null) {
                        writer.close();
                    }
                }

                if (masDAO.agregarRegistro(masVO)) {
                    request.setAttribute("MensajeExito", "La mascota se registro");
                } else {
                    request.setAttribute("MensajeError", "La mascota no se pudo registrar");
                }
                //request.getRequestDispatcher("registrarMascota.jsp").forward(request, response);
                break;

            case 2:  //actualizar registro
                if (masDAO.actualizarRegistro()) {
                    request.setAttribute("MensajeExito", "La mascota se actualizo");
                } else {
                    request.setAttribute("MensajeError", "La mascota no se pudo actualizar");
                }
                request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                break;

            case 3:
                masVO = masDAO.consultarID(idMascota);
                if (masVO != null) {
                    request.setAttribute("datosConsultados", masVO);
                    request.getRequestDispatcher("actualizarMascota.jsp").forward(request, response);
                } else {
                    request.setAttribute("MensajeError", "No hay resultados que coincidan con tu busqueda");

                    request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                }
                break;

            case 5:  //eliminarar registro
                if (masDAO.eliminarRegistro()) {
                    request.setAttribute("MensajeExito", "La mascota esta adoptada ahora");
                } else {
                    request.setAttribute("MensajeError", "La mascota no se pudo adoptar");
                }
                request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                break;
            /*case 6:
                MascotaVO masVO = new MascotaVO();
                MascotaDAO masDAO = new MascotaDAO();
                masVO=masDAO.traerMascota(idMascota);
                if (masVO!= null) {
                    request.setAttribute("MascotaTraida", masVO);
                    request.getRequestDispatcher("registrarRespuestas.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("MensajeError", "La mascota no se llevo ");

                  
                }
                break;*/

        }
        /*  
        //1. datos de la vista
        
        
         
       
          
         //2.instanciar VO // infromacion
          MascotaVO masVO = new MascotaVO(idMascota, idUsuario, fechaIngreso,foto, nombre,  edad, raza, tipo, estadoMascota);
          
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
                    request.setAttribute("MensajeExito", "La mascota esta adoptada ahora");
                }
                else
                {
                    request.setAttribute("MensajeError", "La mascota no se pudo adoptar");
                }
                request.getRequestDispatcher("consultarMascota.jsp").forward(request, response);
                break;    
            

        }*/
    }

    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (FileUploadException ex) {
            Logger.getLogger(MascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(MascotaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     */
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
        try {
            processRequest(request, response);

        } catch (FileUploadException ex) {
            Logger.getLogger(MascotaControlador.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            Logger.getLogger(MascotaControlador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    private String getFileName(final Part part) {
        // get header(content-disposition) from the part  
        final String partHeader = part.getHeader("content-disposition");
        LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);

        // code to get file name from the header  
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        // it will return null when it doesn't get file name in the header   
        return null;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}