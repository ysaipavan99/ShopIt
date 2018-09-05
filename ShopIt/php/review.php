<?php
session_start();
$dbServer = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbName = "shopit";

$email=$_SESSION['email'];
$product=$_POST["product"];
$rate=$_POST["rate"];
$title=$_POST["title"];
$pros=$_POST["pros"];
$cons=$_POST["cons"];
$review=$_POST["review"];
$rec=$_POST["rec"];

$conn = mysqli_connect($dbServer,$dbUsername,$dbPassword,$dbName);

if(!$conn)
  {
    die('could not connect'.$product.$rate.$title.$pros.$cons.$review.$rec);
  }
  mysqli_select_db($conn,$dbName) or die (mysql_error());
$sql1="insert into reviewer (EmailID) values ('$email')";

if(!$conn->query($sql1)){
  die("error inserting 1");
}
else{
  $rid=$conn->insert_id;
  $sql2="insert into reviews (ReviewID,Product,Rate,Title,Pros,Cons,Review,Rec) values ('$rid','$product','$rate','$title','$pros','$cons','$review','$rec')";
  if(!$conn->query($sql2)){
    die("error inserting 2");
  }
  else{
    echo('Added');
}
}
?>
