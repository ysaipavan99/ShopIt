<?php
session_start();


if (isset($_POST['logout']))
{

  session_destroy();
  header("Location: ../mainPage.html");
}

if (isset($_POST['DelAcc']))
{

  $dbServer = "localhost";
  $dbUsername = "root";
  $dbPassword = "";
  $dbName = "shopit";

  $email=$_SESSION['email'];

  $conn = mysqli_connect($dbServer,$dbUsername,$dbPassword,$dbName);

  if(!$conn)
    {
      die('could not connect'.$product.$rate.$title.$pros.$cons.$review.$rec);
    }
    mysqli_select_db($conn,$dbName) or die (mysql_error());

    $sql="DELETE FROM userDetails WHERE Email='$email'";

    if(!$conn->query($sql)){
      print_r($_SESSION);
      die("error Deleting". $conn->error);
    }
    else{
      session_destroy();
      header("Location: ../mainPage.html");
    }


}

?>
