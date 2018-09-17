<%-- 
    Document   : review
    Created on : 13 Sep, 2018, 12:26:06 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Review</title>
    </head>
    <body>
        <link rel="stylesheet" href="css/login.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<div class="limiter">
            <div class="container">
		<div class="loginbox" style="width:450px">    
        
                <form action="http://localhost:8080/ShopIt/review" method="POST" onSubmit="return validateForm();">
                <div style="width: 400px;">
                </div>
                <div style="padding-bottom: 18px;font-size : 32px; text-align:center; padding-bottom:50px">Product Review</div>

                <div style="padding-bottom: 18px;">Which product did you buy?<br/>
                <select id="data_3" name="product" id="product" style="width : 450px;" class="form-control">
                <option>Mobile</option>
                <option>Laptop</option>
                <option>Watch</option>
                <option>Shoes</option>
                <option>Clothes</option>
                </select>
                </div>
                <div style="padding-bottom: 18px;">Rate this product<span style="color: red;"> *</span><br/>
                <select id="data_4" name="rate" id="rate" style="width : 150px;" class="form-control">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                </select>
                </div>
                <div style="padding-bottom: 18px;">Title<span style="color: red;"> *</span><br/>
                <input type="text" id="title" name="title" style="width : 450px;" class="form-control"/>
                </div>
                <div style="padding-bottom: 18px;">Pros<br/>
                <textarea id="pros" false name="pros" style="width : 450px;" rows="3" class="form-control"></textarea>
                </div>
                <div style="padding-bottom: 18px;">Cons<br/>
                <textarea id="cons" false name="cons" style="width : 450px;" rows="3" class="form-control"></textarea>
                </div>
                <div style="padding-bottom: 18px;">Review<span style="color: red;"> *</span><br/>
                <textarea id="review" false name="review" style="width : 450px;" rows="9" class="form-control"></textarea>
                </div>
                <div style="padding-bottom: 18px;">Would you recommend this product?<br/>
                <span><input type="radio" id="y" name="rec" value="Yes"/> Yes</span><br/>
                <span><input type="radio" id="n" name="rec" value="No"/> No</span><br/>
                <span><input type="radio" id="ns" name="rec" value="I am not sure"/> I am not sure</span><br/>
                </div>
                 <button class="subrev" name="subrev"
            style="width:100%;
            background-color: #0066ff;
            align-items: center;
            font-size : 20px;
            border-radius: 25px;
            margin-top: 50px;
            padding: 50 20px;
            width: 100%;
            height: 50px;">
              Submit Review
            </button>
              
                <div>
                </div>
                </form>
            </div>
        </div>
    </div>
        <script type="text/javascript">
        function validateForm() {

        if (isEmpty(document.getElementById('title').value.trim())) {
        alert('Title is required!');
        return false;
        }
        if (isEmpty(document.getElementById('review').value.trim())) {
        alert('Review is required!');
        return false;
        }
        return true;
        }
        function isEmpty(str) { return (str.length === 0 || !str.trim()); }
        function validateEmail(email) {
        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,15}(?:\.[a-z]{2})?)$/i;
        return isEmpty(email) || re.test(email);
        }
        </script>

    </body>
</html>
