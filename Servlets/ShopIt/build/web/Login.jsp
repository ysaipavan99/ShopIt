<%-- 
    Document   : Login
    Created on : 11 Sep, 2018, 4:34:33 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<script type="text/javascript" language="javascript">

		var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
		var fso = new ActiveXObject("Scripting.FileSystemObject");
		var FILENAME='C:\\Users\\user\\Documents\\ShopIt\\ShopIt\\XMLSet\\login.xml';

			function createfile()
			{

			var file;

					var mail=document.getElementById('email').value;
					var password=document.getElementById('pass').value;

						file= fso.CreateTextFile(FILENAME, true);
						file.WriteLine('<?xml version="1.0" encoding="utf-8" ?>');
						file.WriteLine('<Login>');
						file.WriteLine('<Details category="1">');
						file.WriteLine('<Email>'+mail+'</Email>');
						file.WriteLine('<Password>'+password+'</Password>');
						file.WriteLine('</Details>');
						file.WriteLine('</Login>');

				alert('file updated');

			}


	</script>
</head>
<body onload="document.login-form.reset();">
  <link rel="stylesheet" href="css/login.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<div class="limiter">
		<div class="container">
			<div class="loginbox">
                            <form class="login-form validate-form" name="loginForm" onsubmit="return createfile();" action="http://localhost:8080/ShopIt/login" method="POST">
					<div class="login-form-title">
						Welcome
					</div>
					<div class="wrap-inp validate-inp" data-validate = "Valid email is: a@b.c">
						<input class="inp" type="text" name="email" id="email">
            <span class="focus-inp" data-placeholder="Email"></span>
					</div>

					<div class="wrap-inp validate-inp" data-validate="Enter password">
						<span class="btn-show-pass">
							<i class="zmdi zmdi-eye"></i>
						</span>
						<input class="inp" type="password" name="pass" id="pass">
						<span class="focus-inp" data-placeholder="Password"></span>
					</div>

					<div>
						<input type="checkbox"  name="checkbox" required>
						I Accept Terms and Conditions.
					</div>

					<div class="container-login-form-btn">
						<div class="wrap-login-form-btn">
							<div class="login-form-bgbtn"></div>
							<input type="submit" class="login-form-btn" onclick="Login()"/>
						</div>
					</div>

					<div class="dnt-have-ac">
						<span class="txt1">
							Don’t have an account?
						</span>

						<a class="sign-up" href="signup.html">
							Sign Up
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/login.js"></script>

</body>
</html>

