package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.NovedadDAO;
import ModeloVO.NovedadVO;
import ModeloVO.UsuarioVO;

public final class consultarNovedad_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesiones.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/gijgo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("      \n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>sesion admi</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
    
      out.write("\n");
      out.write("    ");

        HttpSession miSesion = (HttpSession) request.getSession();
        String correoUsuario = "";
        if (miSesion.getAttribute("datosUsuario") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            correoUsuario = usuVO.getCorreoUsuario();

        }
    
      out.write("\n");
      out.write("     <body class=\"g-sidenav-show   bg-gray-100\">\n");
      out.write("        <div class=\"min-height-300 bg-primary position-absolute w-100\"></div>\n");
      out.write("        <aside class=\"sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 \" id=\"sidenav-main\">\n");
      out.write("            <div class=\"sidenav-header\">\n");
      out.write("                <i class=\"fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none\" aria-hidden=\"true\" id=\"iconSidenav\"></i>\n");
      out.write("                <a class=\"navbar-brand m-0\" href=\"#\" target=\"_blank\">\n");
      out.write("                    <img src=\"logo.png\" class=\"navbar-brand-img h-100\" alt=\"main_logo\">\n");
      out.write("                      <li class=\"usuario\">");
      out.print(correoUsuario);
      out.write("</li>\n");
      out.write("                                          \n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <hr class=\"horizontal dark mt-0\">\n");
      out.write("            <div class=\"collapse navbar-collapse  w-auto \" id=\"sidenav-collapse-main\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      \n");
      out.write("                        <a class=\"nav-link active\" href=\"./pages/dashboard.html\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-indent text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Inicio</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"./pages/tables.html\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-paw text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Mascotas</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"./pages/billing.html\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-plus-square text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Novedades</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"consultarUsuario.jsp\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-user text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Usuarios</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"./pages/rtl.html\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-bell text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Solicitudes</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link \" href=\"registrarPregunta.jsp\">\n");
      out.write("                            <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                <i class=\"fa fa-pencil text-info text-sm opacity-10\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <span class=\"nav-link-text ms-1\">Formulario</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                              <span><input class=\"btn btn-primaryy submit px-3 cerrar\" type=\"submit\" value=\"Cerrar sesion\"></span>\n");
      out.write("                                            </form>\n");
      out.write("        </aside>\n");
      out.write("        <main class=\"main-content position-relative border-radius-lg \">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl \" id=\"navbarBlur\" data-scroll=\"false\">\n");
      out.write("                <div class=\"container-fluid py-1 px-3\">\n");
      out.write("                  \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- End Navbar -->\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Consultar novedad</title>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <div class=\"form\">\n");
      out.write("            <h1 style=\"font-size: 50px;\">Novedad</h1>\n");
      out.write("            <form method=\"post\" action=\"Novedad\">\n");
      out.write("                <input type=\"text\" name=\"textIdNovedad\" class=\"validate\" placeholder=\"Nombre de la novedad\">\n");
      out.write("                <button class=\"waves-effect waves-light btn\" >Consultar</button>\n");
      out.write("                <input type=\"hidden\" value=\"3\" name=\"opcion\">        \n");
      out.write("                <a href=\"registrarNovedad.jsp\" class=\"btn btn-info\" >Registrar novedad</a><br><br>\n");
      out.write("                <br><br>\n");
      out.write("                ");
            if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table  class=\"striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nombre de la mascota</th>\n");
      out.write("                            <th>Nombre de la novedad</th>\n");
      out.write("                            <th>Descripcion de la novedad</th>\n");
      out.write("                            <th>Fecha Novedad</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            NovedadVO novVO = new NovedadVO();
                            NovedadDAO novDAO = new NovedadDAO();
                            ArrayList<NovedadVO> listaNovedad = novDAO.listar();
                            for (int i = 0; i < listaNovedad.size(); i++) {

                                novVO = listaNovedad.get(i);

                        
      out.write("\n");
      out.write("                    </thead>\n");
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(novVO.getIdMascota());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(novVO.getTipoNovedad());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(novVO.getObservacionNovedad());
      out.write("</td>  \n");
      out.write("                            <td>");
      out.print(novVO.getFechaNovedad());
      out.write("</td>  \n");
      out.write("                            <td><a href=\"\" class=\"waves-effect waves-light btn\">Eliminar</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <style>\n");
      out.write("        .form{\n");
      out.write("            padding: 5%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
