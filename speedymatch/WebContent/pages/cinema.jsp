<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cinema</title>
</head>
<body>
<%@ include file="header.jsp" %>

<embed width="600" height="800" src ="${movieUrl}" type="application/x-shockwave-flash">
</embed>
		
<%
request.getSession().removeAttribute("movieUrl");
request.getSession().removeAttribute("movieType");
%>

<%@ include file="footer.jsp" %>
</body>
</html>