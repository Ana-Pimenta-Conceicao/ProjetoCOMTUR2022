package org.apache.jsp.pontoturistico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salvar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"ISO-8859-1\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>COMTUR</title>\n");
      out.write("        <!--\n");
      out.write("        Holiday Template\n");
      out.write("        http://www.templatemo.com/tm-475-holiday\n");
      out.write("        -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap-datetimepicker.min.css\" rel=\"stylesheet\">  \n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/templatemo-style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            GenericDAO cidadeDAO = new CidadeDAOImpl();
            List<Object> lista = cidadeDAO.listar();
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"tm-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-4 col-sm-3 tm-site-name-container\">\n");
      out.write("                        <a href=\"#\" class=\"tm-site-name\">COMTUR</a>\t\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-8 col-sm-9\">\n");
      out.write("                        <div class=\"mobile-menu-icon\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <nav class=\"tm-nav\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.html\">Início</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/about.html\">Quem Somos</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/pontoturistico/salvar.jsp\">Cadastrar</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </nav>\t\t\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\t  \t\n");
      out.write("        </div>\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- white bg -->\n");
      out.write("        <section class=\"section-padding-bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"tm-section-header section-margin-top\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-3 col-sm-3\"><hr></div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 col-sm-6\"><h2 class=\"tm-section-title\">Cadastrar Ponto Turistico</h2></div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-3 col-sm-3\"><hr></div>\t\n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- contact form -->\n");
      out.write("                    <form name=\"salvarpontoturistico\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarPontoTuristico\"  method=\"POST\">\n");
      out.write("                        <label>ID: </label><input type=\"number\"  id=\"idpontoturistico\" name=\"idpontoturistico\" readonly=\"readonly\" /><br />\n");
      out.write("                        <label>Nome: </label><input type=\"text\"  id=\"nomepontoturistico\" name=\"nomepontoturistico\" required=\"required\"/><br />\n");
      out.write("                        <label>Dados:</label><input type=\"text\" id=\"emailpontoturistico\" name=\"emailpontoturistico\" /><br/>\n");
      out.write("                        <label>Descriçao</label><input type=\"text\"  id=\"senhapontoturistico\" name=\"senhapontoturistico\" /><br/>            <br />\n");
      out.write("                        <label>Cidade</label><br/>\n");
      out.write("                            <select name=\"cidade\" id=\"cidade\" required=\"true\">\n");
      out.write("                                <option value=\"\">Selecione uma cidade</option>\n");
      out.write("                                <c:forEach items=\"");
      out.print(lista);
      out.write("\" var=\"cidade\">\n");
      out.write("                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cidade.idCidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cidade.nomeCidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                </c:forEach>\n");
      out.write("                            </select>\n");
      out.write("            <br/><br/><br/>\n");
      out.write("                        <br />\n");
      out.write("                        <input type=\"submit\" name=\"salvar\" value=\"Salvar\" />\n");
      out.write("                    </form>\n");
      out.write("                    <br />\n");
      out.write("                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resposta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                </div>\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"tm-black-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <p class=\"tm-copyright-text\">@Comtur</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>      \t\t<!-- jQuery -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\t\t\t\t\t<!-- bootstrap js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.flexslider-min.js\"></script>\t\t\t<!-- flexslider js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/templatemo-script.js\"></script>      \t\t<!-- Templatemo Script -->\n");
      out.write("\n");
      out.write("    </body>\n");
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
