<%-- 
    Document   : searched
    Created on : 27 Sep, 2018, 4:57:15 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <%
            String reviewID = request.getParameter("param1");
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


            String sql="select * from reviews where reviews.ReviewID='"+reviewID+"'";
            
            
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
    </body>
</html>
