package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Main Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"mainPage.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("          <img src=\"logo.png\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"logo-name\">\n");
      out.write("          ShopIt\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"main-nav\">\n");
      out.write("          <li class=\"active\"><a href=\"signup.html\">SIGN UP</a></li>\n");
      out.write("          <li class=\"active\"><a href=\"Login.jsp\">LOGIN</a></li>\n");
      out.write("          <li class=\"active\"><a href=\"./html/team.html\">OUR TEAM</a></li>\n");
      out.write("          <li class=\"active\"><a href=\"./html/contact.html\">CONTACT US</a></li>\n");
      out.write("          <li class=\"active\"><a href=\"./html/faq.html\">FAQ</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"entrance\">\n");
      out.write("        <h1>Let us drain your wallet!</h1>\n");
      out.write("        <div class=\"loader\">\n");
      out.write("          <a href=\"./Login.jsp\">\n");
      out.write("            <h1>ENTER</h1>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
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
