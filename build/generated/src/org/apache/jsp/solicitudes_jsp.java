package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class solicitudes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("        <title>CONDICIONES</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("  <body>\n");
      out.write("  <br>\n");
      out.write("   \n");
      out.write("     <div class=\"form\">\n");
      out.write("         <h3>Registrar CONDICIONES</h3>\n");
      out.write("        <form method=\"post\" action=\"Condiciones\" >\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-10\">\n");
      out.write("                    <label for=\"inputEmail4\">Respuesta </label><br>\n");
      out.write("                    <input type=\"numeric\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"respuesta\" name=\"textidres\"><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-10\">\n");
      out.write("                    <label for=\"inputEmail4\">Nombre </label><br>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Nombre\" name=\"textnombrecon\"><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <br>\n");
      out.write("               <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">Fecha de nacimiento</label><br>\n");
      out.write("                <input type=\"date\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Fecha de nacimiento\" name=\"textfechana\"><br>\n");
      out.write("            </div>\n");
      out.write("              <br>\n");
      out.write("          \n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">tipo Documento</label><br>\n");
      out.write("                 <input type=\"text\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"tipo documento\" name=\"texttipdoc\"><br>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write(" <br>\n");
      out.write(" <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputEmail4\">numero documento</label><br>\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"numero documento\" name=\"textnumdoc\"><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write(" <br>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">Correo electronico</label><br>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"inputZip\" name=\"textcorreo\" placeholder=\"correo\"><br>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" <br>\n");
      out.write("  <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">profesión</label><br>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputZip\" name=\"textprofesion\" placeholder=\"profesión\"><br>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" <br>\n");
      out.write("  <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">direccion</label><br>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputZip\" name=\"textdireccion\" placeholder=\"direccion\"><br>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" <br>\n");
      out.write("  <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">trabajo</label><br>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputZip\" name=\"texttrabajo\" placeholder=\"trabajo\"><br>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write(" <br>\n");
      out.write("            <div class=\"form-group col-md-10\">\n");
      out.write("                <label for=\"inputZip\">Número celular</label><br>\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"inputZip\" name=\"textcel\" placeholder=\"textcel\"><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <br>\n");
      out.write("            <button class=\"waves-effect waves-light btn\">Registrar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("            \n");
      out.write("     \n");
      out.write("              \n");
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
      out.write("         \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("    <br\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
      out.write("</body>\n");
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
