package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.MascotaVO;
import java.util.ArrayList;
import ModeloDAO.MascotaDAO;
import ModeloVO.UsuarioVO;

public final class perfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/sesiones1.jsp");
    _jspx_dependants.add("/logoPestaña.jsp");
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
      out.write("                                        <li><a href=\"#modulos\">Solicitud</a></li>\n");
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
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("\n");
      out.write("        ");

            MascotaVO masVO = new MascotaVO();
            MascotaDAO masDAO = new MascotaDAO();
            ArrayList<MascotaVO> listaMascotas = masDAO.listar();
            for (int i = 0; i < listaMascotas.size(); i++) {

                masVO = listaMascotas.get(i);

        
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"tarjeta-wrap\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-6 col-sm-4\">\n");
      out.write("                <div class=\"tarjeta\">\n");
      out.write("                    <div class=\"adelante card1\">\n");
      out.write("                        <img class=\"im\" src=\"");
      out.print(masVO.getUrl());
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                        <a class=\"nom\">");
      out.print(masVO.getNombre());
      out.write("</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"atras\">\n");
      out.write("\n");
      out.write("                        <p class=\"ad\">");
      out.print(masVO.getRaza());
      out.write(" <br>\n");
      out.write("                            ");
      out.print(masVO.getEdad());
      out.write(" años <br>\n");
      out.write("\n");
      out.write("                            ");
      out.print(masVO.getEstadoMascota());
      out.write("</p>\n");
      out.write("                        <form method=\"post\" action=\"Formulario\">\n");
      out.write("                            <button name=\"textIdMascota\" value=\"");
      out.print(masVO.getIdMascota());
      out.write('"');
      out.write('>');
      out.print(masVO.getIdMascota());
      out.write("</button>\n");
      out.write("                            <input type=\"text\" name=\"opcion\" value=\"4\">\n");
      out.write("                       </form>\n");
      out.write(" \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                            ");
            if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .tarjeta-wrap {\n");
      out.write("                width: 327px;\n");
      out.write("                margin-left: 4rem;\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: inline-flex;\n");
      out.write("                -webkit-box-pack: center;\n");
      out.write("                -ms-flex-pack: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                flex-direction: row;\n");
      out.write("                margin-right: -38px;\n");
      out.write("                -webkit-perspective: 800;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tarjeta{\n");
      out.write("                width: 274px;\n");
      out.write("                height: 318px;\n");
      out.write("                background: #ffffff;\n");
      out.write("                position: relative;\n");
      out.write("                -webkit-transform-style: preserve-3d;\n");
      out.write("                transform-style: preserve-3d;\n");
      out.write("                -webkit-transition: .7s ease;\n");
      out.write("                transition: .7s ease;\n");
      out.write("                -webkit-box-shadow: 0px 10px 15px -5px rgb(0 0 0 / 65%);\n");
      out.write("                box-shadow: 2px 4px -2px 2px rgb(22 180 255 / 32%);\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                margin-left: 2rem;\n");
      out.write("                margin-bottom: 3rem;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .ad{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            .adelante, .atras{\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                -webkit-backface-visibility: hidden;\n");
      out.write("                backface-visibility: hidden;\n");
      out.write("                border-radius: 1rem;\n");
      out.write("            }\n");
      out.write("            .im{\n");
      out.write("                border-radius: 1rem;\n");
      out.write("                width: 100%;\n");
      out.write("               filter: brightness(49%);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .adelante{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .nom{\n");
      out.write("                color: snow;\n");
      out.write("                font-size: 2rem;\n");
      out.write("                justify-content: center;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-left: 0rem;\n");
      out.write("            }\n");
      out.write("            .atras{\n");
      out.write("                -webkit-transform: rotateY(180deg);\n");
      out.write("                transform: rotateY(180deg);\n");
      out.write("\n");
      out.write("                padding: 15px;\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                -webkit-box-pack: center;\n");
      out.write("                -webkit-justify-content: center;\n");
      out.write("                -ms-flex-pack: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                -webkit-box-align: center;\n");
      out.write("                -webkit-align-items: center;\n");
      out.write("                -ms-flex-align: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff;\n");
      out.write("                font-family: \"open sans\";\n");
      out.write("                background: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tarjeta-wrap:hover .tarjeta{\n");
      out.write("                -webkit-transform: rotateY(180deg);\n");
      out.write("                transform: rotateY(180deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card1{\n");
      out.write("\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color:#000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style> \n");
      out.write("        ");
}
      out.write("\n");
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
