<?php
  $name = $_POST['name'];
  $visitor_email = $_POST['email'];
  $message = $_POST['message'];

  $email_from = "shopit@zoho.com";
  $email_subject = "Feedback";
  $email_body = "User Name: $name.\n",
                "User Email: $visitor_email.\n",
                "User Message: $message.\n";

  $to = "13pramo@gmail.com";
  $headers = "From: $email_from \r\n";
  $headers .="Reply-To $visitor_email \r\n";
  mail($to, $email_subject, $email_body, $headers);
  header("Location: contact.html");
 ?>
