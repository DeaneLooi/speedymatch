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
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<link rel="stylesheet" href="../css/profile.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<center class="content">
		<!-- content here -->
		<section id="profile">
		<div class="profileinfo">
			<h2>Update your Profile Info &curarr;</h2>
			<ul>
				<li class="gear"><label class="primary label">E-Mail:</label> <span
					id="email" class="datainfo">myaddress@googlemail.com</span> <a
					href="#" class="editlink">Edit Info</a> <a class="savebtn">Save</a>
				</li>

				<li class="gear"><label class="primary label">Full
						Name:</label> <span id="fullname" class="datainfo">Tom Harris</span> <a
					href="#" class="editlink">Edit Info</a> <a class="savebtn">Save</a>
				</li>

				<li class="gear"><label class="primary label">Birthday:</label>
					<span id="birthday" class="datainfo">August 21, 1989</span> <a
					href="#" class="editlink">Edit Info</a> <a class="savebtn">Save</a>
				</li>

				<li class="gear"><label class="primary label">City/Town:</label>
					<span id="citytown" class="datainfo">SengKang, Singapore</span> <a
					href="#" class="editlink">Edit Info</a> <a class="savebtn">Save</a>
				</li>

				<li class="gear"><label class="primary label">Occupation:</label>
					<span id="occupation" class="datainfo">Freelance Web
						Developer</span> <a href="#" class="editlink">Edit Info</a> <a
					class="savebtn">Save</a></li>
			</ul>
		</div>
		</section>
		<!-- 		<div id="header"> -->
		<!-- 			<h3>Profile</h3> -->
		<!-- 		</div> -->
		<!-- 		<div id="forgotPass"><h5>Forgotten Password</h5></div> -->
		<!-- 	</center> -->
		<%@ include file="footer.jsp"%>
</body>
</html>