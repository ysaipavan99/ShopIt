<%-- 
    Document   : Home
    Created on : 11 Sep, 2018, 4:20:44 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>HOME</title>
    <link rel="stylesheet" href="./css/home.css">
  <body>
    <div class="menu-area">
      <ul>
        <li><a href="http://localhost:8080/ShopIt/profile">Profile</a></li>
        <li><a href="http://localhost:8080/ShopIt/settings.jsp">Settings</a></li>
        <li><a href="http://localhost:8080/ShopIt/review.jsp">Add Review</a></li>
      </ul>
      <form id="searched" method="post">
          <input type="submit" name="button_ok"/>
          <input type="text" id='searchText' name="searchText"/>
      </form>
    </div>
    <div id="content" class="layout_content">

            <!-- Side navigation -->
      <div id="sidenav">
        <a href="#">About</a>
        <a href="http://localhost:8080/ShopIt/dummyBean.jsp">JavaBean Example</a>
        <a href="#">Clients</a>
        <a href="#">Contact</a>
      </div>
      <div id="primary" class="layout_primary">

        <h1>ShopIt</h1>
        <hr>

        <h2>Product Reviews</h2>
        <div class="row">
            
        <%
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
            %>
            <div class="column">
            <div class="content" onclick='window.location = `http://localhost:8080/ShopIt/searched.jsp?param1=<%=rs.getString(1)%>` '>
                <h2><%=rs.getString(4)%></h2>
                Rating: <b><%=rs.getString(3)%></b><br/>
                Review: <b><%=rs.getString(7)%></b><br/>
            </div>
            </div>
            <%
            }while(rs.next());
            }
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        %>
            
        </div> 
        </div>

      </div>
    </div>
    <script src="./js/home.js"></script>
  </body>
</html>

