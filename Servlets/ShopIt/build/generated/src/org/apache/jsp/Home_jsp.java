package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>HOME</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/home.css\">\n");
      out.write("  <body>\n");
      out.write("    <div class=\"menu-area\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"profile.html\">Profile</a></li>\n");
      out.write("        <li><a href=\"settings.html\">Settings</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <form id=\"searched\" onsubmit=\"return retrieveSearch();\">\n");
      out.write("          <input type=\"submit\"/>\n");
      out.write("          <input type=\"text\" id='searchText' name=\"searched\"/>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content\" class=\"layout_content\">\n");
      out.write("\n");
      out.write("            <!-- Side navigation -->\n");
      out.write("      <div id=\"sidenav\">\n");
      out.write("        <a href=\"#\">About</a>\n");
      out.write("        <a href=\"#\">Services</a>\n");
      out.write("        <a href=\"#\">Clients</a>\n");
      out.write("        <a href=\"#\">Contact</a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"primary\" class=\"layout_primary\">\n");
      out.write("\n");
      out.write("        <h1>MYLOGO.COM</h1>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <h2>PORTFOLIO</h2>\n");
      out.write("\n");
      out.write("        <div id=\"myBtnContainer\">\n");
      out.write("          <button class=\"btn active\" onclick=\"filterSelection('all')\"> Show all</button>\n");
      out.write("          <button class=\"btn\" onclick=\"filterSelection('nature')\"> Nature</button>\n");
      out.write("          <button class=\"btn\" onclick=\"filterSelection('cars')\"> Cars</button>\n");
      out.write("          <button class=\"btn\" onclick=\"filterSelection('people')\"> People</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Portfolio Gallery Grid -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"column nature\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("              <img src=\"/w3images/mountains.jpg\" alt=\"Mountains\" style=\"width:100%\">\n");
      out.write("              <h4>Mountains</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column nature\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/lights.jpg\" alt=\"Lights\" style=\"width:100%\">\n");
      out.write("              <h4>Lights</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column nature\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/nature.jpg\" alt=\"Nature\" style=\"width:100%\">\n");
      out.write("              <h4>Forest</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"column cars\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("              <img src=\"/w3images/cars1.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Retro</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column cars\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/cars2.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Fast</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column cars\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/cars3.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Classic</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"column people\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("              <img src=\"/w3images/people1.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Girl</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column people\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/people2.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Man</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"column people\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("            <img src=\"/w3images/people3.jpg\" alt=\"Car\" style=\"width:100%\">\n");
      out.write("              <h4>Woman</h4>\n");
      out.write("              <p>Lorem ipsum dolor..</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        <!-- END GRID -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"./js/home.js\"></script>\n");
      out.write("  </body>\n");
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
}
