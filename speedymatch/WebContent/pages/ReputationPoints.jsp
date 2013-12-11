<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/repPoints.css" />
<title>Reputation Points</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h1 class="lead">Reputation Points</h1>


	<div id="currentRepPoint">
	<center>
	<h4>Current Reputation point</h4>
	<div class="default badge">300RP</div>
	<div class="default badge">Rank</div>
	</center>
	</div>

	<div class="repPoints">
		<h4>Buy 100 Rep Points</h4>
		<p>Minimum Rep Points</p>
		<div class="repPointPrice">
			<div class="medium btn default">$5.00 SGD</div>
			<div class="medium btn primary">
				<a href="#">Buy now</a>
			</div>
		</div>
	</div>

	<div class="repPoints">
		<h4>Buy 500 Rep Points</h4>
		<p>&nbsp;</p>
		<div class="repPointPrice">
			<div class="medium btn default">$25.00 SGD</div>
			<div class="medium btn primary">
				<a href="#">Buy now</a>
			</div>
		</div>
	</div>

	<div class="repPoints">
		<h4>Buy 1000 Rep Points</h4>
		<p>&nbsp;</p>
		<div class="repPointPrice">
			<div class="medium btn default">$40.00 SGD</div>
			<div class="medium btn primary">
				<a href="#">Buy now</a>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%></ body>
</html>