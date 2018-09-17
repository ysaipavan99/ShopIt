<%-- 
    Document   : profile
    Created on : 11 Sep, 2018, 5:09:22 PM
    Author     : HP
--%>

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
      </div>
    </div>
  </body>
</html>
