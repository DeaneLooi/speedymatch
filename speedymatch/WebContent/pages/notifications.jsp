<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notification</title>

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>
$(document).ready(function() {

	$.ajaxSetup({
		cache : false
	});

	setInterval(function() {
		$("#notifications").load('../GetNotifications');
	}, 1000);
	
	});
</script>
<style>
#notifications{
	
	background-color:gray;

}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<h4>Notifications</h4>
<div id="notifications">

</div>

<%@ include file="footer.jsp" %>
</body>
</html>