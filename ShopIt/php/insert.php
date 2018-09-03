<?php
$host = 'localhost';
$user = 'root';
$pass = '';
$db = 'shopit';


$email=$_POST["email"];
$pass=$_POST["passMain"];
$name=$_POST["uname"];
$gender=$_POST["gender"];
$mobnum=$_POST["mobnum"];


$con = mysqli_connect($host,$user);

if(!$con)
  {
    die('could not connect'.$email.$pass.$name.$gender.$mobnum);
  }

  mysqli_select_db($con,$db) or die (mysql_error());
$sql="insert into userDetails (Email,Password,Name,Gender,MobNum) values ('$email','$pass','$name','$gender','$mobnum')";

if(!$con->query($sql)){
  die("error inserting");
}
else{
  echo('Profile Added');
}

?>
