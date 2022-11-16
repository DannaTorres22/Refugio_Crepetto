package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.MascotaVO;

public final class verMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ver mascota</title>\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body></body>\n");
      out.write("    <div class=\"form\">\n");
      out.write("        <h1>Ver Mascota</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            MascotaVO masVO = (MascotaVO) request.getAttribute("datosConsultados");
            if (masVO != null) {
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Mascota\">\n");
      out.write("           \n");
      out.write("                \n");
      out.write("             <!--   <div class=\"form-group col-md-10\">\n");
      out.write("                    <label for=\"inputEmail4\">id Mascota</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" value=\"");
      out.write(" name=\"textIdMascota\">\n");
      out.write("                </div>-->\n");
      out.write("                <br>\n");
      out.write("              \n");
      out.write("                   <div class=\"form-group col-md-10\">\n");
      out.write("                    <label for=\"inputEmail4\">Nombre de la mascota</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"");
      out.print(masVO.getNombre());
      out.write(" \"name=\"textNombreM\">\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">edad</label>\n");
      out.write("                <input type=\"text\" name=\"textEdadM\" class=\"form-control\" value=\"");
      out.print(masVO.getEdad());
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">Raza de la mascota</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputZip\" name=\"textRazaM\" value=\"");
      out.print(masVO.getRaza());
      out.write("\" \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">Tipo de mascota</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputZip\" name=\"textTipoM\" value=\"");
      out.print(masVO.getTipo());
      out.write("\" >\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">Estado de la mascota</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputEmail4\" value=\"");
      out.print(masVO.getEstadoMascota());
      out.write("\" name=\"textEstadoM\" >\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            \n");
      out.write("            <button class=\"waves-effect waves-light btn\">Actualizar</button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
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
