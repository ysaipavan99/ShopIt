<%-- 
    Document   : changePass
    Created on : 11 Sep, 2018, 6:25:16 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Change Password</title>
  </head>
  <body>
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <div class="limiter">
      <div class="container">
        <div class="loginbox">
            
            <form class="changepass" action="http://localhost:8080/ShopIt/changePass" method="POST" name="changePass" id="changePass" onsubmit="return checkPass(this);">
           <div class="login-form-title">
              Change Password
            </div>                
                <input 
                    type="text"
                    placeholder="new password"
                    class="new Password" name="p1"
            style="width:100%;
            
            align-items: center;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;" required/>       
            
             <input 
                    type="text"
                    placeholder="re-enter password"
                    class="new Password" name="p2"
            style="width:100%;
            
            align-items: center;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;" required/>       
            
             <script>
                 function checkPass(changepass) {
                    if (changepass.p1.value != changepass.p2.value)
                    {
                        alert('Those passwords don\'t match!');
                        return false;
                    } else {
                        return true;
                    }
    
             </script>
            
            
         
           
              
          <button class="Delete Account" name="DelAcc"
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
        </div>
      </div>
    </div>

  </body>
 </html>

