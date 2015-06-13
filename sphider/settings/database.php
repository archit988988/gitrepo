<?php
	$database="sphider_db";
	$mysql_user = "root";
	$mysql_password = ""; 
	$mysql_host = "localhost";
	$mysql_table_prefix = "";



	$success = new mysqli($mysql_host, $mysql_user, $mysql_password);
	if (!$success)
		die ("<b>Cannot connect to database, check if username, password and host are correct.</b>");
    $successs = mysqli_select_db ($success,$database);
	if (!$successs) {
		print "<b>Cannot choose database, check if database name is correct.";
		die();
	}
?>

