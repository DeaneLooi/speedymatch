<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PayPal receipt</title>
<link rel="stylesheet" href="css/paypal.css">
</head>
<body>
<%@ include file="header.jsp" %>
<center>
<!-- content here -->
<div>
<table class="rounded">
					
					<thead>
						<tr>
							<th>Receipt</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
							<p>membership fee: 					 $19.90</p>
							<br /><br /><br />
							<p>Total Amount:					 $19.90</p>
							</td>
							
						</tr>
					</tbody>
				</table>
				<button id="receipt-btn">Close</button>
				</div>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>