package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;

public final class actualizarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- CSS only -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vehiculo</title>\n");
      out.write("        <!-- Compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"\n");
      out.write("              <!-- Compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@600&family=Montserrat:ital,wght@1,500&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <h1>Actualizar Usuario</h1>\n");
      out.write("        \n");
      out.write("        ");

        UsuarioVO usuVO = (UsuarioVO)request.getAttribute("datosConsultados");
        if(usuVO !=null){
            
      out.write("\n");
      out.write("              <form method=\"post\" action=\"Usuario\">\n");
      out.write("            <table class=\"responsive-table\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" name=\"textIdUsuario\" value=\"");
      out.print(usuVO.getIdUsuario());
      out.write("\"><br><br>\n");
      out.write("                        <br>\n");
      out.write("                        nombre usuario<br>\n");
      out.write("                        <input type=\"text\" name=\"textNombre\" value=\"");
      out.print(usuVO.getNombre());
      out.write("\"><br><br>\n");
      out.write("                        Apellido<br>\n");
      out.write("                        <input type=\"text\" name=\"textApellido\" value=\"");
      out.print(usuVO.getApellido());
      out.write("\"><br><br>\n");
      out.write("                        Fecha de nacimiento<br>\n");
      out.write("                        <input type=\"text\" name=\"textFechaNacimiento\" value=\"");
      out.print(usuVO.getFechaNacimiento());
      out.write("\"><br><br>\n");
      out.write("                       Tipo de documento<br>\n");
      out.write("                        <input type=\"text\" name=\"textTipoDocumento\" value=\"");
      out.print(usuVO.getTipoDocumento());
      out.write("\"><br><br>\n");
      out.write("                        Número de documento<br>\n");
      out.write("                        <input type=\"text\" name=\"textNumDocumento\" value=\"");
      out.print(usuVO.getNumDocumento());
      out.write("\"><br><br>\n");
      out.write("                        Dirección<br>\n");
      out.write("                        <input type=\"text\" name=\"textDireccion\" value=\"");
      out.print(usuVO.getDireccion());
      out.write("\"><br><br>\n");
      out.write("                        Celular<br>\n");
      out.write("                        <input type=\"text\" name=\"textCelular\" value=\"");
      out.print(usuVO.getCelular());
      out.write("\"><br><br>\n");
      out.write("                        Estado<br>\n");
      out.write("                        <input type=\"text\" name=\"textEstadoUsuario\" value=\"");
      out.print(usuVO.getEstadoUsuario());
      out.write("\"><br><br>\n");
      out.write("                        Correo<br>\n");
      out.write("                        <input type=\"text\" name=\"textCorreoUsuario\" value=\"");
      out.print(usuVO.getCorreoUsuario());
      out.write("\"><br><br>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <button>Actualizar</button><br>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("              \n");
      out.write("        </form>\n");
      out.write("          <a href=\"consultarVehiculo.jsp\"><button>Volver</button></a>     \n");
      out.write("        ");
}
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
