package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Login</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("\t\tvar xmlDoc = new ActiveXObject(\"Microsoft.XMLDOM\");\n");
      out.write("\t\tvar fso = new ActiveXObject(\"Scripting.FileSystemObject\");\n");
      out.write("\t\tvar FILENAME='C:\\\\Users\\\\user\\\\Documents\\\\ShopIt\\\\ShopIt\\\\XMLSet\\\\login.xml';\n");
      out.write("\n");
      out.write("\t\t\tfunction createfile()\n");
      out.write("\t\t\t{\n");
      out.write("\n");
      out.write("\t\t\tvar file;\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar mail=document.getElementById('email').value;\n");
      out.write("\t\t\t\t\tvar password=document.getElementById('pass').value;\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tfile= fso.CreateTextFile(FILENAME, true);\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('<?xml version=\"1.0\" encoding=\"utf-8\" ?>');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('<Login>');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('<Details category=\"1\">');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('<Email>'+mail+'</Email>');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('<Password>'+password+'</Password>');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('</Details>');\n");
      out.write("\t\t\t\t\t\tfile.WriteLine('</Login>');\n");
      out.write("\n");
      out.write("\t\t\t\talert('file updated');\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"document.login-form.reset();\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"loginbox\">\n");
      out.write("                            <form class=\"login-form validate-form\" name=\"loginForm\" onsubmit=\"return createfile();\" action=\"http://localhost:8080/ShopIt/login\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div class=\"login-form-title\">\n");
      out.write("\t\t\t\t\t\tWelcome\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"wrap-inp validate-inp\" data-validate = \"Valid email is: a@b.c\">\n");
      out.write("\t\t\t\t\t\t<input class=\"inp\" type=\"text\" name=\"email\" id=\"email\">\n");
      out.write("            <span class=\"focus-inp\" data-placeholder=\"Email\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-inp validate-inp\" data-validate=\"Enter password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"btn-show-pass\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"zmdi zmdi-eye\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<input class=\"inp\" type=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-inp\" data-placeholder=\"Password\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\"  name=\"checkbox\" required>\n");
      out.write("\t\t\t\t\t\tI Accept Terms and Conditions.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"container-login-form-btn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap-login-form-btn\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-form-bgbtn\"></div>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"login-form-btn\" onclick=\"Login()\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"dnt-have-ac\">\n");
      out.write("\t\t\t\t\t\t<span class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\tDon’t have an account?\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a class=\"sign-up\" href=\"signup.html\">\n");
      out.write("\t\t\t\t\t\t\tSign Up\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"js/login.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
