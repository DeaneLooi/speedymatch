<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/message.css">

<title>Speedy Match Date Planner</title>
</head>
<body>
<%@ include file="header.jsp" %>
<center>
<!-- content here -->
	<div id="receiverName"><h4>Tan Wai Kit</h4></div>
	<div class="message">
	<div id="MessageContent">Message appears here</div>
	<div class="Content"></div>
		<form id="MessageBox" method="post" action="">
			<input type="text" class="tftextinput" name size="21" maxlength="100">
			<input type="submit" value="post" class="tfbutton">
		</form>
</div>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>