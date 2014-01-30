<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@ page import="javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/message.css">

<title>Speedy Match Private Messaging</title>
<script>
var url = 'C:\Users\Tan Wai Kit\Desktop\speedymatch\speedymatch\src\speedymatch\servlets\Message';
$(document).ready(function() {
	$.ajaxSetup({ cache:false});
	setInterval(function() {$("#MessageContent").load(url);}, 1000);
});
</script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page import ="speedymatch.entities.Messages,
	speedymatch.entities.Member" %>
	<%

	 %>
	<center>
		<!-- content here -->
	
		<div >
			<h4 id="name"><%=friends.get(0)%></h4>
		</div>
		<div class="message">	
			<textarea id="MessageContent" disabled>
	</textarea>
		</div>

		<form id="MessageBox" method="post" action="${pageContext.request.contextPath}/Message?sender=<%=username%>&receiver=<%=friends.get(0)%>">
			<input type="text" class="tftextinput" name="msg" size="21" maxlength="100">
			<input type="submit" value="post" class="tfbutton"
			onlick="submit();" />
		</form>

	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>