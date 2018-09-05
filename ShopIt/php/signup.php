<?php

$dbServer = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "shopit";

$email=$_POST["email"];
$pass=$_POST["passMain"];
$name=$_POST["uname"];
$gender=$_POST["gender"];
$mobnum=$_POST["mobnum"];

$conn = mysqli_connect($dbServer,$dbUsername,$dbPassword,$dbName);

if(!$conn)
  {
    die('could not connect'.$email.$pass.$name.$gender.$mobnum);
  }
  mysqli_select_db($conn,$dbName) or die (mysql_error());
$sql="insert into userdetails (Name,Email,Password,Gender,MobNum) values ('$name','$email','$pass','$gender','$mobnum')";
if(!$conn->query($sql)){
  die("Email ID aleready In use");
}
else{
  header("Location: ../mainPage.html");
}

?>
