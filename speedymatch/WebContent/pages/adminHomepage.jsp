<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<title>Admin Homepage</title>
</head>
<body>
<%@ include file="/pages/header.jsp" %>
<center>
<!-- content here -->

<div id="tfheader">
		<form id="tfnewsearch" method="post" action="${pageContext.request.contextPath}/AdminSearch">
		        <input type="text" class="tftextinput" name="username" id="username" size="21" 
maxlength="100"><input type="submit" name="submit" value="Search" class="tfbutton">    
		</form>
	</div>

	<!--temp div-->
	<div class="logo-background"> 

            
	</div>
</center>
<%@ include file="../pages/footer.jsp" %>
</body>
</html>