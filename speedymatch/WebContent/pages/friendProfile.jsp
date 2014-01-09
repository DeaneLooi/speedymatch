<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="../js/profile.js"></script>
<title>Profile</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/friendProfile.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<center class=content>
		<!-- content here -->
		<a href="#"><img id=profilepic src="../images/male1.jpg" alt="Elina Melrose" class="first" height="500px" width="400px"></a>
		<section class="profile">
		<div class="profileinfo">

			<div class="gear">
				<label class="primary label">E-Mail:</label> <span id="email"
					class="datainfo">myaddress@googlemail.com</span> 
			</div>

			<div class="gear">
				<label class="primary label">Full Name:</label> <span id="fullname"
					class="datainfo">Samuel Ong K.C</span> 
			</div>

			<div class="gear">
				<label class="primary label">Birthday:</label> <span id="birthday"
					class="datainfo">August 21, 1989</span>
			</div>

			<div class="gear">
				<label class="primary label">City/Town:</label> <span id="citytown"
					class="datainfo">SengKang, Singapore</span>
			</div>

			<div class="gear">
				<label class="primary label">Occupation:</label> <span
					id="occupation" class="datainfo">Freelance Web Developer</span> \
			</div>

		</div>
		</section>
	</center> 
		<%@ include file="footer.jsp"%>
</body>
</html>