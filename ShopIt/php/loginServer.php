<?php

session_start();

$dbServer = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "shopit";

$email=$_POST["email"];
$password=$_POST["pass"];

$conn = mysqli_connect($dbServer,$dbUsername,$dbPassword,$dbName);

  if(!$conn)
    {
      die('could not connect'.$email.$password);
    }
  mysqli_select_db($conn,$dbName) or die (mysql_error());

  $sql = "select * from userdetails where Email = '$email' and Password = '$password'"; //Forming the SQL Query
  $results = mysqli_query($conn,$sql);  //Actually connecting and querying the database

  //Checking is results has anything in it
  $resultsCheck = mysqli_num_rows($results);
  if($resultsCheck > 0){
    while($row = mysqli_fetch_assoc($results)){
      if($row["Email"] == $email && $row["Password"] == $password){
        echo('Login Success');
        $_SESSION['name']=$row["Name"];
        $_SESSION['email']=$row["Email"];
        $_SESSION['password']=$row["Password"];
        $_SESSION['gender']=$row["Gender"];
        $_SESSION['mobnum']=$row["MobNum"];
        header("Location: ../home.php?login=success");
        exit();
      }
      else{
        echo('No such user');
      }
    }
  }
?>
