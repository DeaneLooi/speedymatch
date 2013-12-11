<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recommendations</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<link rel="stylesheet" href="../css/recommendation.css">
</head>
<body>
<%@ include file="header.jsp" %>
<center class="content">
<div id="header"></div><h4>Recommended For You</h4></div>
<section class="contents">
<div>Based on your Preference on:</div>
<div id="prefer">Age range from: 20 - 30</div>
<div id="list">
        <ul>
            <li><a href="#"><img src="../images/egPic1.jpg" alt="Elina Melrose" class="first" height="300px" width="250px"></a></li>
            <li><a href="#"><img src="../images/egPic2.jpg" alt="Vishal Rose" class="second" height="300px" width="250px"></a></li>
            <li><a href="#"><img src="../images/egPic3.jpg" alt="Narsha Tinkebel" class="third" height="300px" width="250px"></a></li>
            <li><a href="#"><img src="../images/10.jpg" alt="Random" class="fourth" height="300px" width="250px"></a></li> 
            <li><a href="#"><img src="../images/11.jpg" alt="Nameless" class="fifth" height="300px" width="250px"></a></li> 
            <li><a href="#"><img src="../images/12.jpg" alt="Tiffany" class="sixth" height="300px" width="250px"></a></li>    
        </ul>
</div>
</section>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>