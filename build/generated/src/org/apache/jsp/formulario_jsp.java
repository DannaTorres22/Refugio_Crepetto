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

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_resVO_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_resVO_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_resVO_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"../anipat/img/logo-img.png\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"css/registrarUsuario.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link id=\"pagestyle\" href=\"css/argon-dashboard.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/stylelogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
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
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../img/logo.png\">\n");
      out.write("        <title>\n");
      out.write("            Administradora\n");
      out.write("        </title>\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Nucleo Icons -->\n");
      out.write("        <link href=\"./assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"./assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"./assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link id=\"pagestyle\" href=\"./assets/css/argon-dashboard.css\" rel=\"stylesheet\" />\n");
      out.write("        <link \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>      \n");
      out.write("        <section class=\"ftco-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <h1>Solicitud</h1>\n");
      out.write("\n");
      out.write("                <form method=\"post\" action=\"Respuesta\">\n");
      out.write("\n");
      out.write("                    ");

                        PreguntaVO preVO = new PreguntaVO();
                        PreguntaDAO preDAO = new PreguntaDAO();
                        ArrayList<PreguntaVO> listaPreguntas = preDAO.listar();
                        for (int i = 0; i < listaPreguntas.size(); i++) {

                            preVO = listaPreguntas.get(i);

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input name=\"textIdUsuario\" class=\"form-control\" id=\"usuario\" type=\"hidden\" >\n");
      out.write("                    <div class=\"form-group\" >\n");
      out.write("                        <ol>\n");
      out.write("                            <div class=\"form-group col-md-15\">\n");
      out.write("\n");
      out.write("                                <a    class=\"form\"  placeholder=\"nombre\"  name=\"textNombreP\" >");
      out.print(preVO.getNombre());
      out.write("</a>\n");
      out.write("\n");
      out.write("                                </li>  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group col-md-15\">\n");
      out.write("\n");
      out.write("                                <a   class=\"form\"  placeholder=\"descripcion \"name=\"textDesc\" >");
      out.print(preVO.getDescripcion());
      out.write("</a>   </div>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-15\">\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(preVO.getIdPregunta());
      out.write("\" name=\"textIdPregunta\">\n");
      out.write("                        <input  type=\"text\"  class=\"form-control\" id=\"inputEmail4\" placeholder=\"");
      out.print(preVO.getNombre());
      out.write("\"  name=\"textRespuesta\" >\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button class=\"btn btn-info\">Registrar</button>\n");
      out.write("                        <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                        <table class=\"table table-hover\" >\n");
      out.write("                            <thead>                           \n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Pregunta</th>\n");
      out.write("                                    <th>Respuesta</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_resVO_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"Respuesta?opcion=6\" class=\"btn btn-success\">Confirmar</a>\n");
      out.write("\n");
      out.write("                    <style>\n");
      out.write("                        .form{\n");
      out.write("                            padding: 5%;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                ");

                    if (request.getAttribute("MensajeError") != null) { 
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </section>    <style>.container{\n");
      out.write("            width: 100%;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            -webkit-box-shadow: 0px 10px 34px -15px rgb(0 0 0 / 24%);\n");
      out.write("            -moz-box-shadow: 0px 10px 34px -15px rgba(0, 0, 0, 0.24);\n");
      out.write("            box-shadow: 0px 10px 34px -15px rgb(0 0 0 / 24%);\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        }    </body>  \n");
      out.write("    <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_resVO_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  resVO:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_resVO_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_resVO_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_resVO_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_resVO_forEach_0.setParent(null);
    _jspx_th_resVO_forEach_0.setVar("list");
    _jspx_th_resVO_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_resVO_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_resVO_forEach_0 = _jspx_th_resVO_forEach_0.doStartTag();
      if (_jspx_eval_resVO_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getIdPregunta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getRespuesta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_resVO_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_resVO_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_resVO_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_resVO_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_resVO_forEach_0.doFinally();
      _jspx_tagPool_resVO_forEach_var_items.reuse(_jspx_th_resVO_forEach_0);
    }
    return false;
  }
}
