package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- CSS only -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("        <title>Registrar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"Usuario\" class=\"rusu\">\n");
      out.write("           <nav>\n");
      out.write("    <div class=\"nav-wrapper blue lighten-4\">\n");
      out.write("      <a href=\"#\" class=\"brand-logo\">Crepetto</a>\n");
      out.write("      <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">\n");
      out.write("        <li><a href=\"login.jsp\">Ingresar</a></li>\n");
      out.write("        <li><a href=\"registrarUsuario.jsp\">Registrarse</a></li>\n");
      out.write("        <li><a href=\"registrarUsuario.jsp\">volver</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("           </nav><br><br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <table class=\"highlight\">\n");
      out.write("                 <h1>Registro de Usuario</h1><br>\n");
      out.write("                 <tr>\n");
      out.write("                 Correo electronico:<br>\n");
      out.write("                <input type=\"email\" name=\"textCorreoUsuario\"><br> \n");
      out.write("                Contraseña<br>\n");
      out.write("                <input type=\"password\" name=\"textPassword\"><br> \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table><br>\n");
      out.write("            <button class=\"waves-effect blue lighten-3 btn\">registrar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("         </div> \n");
      out.write("  \n");
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
