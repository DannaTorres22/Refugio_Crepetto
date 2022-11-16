package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;

public final class registrarMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
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
      out.write("      \n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-area \">\n");
      out.write("            <div id=\"sticky-header\" class=\"main-header-area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-3\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"index.html\">\n");
      out.write("                                    <img src=\"logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-9 col-lg-9\">\n");
      out.write("                            <div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("                                <nav>\n");
      out.write("                                    <ul id=\"navigation\">\n");
      out.write("                                        <li><a  href=\"dashboard.jsp\">Inicio</a></li>\n");
      out.write("                                        <li><a href=\"index.jsp\">Cerrar sesión</a></li>\n");
      out.write("\n");
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
      out.write("    <title>Registrar Mascota</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"form\" >\n");
      out.write("        <a href=\"consultarMascota.jsp\" class=\"btn btn-info\" >Consultar mascota</a><br><br>\n");
      out.write("        <h3>Registrar Mascota</h3>\n");
      out.write("        <form method=\"post\" action=\"Mascota\" onsubmit=\"return validar()\">\n");
      out.write("                <input name=\"textIdUsuario\" class=\"form-control\" id=\"usuario\" type=\"hidden\" >\n");
      out.write("                <input type=\"hidden\" class=\"form-control\" id=\"fecha\" placeholder=\"Fecha de ingreso\" name=\"textFIngreso\" >\n");
      out.write("\n");
      out.write("                <div class=\"form-group col-md-15\">\n");
      out.write("                    <label for=\"inputEmail4\">Nombre de la mascota</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"Nombre de la mascota\" name=\"textNombreM\" >\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"form-group col-md-15\">\n");
      out.write("                    <label for=\"inputEmail4\">Edad</label>\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"edad\" placeholder=\"Edad de la mascota\" name=\"textEdadM\"  maxlength=\"2\">\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                <div class=\"form-group col-md-15\">\n");
      out.write("                    <label for=\"inputEmail4\">Raza de la mascota</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"raza\" placeholder=\"Raza de la mascota\" name=\"textRazaM\" >\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"form-group col-md-15\">\n");
      out.write("                    <label for=\"inputZip\">Tipo de mascota</label>\n");
      out.write("                    <select type=\"text\" class=\"form-control\" id=\"tipo\" placeholder=\"Estado de la mascota\" name=\"textTipoM\" >\n");
      out.write("                        <option value=\"Selecciona..\">Selecciona..</option>\n");
      out.write("                        <option>Perro</option>\n");
      out.write("                        <option>Gato</option>\n");
      out.write("                    </select\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" class=\"form-control\" id=\"estado\" name=\"textEstadoM\" placeholder=\"Estado de la mascota\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <button value=\"1\" name=\"opcion\"  type=\"submit\" id=\"registrar\" class=\"form-control btn btn-primary submit px-3\">Registrar</button>\n");
      out.write("                <input type=\"hidden\" >\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("               \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:not(:disabled):not(.disabled) {\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 10rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <br\n");
      out.write("            </body>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net.npm.sweetalert2@9\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/validacionRMascota.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
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
