<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/message.css">

<title>Speedy Match Private Messaging</title>
</head>
<body>
<%@ include file="header.jsp" %>
<center>
<!-- content here -->
	<div id="receiverName"><h4>Samuel Ong K.C</h4></div>
	<div class="message">
	<textarea id="MessageContent" disabled>7.23pm Samuel Ong K.C: ???                                                                                                     
	9.10pm Me: U maD bro???
	</textarea>
	</div>
	
		<form id="MessageBox" method="post" action="">
			<input type="text" class="tftextinput" name size="21" maxlength="100">
			<input type="submit" value="post" class="tfbutton">
		</form>

</center>
<%@ include file="footer.jsp" %>
</body>
</html>