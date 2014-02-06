<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div id="changePassForm">
<h3>Change your password</h3>
${chgPassObj}
<form id="submit" action="${pageContext.request.contextPath}/ChangePassword" method="post">
Old Password:
<br>
<div class="field"><input class="wide text input" type="password" name="oldPass"></div>
New Password:
<div class="field"><input class="wide text input" type="password" name="newPass"></div>
Confirm Password:
<div class="field"><input class="wide text input" type="password" name ="confirmPass"></div>

<br>
<div class="medium primary btn"><input type="submit" value="confirm"></div>
</form>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>