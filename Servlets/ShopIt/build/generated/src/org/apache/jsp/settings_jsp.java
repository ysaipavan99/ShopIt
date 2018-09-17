package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class settings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Settings</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("    <div class=\"limiter\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("            \n");
      out.write("            <form class=\"settingsform12\" action=\"http://localhost:8080/ShopIt/changePass\" method=\"POST\" name=\"settingsform12\" id=\"settingsform1\">\n");
      out.write("           <div class=\"login-form-title\">\n");
      out.write("              Settings\n");
      out.write("            </div>                \n");
      out.write("                <button class=\"Change Password\" name=\"DelAcc\"\n");
      out.write("            style=\"width:100%;\n");
      out.write("            background-color: #0066ff;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            padding: 50 20px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\">\n");
      out.write("              Change Password\n");
      out.write("            </button>\n");
      out.write("          </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          <form class=\"settingsform\" action=\"http://localhost:8080/ShopIt/logout\" method=\"POST\" name=\"settingsform\" id=\"settingsform\">\n");
      out.write("            \n");
      out.write("            <button class=\"logout\" name=\"logout\"\n");
      out.write("            style=\"width:100%;\n");
      out.write("            background-color: #0066ff;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            padding: 50 20px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\">\n");
      out.write("              Log Out\n");
      out.write("            </button>\n");
      out.write("              \n");
      out.write("          </form>    \n");
      out.write("          \n");
      out.write("            <form class=\"settingsform1\" action=\"http://localhost:8080/ShopIt/delAcc\" method=\"POST\" name=\"settingsform1\" id=\"settingsform1\">\n");
      out.write("            <button class=\"Delete Account\" name=\"DelAcc\"\n");
      out.write("            style=\"width:100%;\n");
      out.write("            background-color: #0066ff;\n");
      out.write("            align-items: center;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            padding: 50 20px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\">\n");
      out.write("              Delete Account\n");
      out.write("            </button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write(" </html>\n");
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
