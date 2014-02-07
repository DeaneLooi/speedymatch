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
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>"
<script>
var url = "localhost/speedymatch/Message";
var ntc = setInterval(
		function() {
			var xmlhttp;
			if (window.XMLHttpRequest) {
				//For IE7+, Firefox, Chrome, Opera and Safari
				xmlhttp = new XMLHttpRequest();
			} else {
				//For IE6, IE5
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					document.getElementById("MessageContent").innerHTML = xmlhttp.responseText;				
				}
			};

			xmlhttp.open("GET", "../Message", true);
			xmlhttp.send();
		}, 2000);
		
function buttonClick(){
  	var msg = document.getElementById('message');
 	var receiver = document.getElementById('receiver');
 	$.ajaxSetup({cache : false});
 	$.post(url,{msg:msg , receiver:receiver});
 	document.getElementById('message').innerText = ""; 
}

</script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page import ="speedymatch.entities.Messages,
	speedymatch.entities.Member" %>
	<%
	 Date currentDate = new Date();
	 String receiver = (String)request.getParameter("username");
	 %>
	<center>
		<!-- content here -->
	
		<div >
			<h4 id="name"><%=receiver%></h4>
		</div>
		<div class="message">	
			<textarea id="MessageContent" disabled>
	</textarea>
		</div>

			
			<input type="text" class="tftextinput" name="msg" size="21" maxlength="100" id="message" >
			<input type="hidden" id="receiver" name ="receiver" value="<%=receiver%>">
			<button class="tfbutton" onclick="buttonClick()">send</button>		


	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>