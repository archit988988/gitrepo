<?php

$msg ='submit';

  $name = isset($_POST['formname']) ? $_POST['formname'] :"";
  $phone = isset($_POST['formpno']) ? $_POST['formpno'] :"";
  $message = isset($_POST['message']) ? $_POST['message'] :"";
  $sperec = isset($_POST['sperec']) ? $_POST['sperec'] :"";
  $occasion = isset($_POST['occasion']) ? $_POST['occasion'] :"";
  $venue = isset($_POST['venue']) ? $_POST['venue'] :"";
  $eventservice = isset($_POST['service']) ? $_POST['service'] :"";
  $mis = isset($_POST['mis']) ? $_POST['mis'] :"";
  $ban = isset($_POST['ban']) ? $_POST['ban'] :"";
  $hot = isset($_POST['hot']) ? $_POST['hot'] :"";
  $gar = isset($_POST['gar']) ? $_POST['gar'] :"";
  $st = isset($_POST['5st']) ? $_POST['5st'] :"";
  $wedser = isset($_POST['wedser']) ? $_POST['wedser'] :"";
  $phoser = isset($_POST['phoser']) ? $_POST['phoser'] :"";
  $vidser = isset($_POST['vidser']) ? $_POST['vidser'] :"";
  $decser = isset($_POST['decser']) ? $_POST['decser'] :"";
  $makser = isset($_POST['makser']) ? $_POST['makser'] :"";
  $othser = isset($_POST['othser']) ? $_POST['othser'] :"";
  $errorMessage = "";

   // - - - snip - - - 


?> 
<?php
   if(empty($name)) {
      $errorMessage .= "<li>You forgot to enter your name</li>";
   }
   if(empty($phone)) {
      $errorMessage .= "<li>You forgot to enter your phone number!</li>";
   }
?> 
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "givemepro";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO master_givemepro(id, name ,phone, address, date , time, occasion, venue , eventservice, service, special_requirement)
VALUES ('""', '".$name."', '".$phone."', '".$message."', '".$date."' , '".$time."', '".$occasion."', '".$venue."' ,'".$eventservice."','".$service."',now())";

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