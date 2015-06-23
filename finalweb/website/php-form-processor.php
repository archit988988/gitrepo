<?php

$msg ='submit';

   $varMovie = isset($_POST['formname']) ? $_POST['formname'] :"";
   $varName = isset($_POST['formpno']) ? $_POST['formpno'] :"";
  $wed = isset($_POST['wed']) ? $_POST['wed'] :"";
  $bir = isset($_POST['bir']) ? $_POST['bir'] :"";
  $kit = isset($_POST['kit']) ? $_POST['kit'] :"";
  $bac = isset($_POST['bac']) ? $_POST['bac'] :"";
  $con = isset($_POST['con']) ? $_POST['con'] :"";
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
   if(empty($varMovie)) {
      $errorMessage .= "<li>You forgot to enter a movie!</li>";
   }
   if(empty($varName)) {
      $errorMessage .= "<li>You forgot to enter a name!</li>";
   }
?> 
<?php
$servername = "sql18.main-hosting.eu";
$username = "u648126045_give";
$password = "archit988988";
$dbname = "u648126045_give";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO myguests (name, pno ,wed, bir, kit , bac, con, mis ,ban, hot, gar, 5st, wedser, phoser, vidser, decser, makser, othser, datetime)
VALUES ('".$varMovie."', '".$varName."', '".$wed."', '".$bir."', '".$kit."' , '".$bac."', '".$con."', '".$mis."' ,'".$ban."', '".$hot."', '".$gar."', '".$st."', '".$wedser."', '".$phoser."', '".$vidser."', '".$decser."', '".$makser."', '".$othser."', now())";// TABLE TODO


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