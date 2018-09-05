<?php
  session_start();
?>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>HOME</title>
    <link rel="stylesheet" href="./css/home.css">
  <body>
    <div class="menu-area">
      <ul>
        <li><a href="profile.php">Profile</a></li>
        <li><a href="settings.html">Settings</a></li>
      </ul>
      <form id="searched" onsubmit="return retrieveSearch();">
          <input type="submit"/>
          <input type="text" id='searchText' name="searched"/>
      </form>
    </div>
    <div id="content" class="layout_content">

            <!-- Side navigation -->
      <div id="sidenav">
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Clients</a>
        <a href="#">Contact</a>
      </div>
      <div id="primary" class="layout_primary">

        <h1>MYLOGO.COM</h1>
        <hr>

        <h2>PORTFOLIO</h2>

        <div id="myBtnContainer">
          <button class="btn active" onclick="filterSelection('all')"> Show all</button>
          <button class="btn" onclick="filterSelection('nature')"> Nature</button>
          <button class="btn" onclick="filterSelection('cars')"> Cars</button>
          <button class="btn" onclick="filterSelection('people')"> People</button>
        </div>

        <!-- Portfolio Gallery Grid -->
        <div class="row">
          <div class="column nature">
            <div class="content">
              <img src="/w3images/mountains.jpg" alt="Mountains" style="width:100%">
              <h4>Mountains</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column nature">
            <div class="content">
            <img src="/w3images/lights.jpg" alt="Lights" style="width:100%">
              <h4>Lights</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column nature">
            <div class="content">
            <img src="/w3images/nature.jpg" alt="Nature" style="width:100%">
              <h4>Forest</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>

          <div class="column cars">
            <div class="content">
              <img src="/w3images/cars1.jpg" alt="Car" style="width:100%">
              <h4>Retro</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column cars">
            <div class="content">
            <img src="/w3images/cars2.jpg" alt="Car" style="width:100%">
              <h4>Fast</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column cars">
            <div class="content">
            <img src="/w3images/cars3.jpg" alt="Car" style="width:100%">
              <h4>Classic</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>

          <div class="column people">
            <div class="content">
              <img src="/w3images/people1.jpg" alt="Car" style="width:100%">
              <h4>Girl</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column people">
            <div class="content">
            <img src="/w3images/people2.jpg" alt="Car" style="width:100%">
              <h4>Man</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
          <div class="column people">
            <div class="content">
            <img src="/w3images/people3.jpg" alt="Car" style="width:100%">
              <h4>Woman</h4>
              <p>Lorem ipsum dolor..</p>
            </div>
          </div>
        <!-- END GRID -->
        </div>

      </div>
    </div>
    <script src="./js/home.js"></script>
  </body>
</html>
