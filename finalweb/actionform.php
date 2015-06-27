<?php

$msg ='submit';

  
  $phone = isset($_POST['formpno']) ? $_POST['formpno'] :"";
  $occasion = isset($_POST['occasion']) ? $_POST['occasion'] :"3455";
  $venue = isset($_POST['venue']) ? $_POST['venue'] :"";
  $wedser = isset($_POST['test1']) ? $_POST['test1'] :"";
  $makser = isset($_POST['test2']) ? $_POST['test2'] :"";
  $decser = isset($_POST['test4']) ? $_POST['test4'] :"";
  $phoser = isset($_POST['test5']) ? $_POST['test5'] :"";
  $catser = isset($_POST['test3']) ? $_POST['test3'] :"";

   // - - - snip - - - 



?> 

<?php
$servername = "mysql.hostinger.in";
$username = "u648126045_final";
$password = "archit988988";
$dbname = "u648126045_final";


// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO user( phone, service)
VALUES (  '".$phone."', 'event')";
$sql3= "SELECT userid FROM user ORDER BY userid DESC LIMIT 1";
$result= $conn->query($sql3);

$row= $result->fetch_array(MYSQLI_NUM);
$row[0]=$row[0]+1;

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



$sql1 = "INSERT INTO events( userid, occasion , venue, wedser, makser, decser , catser , phoser)
VALUES (  '".$row[0]."','".$occasion."', '".$venue."', '".$wedser."', '".$makser."', '".$decser."', '".$catser."', '".$phoser."')";

if ($conn->query($sql1) === TRUE) {
     if(isset($_REQUEST["destination"])){
      header("Location: {$_REQUEST["formSubmit"]}");
  }else if(isset($_SERVER["HTTP_REFERER"])){
      header("Location: {$_SERVER["HTTP_REFERER"]}");
  }else{
       /* some fallback, maybe redirect to index.php */
  }
} else {
    echo "Error: " . $sql1 . "<br>" . $conn->error;
}







$conn->close();
?>