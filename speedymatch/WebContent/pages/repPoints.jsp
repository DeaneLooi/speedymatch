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
			<div class="medium btn default">$10.00 SGD
			
				
				<form action="https://www.paypal.com/cgi-bin/webscr" method="post"
			target="_top">
			<input type="hidden" name="cmd" value="_xclick"> <input
				type="hidden" name="business" value="S533GRRBQLH8G"> <input
				type="hidden" name="lc" value="US"> <input type="hidden"
				name="item_name" value="rpoint"> <input type="hidden"
				name="item_number" value="points"> <input type="hidden"
				name="amount" value="10.00"> <input type="hidden"
				name="currency_code" value="USD"> <input type="hidden"
				name="button_subtype" value="services"> <input type="hidden"
				name="no_note" value="1"> <input type="hidden"
				name="no_shipping" value="1"> <input type="hidden" name="bn"
				value="PP-BuyNowBF:btn_buynow_SM.gif:NonHosted"> <input
				type="image"
				src="https://www.paypalobjects.com/en_US/i/btn/btn_buynow_SM.gif"
				border="0" name="submit"
				alt="PayPal - The safer, easier way to pay online!"> <img
				alt="" border="0"
				src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" width="1"
				height="1">
		</form>
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