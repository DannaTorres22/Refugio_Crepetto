package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.PreguntaDAO;
import ModeloVO.PreguntaVO;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.MascotaVO;
import java.util.ArrayList;
import ModeloDAO.MascotaDAO;

public final class verFormulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("\n");
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
      out.write("    <body>      \n");
      out.write("    <div class=\"form\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("        <h1 style=\"font-size: 50px;\">Formulario <a href=\"registrarPregunta.jsp\" class=\"mas form-control btn btn-primary submit px-3\">+</a></h1>   \n");
      out.write("        <button  value=\"2\" name=\"opcion\" class=\"mas form-control btn btn-primary submit px-3\">Actualizar</button>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Pregunta\">\n");
      out.write("              ");

                        PreguntaVO preVO = new PreguntaVO();
                       PreguntaDAO preDAO = new PreguntaDAO();
                        ArrayList<PreguntaVO> listaPreguntas = preDAO.listar();
                        for (int i = 0; i < listaPreguntas.size(); i++) {

                            preVO = listaPreguntas.get(i);

                    
      out.write("\n");
      out.write("             <input name=\"textIdUsuario\" class=\"form-control\" id=\"usuario\" type=\"hidden\" >\n");
      out.write("             <div class=\"form-group\" >\n");
      out.write("                 <ol>\n");
      out.write("            <div class=\"form-group col-md-15\">\n");
      out.write("          \n");
      out.write("                <input value=\"");
      out.print(preVO.getNombre());
      out.write("\" type=\"text\"  class=\"form-control\" id=\"inputEmail4\" placeholder=\"nombre\"  name=\"textNombreP\" >\n");
      out.write("          </li>  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-15\">\n");
      out.write("               \n");
      out.write("                <input value=\"");
      out.print(preVO.getDescripcion());
      out.write("\" type=\"text\"  class=\"form-control\" id=\"inputEmail4\" placeholder=\"descripcion \"name=\"textDesc\" >   </div>\n");
      out.write("            </ol>\n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("            <style>\n");
      out.write("                .form{\n");
      out.write("                    padding: 5%;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("                </body>  \n");
      out.write("    <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
