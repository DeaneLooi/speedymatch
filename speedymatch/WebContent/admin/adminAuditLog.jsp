<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Audit</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<link rel="stylesheet" href="../css/adminAuditLog.css">
</head>
<body>
<%@ include file="adminHeader.jsp" %>
<center>
<!-- content here -->

<div id="audit">
<h2>Audit Log</h2>
<form>
<ul>

				<!--date-->
				<li class="field"><span class="title">Date:</span> <label
					class="date"><input class="xnarrow text input"
						type="text" placeholder="DDMMYYYY"> </label>
						</li>
						
					<!-- gender -->
				<li class="field" id="gender"><span class="title">Type:</span><label class="radio checked" for="radio1">
						<input name="gender" value="1" type="radio" id="radio1"> <span></span> Translog
				</label> <label class="radio" for="radio2"> <input name="gender"
						value="2" type="radio" id="radio2"> <span></span> Syslog
				</label></li>	
				
						
</ul></form>
<div>
<button id="acl-btn">Submit</button>
</div>
</div>
</center>
<%@ include file="../pages/footer.jsp" %>
</body>
</html>