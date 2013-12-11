<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Homepage</title>
</head>
<body>
<%@ include file="adminHeader.jsp" %>
<center>
<!-- content here -->
<div id="tfheader">
		<form id="tfnewsearch" method="get" action="#">
		        <input type="text" class="tftextinput" name="" size="21" maxlength="100"><input type="submit" value="Search" class="tfbutton">    
		</form>
	</div>
	
	<!--temp div-->
	<div class="logo-background"> 

	<ul class="temp">
	
<!-- 		<li>name: hello world</li> -->
<!-- 		<li>membership status: premium member</li> -->
<!-- 		<li>age: 46</li> -->
<!-- 		<li>birth date: 01/01/1970</li> -->
	
	</ul>
	</div>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>