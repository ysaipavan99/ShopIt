package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/profile.css\"/>\n");
      out.write("    <title>PROFILE</title>\n");
      out.write("    <script src=\"https://use.fontawesome.com/d1341f9b7a.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"box\">\n");
      out.write("        <img src=\"prithiPic.jpg\" alt=\"\" class=\"box-img\"/>\n");
      out.write("        <h1>");
      out.print(request.getAttribute("name"));
      out.write("</h1>\n");
      out.write("        <h2>");
      out.print(request.getAttribute("email"));
      out.write("</h2>\n");
      out.write("        <h3>");
      out.print(request.getAttribute("gender"));
      out.write("</h3>\n");
      out.write("        <h2>");
      out.print(request.getAttribute("mobnum"));
      out.write("</h2>\n");
      out.write("        <h5>Dead Woman Walking</h5>\n");
      out.write("        <p>Blah Blah Blah... I love writing ... Blah Blah.... I am decent at English</p>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-twitter-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("          <li><a href=\"#\"><i class=\"fa fa-google-plus-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"postsList\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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