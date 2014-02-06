<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<center>
		<iframe scrolling="no" id="iframe"src="datePlanner.jsp" height="800"width="800"  >
<!-- 		frameborder="0"  -->
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>