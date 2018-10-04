<%-- 
    Document   : clickedItem
    Created on : 3 Oct, 2018, 1:48:04 PM
    Author     : HP
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <title>Clicked Item</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../css/font-awesome-min.css"/>
    <link rel="stylesheet" href="../css/clickedItem.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
      <c:set name="myVar" value=<%=rs.getString(2)%> />
      <div class="container">
      <div class="card">
        <div class="card-head">
          <img src="../imgs/logo.jpg" alt="Logo" class="card-logo">
          <img alt="Product" class="product-img" id="product-img">
          <script>
              document.getElementById("product-img").src = "../imgs/"+ "<%=rs.getString(2)%>" +".png";
          </script>
          <div class="product-detail">
            <h2><%=rs.getString(2)%></h2>
          </div>
          <span class="back-text">
            ShopIt
          </span>
        </div>
        <div class="card-body">
          <div class="product-desc">
            <span class="product-title">
              <%=rs.getString(4)%>
              <span class="badge">
                New
              </span>
            </span>
            <span class="product-caption">
              <%=rs.getString(2)%>
            </span>
            
            
            <span class="product-rating">
                <!--
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star checked"></span>
              <span class="fa fa-star"></span>
              <span class="fa fa-star"></span>
                -->
                <%
                    int i;
                    Integer rate = Integer.parseInt(rs.getString(3));
                    for(i=0; i<rate; i++){
                %>
                <span class="fa fa-star checked"></span>
                <%
                    }
                    while(i<5){
                %>
                <span class="fa fa-star"></span>
                <%
                    i++;}
                %>
            </span>
            <div class="product-properties">
              <span class="product-review">
                <h4>Review</h4>
                <p><%=rs.getString(7)%></p>
              </span>
              <span class="product-pros">
                <h4>Pros</h4>
                <p><%=rs.getString(5)%></p>
              </span>
              <span class="product-cons">
                <h4>Cons</h4>
                <p><%=rs.getString(6)%></p>
              </span>
            </div>
            <span class="product-recommend">
              Recommendation: <b><%=rs.getString(8)%></b>
            </span>
          </div>
        </div>
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
