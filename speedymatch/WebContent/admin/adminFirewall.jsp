<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Firewall</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<link rel="stylesheet" href="../css/adminFirewall.css">
</head>
<body>
<%@ include file="adminHeader.jsp" %>
<center>
<!-- content here -->
<h2>ACL form</h2>
<div id="acl-list">
<form>
<ul>

				<!--ip to block-->
				<li class="field"><span class="title">Block IP:</span> <label
					class="ip-block"><input class="xnarrow text input"
						type="text" placeholder="0.0.0.0"> </label>
						</li>
						
				<!--protocol-->
				<li class="field"><span class="title">Protocol:</span> <label
					class="protocol"><input class="xnarrow text input"
						type="text" placeholder=""> </label>
						</li>
				
				<!--ip range-->
				<li class="field"><span class="title">IP range:</span>
				<label class="ip-range"><input class="xnarrow text input" type="text" placeholder="0.0.0.0">
				</label>to
				<label class="ip-range"><input class="xnarrow text input" type="text" placeholder="0.0.0.0">
				</label></li>
				
				
				<!-- permit/deny -->
				<li class="field"><span class="title">IP:</span><label class="drop">
						<div class="picker">
							<select>
								<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
								<option>Permit</option>
								<option>Deny</option>
							</select>
						</div>
				</label></li>
				
				<li class="field"><span class="title">Inbound/Outbound:</span><label class="drop">
						<div class="picker">
							<select>
								<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
								<option>Inbound</option>
								<option>Outbound</option>
							</select>
						</div>
				</label></li>
				
			</ul>
</form>
<div>
		<button id="acl-btn">Submit</button>
</div>
</div>
</center>
<%@ include file="../pages/footer.jsp" %>
</body>
</html>