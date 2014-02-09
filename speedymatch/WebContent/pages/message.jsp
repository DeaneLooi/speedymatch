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
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>

$(document).ready(function() {
	$.ajaxSetup({
		cache : false
	});
	var receiver = document.getElementById('receiver').value;
	var url = "../Message?receiver="+receiver;
	setInterval(function() {
		$("#MessageContent").load(url);
	}, 1000);
	
	$("#message").keyup(function (e) {
	    if (e.keyCode == 13) {
	    	var msg = document.getElementById('message').value;
			 document.getElementById('message').value = "";
			$.ajaxSetup({ cache: false});
			$.post("../Messages", {msg:msg});
			alert(msg);
	    }
	});

	$("#postMessage").click(
			function buttonClick(){
			 var msg = document.getElementById('message').value;
			 document.getElementById('message').value = "";
			$.ajaxSetup({ cache: false});
			$.post("../Messages", {msg:msg});
			alert(msg);
		}); 
	
});
</script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page
		import="speedymatch.entities.Messages,
	speedymatch.entities.Member"%>
	<%
		Date currentDate = new Date();
		String receiver = (String) request.getParameter("username");
	%>
	<center>
		<!-- content here -->

		<div>
			<h4 id="name"><%=receiver%></h4>
		</div>
		<div class="message">
			<div id="MessageContent" disabled></div>
		</div>

		<input type="text" class="tftextinput" name="msg" size="21" maxlength="100" id="message" autocomplete="off">
		<input type="hidden" id="receiver" name="receiver" value="<%=receiver%>">
		<input type="button" class="tfbutton" id="postMessage" onclick="buttonClick()" value="send">

	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>