<?php

$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'shopit';

$email=$_POST["email"];
$pass=$_POST["pass"];

$email=stripcslashes($email);
$pass=stripcslashes($pass);


$con = mysqli_connect($host,$user);
if(!$con)
  {
    die('could not connect'.$email.$pass);
  }

mysqli_select_db($con,$db) or die (mysql_error());

$sql="select * from userDetails where Email = '$email' and Password = '$pass'";
$result=$con->query($sql);
if(!$con->query($sql)){
  die("error inserting");
}
else{
  $row= mysqli_fetch_assoc($result);

  if($row['Email']==$email && $row['Password']==$pass){
    echo("login success");
  }
  else{
    echo("login failed");
  }
}




?>
