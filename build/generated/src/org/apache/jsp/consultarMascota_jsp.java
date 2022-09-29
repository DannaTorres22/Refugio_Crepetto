package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.MascotaVO;
import java.util.ArrayList;
import ModeloDAO.MascotaDAO;

public final class consultarMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Consultar mascota</title>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <div class=\"form\">\n");
      out.write("        <h1 style=\"font-size: 50px;\">Mascotas</h1>\n");
      out.write("        <form method=\"post\" action=\"Mascota\">\n");
      out.write("            <input type=\"text\" name=\"textNombreM\" class=\"validate\" placeholder=\"Nombre de la mascota\">\n");
      out.write("            <button class=\"waves-effect waves-light btn\" >Consultar</button>\n");
      out.write("            <input type=\"hidden\" value=\"3\" name=\"opcion\">        \n");
      out.write("       <br><br>\n");
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
      out.write("        <table  class=\"striped\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Persona que registra</th>\n");
      out.write("                    <th>Fecha de ingreso de la Mascota</th>\n");
      out.write("                    <th>Nombre de la Mascota</th>\n");
      out.write("                    <th>Raza</th>\n");
      out.write("                    <th>Edad</th>\n");
      out.write("                    <th>Tipo de mascota</th>\n");
      out.write("                    <th>Estado</th>\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    MascotaVO masVO = new MascotaVO();
                    MascotaDAO masDAO = new MascotaDAO();
                    ArrayList<MascotaVO> listaMascotas = masDAO.listar();
                    for (int i = 0; i < listaMascotas.size(); i++) {

                        masVO = listaMascotas.get(i);

                
      out.write("\n");
      out.write("            </thead>\n");
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(masVO.getIdUsuario());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getFechaIngreso());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getRaza());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getEdad());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getTipo());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(masVO.getEstadoMascota());
      out.write("</td>\n");
      out.write("                    <td><a href=\"\" class=\"waves-effect waves-light btn\">Eliminar</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("</div>\n");
      out.write("                 </form>\n");
      out.write("                <style>\n");
      out.write("                    .form{\n");
      out.write("                        padding: 5%;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("\n");
      out.write("        <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- JavaScript Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
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
