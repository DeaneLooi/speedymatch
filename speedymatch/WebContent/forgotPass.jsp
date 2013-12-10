<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/forgotPass.css">
</head>
<body>
<%@ include file="header.jsp" %>
<center class="content">
<!-- content here -->
<div id="header"><h3>Forgotten Password?</h3></div>
<section class="steps">
<div><h5>Follow the steps to get your new password:</h5></div>
<form>
New Password:<input type="password" name="pwd"><br>
Retype New Password:<input type="password" name="pwd"> 

<input type="submit" value="#">
</form>

</section>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>