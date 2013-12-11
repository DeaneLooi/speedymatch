<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Report</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<link rel="stylesheet" href="../css/adminReport.css">
</head>
<body>
<%@ include file="adminHeader.jsp" %>
<center>
<!-- content here -->
<div class="six columns">
				<table class="rounded">
					<caption>Reported User</caption>
					<thead>
						<tr>
							<th>UserID</th>
							<th>Date</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody  id="report-table">
						<tr>
							<td>13456R</td>
							<td>12/11/2013</td>
							<td>This user is very bad.</td>
						</tr>
						<tr>
							<td>13456R</td>
							<td>12/11/2013</td>
							<td>This user is very bad.</td>
						</tr>
						<tr>
							<td>13456R</td>
							<td>12/11/2013</td>
							<td>This user is very bad.</td>
						</tr>
						<tr>
							<td>13456R</td>
							<td>12/11/2013</td>
							<td>This user is very bad.</td>
						</tr>
					</tbody>
				</table>
				
				<button id="report-btn" onclick="myFunction()">Delete report</button>
			</div>
</center>
<%@ include file="../pages/footer.jsp" %>
</body>
<script>
function myFunction()
{
document.getElementById("report-table").deleteRow();
}
</script>
</html>