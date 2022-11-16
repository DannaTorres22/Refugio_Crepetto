package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.PreguntaVO;

public final class actualizarPregunta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <!-- CSS here -->\n");
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
      out.write("   \n");
      out.write("        <link href=\"css/stylelogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("<header>\n");
      out.write("            <div class=\"header-area \">\n");
      out.write("                <div id=\"sticky-header\" class=\"main-header-area\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row align-items-center\">\n");
      out.write("                            <div class=\"col-xl-3 col-lg-3\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <a href=\"index.html\">\n");
      out.write("                                        <img src=\"logo.png\" alt=\"\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-9 col-lg-9\">\n");
      out.write("                                <div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("                                    <nav>\n");
      out.write("                                        <ul id=\"navigation\">\n");
      out.write("                                            <li><a  href=\"dashboard.html\">Inicio</a></li>\n");
      out.write("                                            <li><a href=\"login.html\">Cerrar sesión</a></li>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("    <body></body>\n");
      out.write("    <div class=\"form\">\n");
      out.write("        <h1>Ver Mascota</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            PreguntaVO preVO = (PreguntaVO) request.getAttribute("datosConsultados");
            String id = String.valueOf(request.getAttribute("idPregunta"));
            if (preVO != null) {
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Pregunta\" onsubmit=\"return validar()\">\n");
      out.write("           \n");
      out.write("                    <input type=\"hidden\" class=\"form-control\" value=\"");
      out.print(id);
      out.write("\"name=\"textIdPregunta\">\n");
      out.write("              \n");
      out.write("                   <div class=\"form-group col-md-10\">\n");
      out.write("                    <label for=\"inputEmail4\">Nombre de la pregunta</label>\n");
      out.write("                    <input type=\"text\" id=\"nombre\" class=\"form-control\" value=\"");
      out.print(preVO.getNombre());
      out.write("\" id=\"nombre\" placeholder=\"Nombre de la pregunta\" name=\"textNombreP\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">Descripción</label>\n");
      out.write("                <input type=\"text\" id=\"edad\" name=\"textDesc\" class=\"form-control\" value=\"");
      out.print(preVO.getDescripcion());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("            <button id=\"actualizar\" class=\"waves-effect waves-light btn\">Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\" id=\"actualizar\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");

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
      out.write("            \n");
      out.write("           \n");
      out.write("             </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <style>\n");
      out.write("        .form{\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .volver{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .volver:hover{\n");
      out.write("            text-decoration: none;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net.npm.sweetalert2@9\"></script>\n");
      out.write("    <script src=\"js/validacionAMascota.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("       \n");
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
