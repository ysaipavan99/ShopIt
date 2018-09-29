<%-- 
    Document   : profile
    Created on : 11 Sep, 2018, 5:09:22 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/profile.css"/>
    <title>PROFILE</title>
    <script src="https://use.fontawesome.com/d1341f9b7a.js"></script>
  </head>
  <body>
    <div class="main">
        <div class="box">
        <img src="prithiPic.jpg" alt="" class="box-img"/>
        <h1><%=request.getAttribute("name")%></h1>
        <h2><%=request.getAttribute("email")%></h2>
        <h3><%=request.getAttribute("gender")%></h3>
        <h2><%=request.getAttribute("mobnum")%></h2>
        <h5>Dead Woman Walking</h5>
        <p>Blah Blah Blah... I love writing ... Blah Blah.... I am decent at English</p>
        <ul>
          <li><a href="#"><i class="fa fa-facebook-square" aria-hidden="true"></i></a></li>
          <li><a href="#"><i class="fa fa-twitter-square" aria-hidden="true"></i></a></li>
          <li><a href="#"><i class="fa fa-google-plus-square" aria-hidden="true"></i></a></li>
        </ul>
      </div>
      
        <div class="postsList">
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
        
        try{
            con=DriverManager.getConnection(url,user,pw);
            Statement st=con.createStatement();
            System.out.println("con est");
                       
            String email=request.getAttribute("email").toString().trim();
            
            String sql="select * from reviews,reviewer WHERE reviews.ReviewID=reviewer.ReviewID and reviewer.EmailID='"+email+"'";
            
            ResultSet rs=st.executeQuery(sql);
            
            if(!rs.next()){
                System.out.println("Nothing to show");
                out.println("<html><head></head><body onload=\"alert('Nothing to show')\"></body></html>");
            }
            else{
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
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
    
  </body>
</html>
