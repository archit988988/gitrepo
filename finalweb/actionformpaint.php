<?php

$msg ='submit';

  
  $phone = isset($_POST['formpno']) ? $_POST['formpno'] :"";
  

   // - - - snip - - - 



?> 

<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "finalweb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO user( phone, service)
VALUES (  '".$phone."', 'painter')";

if ($conn->query($sql) === TRUE) {
     if(isset($_REQUEST["destination"])){
      header("Location: {$_REQUEST["formSubmit"]}");
  }else if(isset($_SERVER["HTTP_REFERER"])){
      header("Location: {$_SERVER["HTTP_REFERER"]}");
  }else{
       /* some fallback, maybe redirect to index.php */
  }
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}





$conn->close();
?>