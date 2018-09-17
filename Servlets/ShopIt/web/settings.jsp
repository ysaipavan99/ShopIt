<%-- 
    Document   : settings
    Created on : 11 Sep, 2018, 6:02:21 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Settings</title>
  </head>
  <body>
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <div class="limiter">
      <div class="container">
        <div class="loginbox">
            
            <form class="settingsform12" action="http://localhost:8080/ShopIt/changePass.jsp" method="POST" name="settingsform12" id="settingsform1">
           <div class="login-form-title">
              Settings
            </div>                
                <button class="Change Password" name="DelAcc"
            style="width:100%;
            background-color: #0066ff;
            align-items: center;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;">
              Change Password
            </button>
          </form>
            
            
            
          <form class="settingsform" action="http://localhost:8080/ShopIt/logout" method="POST" name="settingsform" id="settingsform">
            
            <button class="logout" name="logout"
            style="width:100%;
            background-color: #0066ff;
            align-items: center;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;">
              Log Out
            </button>
              
          </form>    
          
            <form class="settingsform1" action="http://localhost:8080/ShopIt/DelAcc" method="POST" name="settingsform1" id="settingsform1">
            <button class="Delete Account" name="DelAcc"
            style="width:100%;
            background-color: #0066ff;
            align-items: center;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;">
              Delete Account
            </button>
          </form>
        </div>
      </div>
    </div>

  </body>
 </html>

