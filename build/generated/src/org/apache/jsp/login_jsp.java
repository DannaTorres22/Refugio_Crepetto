package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- CSS only -->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylelogin.css\">\n");
      out.write("\n");
      out.write("        <title>Ingresar</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    <section class=\"ftco-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-6 text-center mb-5\">\n");
      out.write("                    <h2 class=\"heading-section\"></h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-12 col-lg-10\">\n");
      out.write("                    <div class=\"wrap d-md-flex\">\n");
      out.write("                        <div class=\"text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last\">\n");
      out.write("                            <div class=\"text w-100\">\n");
      out.write("                                <h2>Bienvenido a crepetto</h2>\n");
      out.write("                                <p>¿No tienes una cuenta?</p>\n");
      out.write("                                <a href=\"registrarUsuario.jsp\" class=\"btn btn-white btn-outline-white\">Registrate aqui</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login-wrap p-4 p-lg-5\">\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <div class=\"w-100\">\n");
      out.write("                                    <h3 href=\"login.jsp\"class=\"mb-4\">Ingresar</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w-100\">\n");
      out.write("                                    <p class=\"social-media d-flex justify-content-end\">\n");
      out.write("                                        <a href=\"#\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon d-flex align-items-center justify-content-center\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <form method=\"post\" action=\"Usuario\" class=\"signin-form\">\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <label class=\"label\" for=\"name\">Usuario</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" placeholder=\"Username\" name=\"textCorreoUsuario\" required> \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <label class=\"label\" for=\"password\">Contraseña</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"textPassword\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"form-control btn btn-primary submit px-3\">Ingresar</button>\n");
      out.write("                                    <input type=\"hidden\" value=\"3\" name=\"opcion\"><br>\n");
      out.write("               \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group d-md-flex\">\n");
      out.write("                                    <div class=\"w-50 text-left\">\n");
      out.write("                                        <label class=\"checkbox-wrap checkbox-primary mb-0\">Recuerdame\n");
      out.write("                                            <input type=\"checkbox\" checked>\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"w-50 text-md-right\">\n");
      out.write("                                        <a href=\"#\">¿Olvidaste tu contraseña?</a>\n");
      out.write("                                    </div>                     \n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("   \n");
      out.write("</html");
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
