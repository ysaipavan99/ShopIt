<?php
  include_once "php/loginServer.php";
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/profile.css"/>
    <title>PROFILE</title>
    <script src="https://use.fontawesome.com/d1341f9b7a.js"></script>
  </head>
  <body>
    <?php
      if(isset($_SESSION["name"])){
        echo "You are logged in";
      }
    ?>
    <div class="main">
      <div class="box">
        <img src="prithiPic.jpg" alt="" class="box-img"/>
        <h1>Prithishni</h1>
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
