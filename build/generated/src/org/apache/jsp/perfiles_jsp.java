package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.MascotaVO;
import java.util.ArrayList;
import ModeloDAO.MascotaDAO;

public final class perfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        <link href=\"./css/perfiles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"header-area \">\n");
      out.write("\n");
      out.write("                <div id=\"sticky-header\" class=\"main-header-area\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row align-items-center\">\n");
      out.write("                            <div class=\"col-xl-3 col-lg-3\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <a href=\"index.html\">\n");
      out.write("                                        <img src=\"img/logo.png\" alt=\"\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-9 col-lg-9\">\n");
      out.write("                                <div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("                                    <nav>\n");
      out.write("                                        <ul id=\"navigation\">\n");
      out.write("                                            <li><a href=\"index.html\">Inicio</a></li>\n");
      out.write("                                            <li><a href=\"#nosotros\">Nosotros</a></li>\n");
      out.write("                                            <li><a href=\"#modulos\">Funcionalidades</a></li>\n");
      out.write("                                            <li><a href=\"#ventajas\">Ventajas</a></li>\n");
      out.write("                                            <li><a href=\"contact.html\">Contacto</a></li>\n");
      out.write("                                            <li><a href=\"../login-form-17/index.html\">Iniciar sesión</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                        <a href=\"\"><img src=\"/anipat/img/i logo.png\" alt=\"\"></a>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        ");

            MascotaVO masVO = new MascotaVO();
            MascotaDAO masDAO = new MascotaDAO();
            ArrayList<MascotaVO> listaMascotas = masDAO.listar();
            for (int i = 0; i < listaMascotas.size(); i++) {

                masVO = listaMascotas.get(i);

        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"Cards\">\n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                <img class=\"card-img-top\" src=\"ControladorIMG?idMascota=");
      out.print(masVO.getIdMascota());
      out.write("\" alt=\"Card image cap\" width=\"200\"  >\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">");
      out.print(masVO.getNombre());
      out.write("</h5>\n");
      out.write("                    <p class=\"card-text\">");
      out.print(masVO.getRaza());
      out.write(" <br>\n");
      out.write("                        ");
      out.print(masVO.getEdad());
      out.write(" años <br>\n");
      out.write("                    ");
      out.print(masVO.getTipo());
      out.write("<br>\n");
      out.write("                    ");
      out.print(masVO.getEstadoMascota());
      out.write("</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Adoptar</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
