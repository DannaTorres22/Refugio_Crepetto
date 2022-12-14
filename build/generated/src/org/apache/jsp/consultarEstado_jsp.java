package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.FormularioDAO;
import ModeloVO.FormularioVO;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import java.util.ArrayList;
import ModeloVO.UsuarioVO;

public final class consultarEstado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/logoPestaña.jsp");
    _jspx_dependants.add("/sesiones1.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("           <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/logo-img.png\">\n");
      out.write("        <title>Crepetto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
      out.write("           <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/logo-img.png\">\n");
      out.write("        <title>Crepetto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/logo-img.png\">\n");
      out.write("        <!-- Place favicon.ico in the root directory -->\n");
      out.write("\n");
      out.write("        <!-- CSS here -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
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
      out.write("        <link href=\"css/argon-dashboard.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Sesion adoptante</title>\n");
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
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-area \">\n");
      out.write("\n");
      out.write("            <div id=\"sticky-header\" class=\"main-header-area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3\">\n");
      out.write("                            <a class=\"navbar-brand m-0\" href=\"#\" target=\"_blank\">\n");
      out.write("                                <img src=\"logo.png\" class=\"imgsesion\" alt=\"main_logo\">\n");
      out.write("                            \n");
      out.write("                                <p class=\"nomus\">");
      out.print(correoUsuario);
      out.write("</p>\n");
      out.write("                              \n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-9 col-lg-9\">\n");
      out.write("                            <div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("                                <nav>\n");
      out.write("                                    <ul id=\"navigation\">\n");
      out.write("                                        <li><a href=\"dashboardA.jsp\">Inicio</a></li>\n");
      out.write("                                        <li><a href=\"perfiles.jsp\">Mascotas</a></li>\n");
      out.write("                                        <li><a href=\"consultarEstado.jsp\">Solicitud</a></li>\n");
      out.write("\n");
      out.write("                                        <li><form method=\"post\" action=\"Sesiones\">\n");
      out.write("                                                <span><input class=\"btn btn-primary submit px-3 cerrar\" type=\"submit\" value=\"Cerrar sesion\"></span>\n");
      out.write("                                            </form></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
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
      out.write("        <link href=\"css/stylelogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Nucleo Icons -->\n");
      out.write("        <link href=\"./assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"./assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"./assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("          <link id=\"pagestyle\" href=\"css/argon-dashboard.css\" rel=\"stylesheet\" />\n");
      out.write("        <title>Formulario</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form\"> <h1>Ver estado de mi solicitud</h1><br>\n");
      out.write("            <form method=\"post\" action=\"Formulario\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-6 col-md-4\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <span class=\"input-group-text text-body\"><i class=\"fas fa-search\" aria-hidden=\"true\"></i></span>\n");
      out.write("                            <input type=\"text\" name=\"textIdFormulario\" class=\"form-control validate\" placeholder=\"Identificador de la solicitud\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <button class=\"waves-effect waves-light btn\" >Consultar</button>\n");
      out.write("                        <input type=\"hidden\" value=\"6\" name=\"opcion\">     \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("   <img class=\"fondo\" src=\"img/fondoEstado.jpeg\" alt=\"\"/>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        ");
            if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("        ");
 } else {
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .form{\n");
      out.write("                padding: 5%;\n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:not(:disabled):not(.disabled) {\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 10rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .fondo{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <script src=\"js/modalFormulario.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net.npm.sweetalert2@9\"></script>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- JavaScript Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
