package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

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
      out.write("\n");
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
      out.write("        <li><a href=\"http://localhost:8080/ShopIt/profile\">Profile</a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/ShopIt/settings.jsp\">Settings</a></li>\n");
      out.write("        <li><a href=\"http://localhost:8080/ShopIt/review.jsp\">Add Review</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <form id=\"searched\" method=\"post\">\n");
      out.write("          <input type=\"submit\" name=\"button_ok\"/>\n");
      out.write("          <input type=\"text\" id='searchText' name=\"searchText\"/>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content\" class=\"layout_content\">\n");
      out.write("\n");
      out.write("            <!-- Side navigation -->\n");
      out.write("      <div id=\"sidenav\">\n");
      out.write("        <a href=\"#\">About</a>\n");
      out.write("        <a href=\"http://localhost:8080/ShopIt/dummyBean.jsp\">JavaBean Example</a>\n");
      out.write("        <a href=\"#\">Clients</a>\n");
      out.write("        <a href=\"#\">Contact</a>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"primary\" class=\"layout_primary\">\n");
      out.write("\n");
      out.write("        <h1>ShopIt</h1>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <h2>Product Reviews</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("        ");

            try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        String url="jdbc:mysql://localhost/ShopIt";
        String user="root";
        String pw="";
        
        Connection con=null;
        String searchText = "", sql="select * from reviews";
        
        
        try{
            con=DriverManager.getConnection(url,user,pw);
            Statement st=con.createStatement();
            System.out.println("con est");

            if(request.getParameter("button_ok")!=null){
                searchText = request.getParameter("searchText");
                if(searchText!=""){
                    sql="select * from reviews where reviews.Product='"+searchText+"'";    
                }
                else{
                    sql="select * from reviews";
                }
            }
            else{
                sql="select * from reviews";
            }
            
            ResultSet rs=st.executeQuery(sql);
            
            if(!rs.next()){
                System.out.println("Nothing to show");
                out.println("<html><head></head><body onload=\"alert('Nothing to show')\"></body></html>");
            }
            else{
                System.out.println(rs.getString(3));
                do{
            
      out.write("\n");
      out.write("            <div class=\"column\">\n");
      out.write("            <div class=\"content\" onclick='window.location = `http://localhost:8080/ShopIt/searched.jsp?param1=");
      out.print(rs.getString(1));
      out.write("` '>\n");
      out.write("                <h2>");
      out.print(rs.getString(4));
      out.write("</h2>\n");
      out.write("                Rating: <b>");
      out.print(rs.getString(3));
      out.write("</b><br/>\n");
      out.write("                Review: <b>");
      out.print(rs.getString(7));
      out.write("</b><br/>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            ");

            }while(rs.next());
            }
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
      out.write("\n");
      out.write("            \n");
      out.write("        </div> \n");
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
