package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Review</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<div class=\"limiter\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"loginbox\" style=\"width:450px\">    \n");
      out.write("        \n");
      out.write("                <form action=\"http://localhost:8080/ShopIt/review\" method=\"POST\" onSubmit=\"return validateForm();\">\n");
      out.write("                <div style=\"width: 400px;\">\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;font-size : 32px; text-align:center; padding-bottom:50px\">Product Review</div>\n");
      out.write("\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Which product did you buy?<br/>\n");
      out.write("                <select id=\"data_3\" name=\"product\" id=\"product\" style=\"width : 450px;\" class=\"form-control\">\n");
      out.write("                <option>Mobile</option>\n");
      out.write("                <option>Laptop</option>\n");
      out.write("                <option>Watch</option>\n");
      out.write("                <option>Shoes</option>\n");
      out.write("                <option>Clothes</option>\n");
      out.write("                </select>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Rate this product<span style=\"color: red;\"> *</span><br/>\n");
      out.write("                <select id=\"data_4\" name=\"rate\" id=\"rate\" style=\"width : 150px;\" class=\"form-control\">\n");
      out.write("                <option>1</option>\n");
      out.write("                <option>2</option>\n");
      out.write("                <option>3</option>\n");
      out.write("                <option>4</option>\n");
      out.write("                <option>5</option>\n");
      out.write("                </select>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Title<span style=\"color: red;\"> *</span><br/>\n");
      out.write("                <input type=\"text\" id=\"title\" name=\"title\" style=\"width : 450px;\" class=\"form-control\"/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Pros<br/>\n");
      out.write("                <textarea id=\"pros\" false name=\"pros\" style=\"width : 450px;\" rows=\"3\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Cons<br/>\n");
      out.write("                <textarea id=\"cons\" false name=\"cons\" style=\"width : 450px;\" rows=\"3\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Review<span style=\"color: red;\"> *</span><br/>\n");
      out.write("                <textarea id=\"review\" false name=\"review\" style=\"width : 450px;\" rows=\"9\" class=\"form-control\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"padding-bottom: 18px;\">Would you recommend this product?<br/>\n");
      out.write("                <span><input type=\"radio\" id=\"y\" name=\"rec\" value=\"Yes\"/> Yes</span><br/>\n");
      out.write("                <span><input type=\"radio\" id=\"n\" name=\"rec\" value=\"No\"/> No</span><br/>\n");
      out.write("                <span><input type=\"radio\" id=\"ns\" name=\"rec\" value=\"I am not sure\"/> I am not sure</span><br/>\n");
      out.write("                </div>\n");
      out.write("                 <button class=\"subrev\" name=\"subrev\"\n");
      out.write("            style=\"width:100%;\n");
      out.write("            background-color: #0066ff;\n");
      out.write("            align-items: center;\n");
      out.write("            font-size : 20px;\n");
      out.write("            border-radius: 25px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            padding: 50 20px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\">\n");
      out.write("              Submit Review\n");
      out.write("            </button>\n");
      out.write("              \n");
      out.write("                <div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function validateForm() {\n");
      out.write("\n");
      out.write("        if (isEmpty(document.getElementById('title').value.trim())) {\n");
      out.write("        alert('Title is required!');\n");
      out.write("        return false;\n");
      out.write("        }\n");
      out.write("        if (isEmpty(document.getElementById('review').value.trim())) {\n");
      out.write("        alert('Review is required!');\n");
      out.write("        return false;\n");
      out.write("        }\n");
      out.write("        return true;\n");
      out.write("        }\n");
      out.write("        function isEmpty(str) { return (str.length === 0 || !str.trim()); }\n");
      out.write("        function validateEmail(email) {\n");
      out.write("        var re = /^([\\w-]+(?:\\.[\\w-]+)*)@((?:[\\w-]+\\.)*\\w[\\w-]{0,66})\\.([a-z]{2,15}(?:\\.[a-z]{2})?)$/i;\n");
      out.write("        return isEmpty(email) || re.test(email);\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
