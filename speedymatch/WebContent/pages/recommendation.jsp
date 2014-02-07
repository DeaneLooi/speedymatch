<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recommendations</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/recommendation.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page
		import="speedymatch.entities.Member,
				speedymatch.entities.dao.MemberDAO,
				java.util.Date,
				speedymatch.utils.Algorithms"%>
	<%
		String userProfile = request.getParameter("username");
		Member memProfile = new Member(userProfile, null);
		memProfile = MemberDAO.retrieveAccount(memProfile);
		Date dob = memProfile.getDob();
	%>
	<center class="content">
		<div id="header"></div>
		<h4>Recommended For You</h4>
		</div>
		<section class="contents">
		<div>Based on your Preference on:</div>
		
		<div id="prefer"></div>
		<div id="list">
			<ul>
				<li><a
					href="${pageContext.request.contextPath}/Recommends?username=<%=username%>&userProfile=<%=userProfile%>"><img
						src="../images/male1.jpg" alt="Elina Melrose" class="first"
						height="300px" width="250px"></a></li>
			</ul>
		</div>
		</section>
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>