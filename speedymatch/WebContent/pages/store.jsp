<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page import="java.util.ArrayList, java.util.Iterator"%>

	<center class="content">
		<!-- 	</center> -->
		<FORM method="post"
			action="${pageContext.request.contextPath}/StoreServlet">
			<div style="background-color: rgba(84, 84, 84, 0.5;">
				<table>
					<caption>Store</caption>
					<%
						int count = 0;
						String color = "white";
						if (request.getSession().getAttribute("piList") != null) {
							ArrayList al = (ArrayList) request.getSession().getAttribute(
									"piList");
							System.out.println(al);
							Iterator itr = al.iterator();
							while (itr.hasNext()) {

								if ((count % 2) == 0) {
									color = "white";
								}
								count++;
								ArrayList pList = (ArrayList) itr.next();
					%>
					<tr>
					<tr>
						<th><span class="adjoined">Product Name</span></th>
						<td><%=pList.get(0)%></td>
					</tr>
					<tr>
						<th><span class="adjoined">Product Description</span></th>
						<td><%=pList.get(1)%></td>
					</tr>
					<tr>
						<th><span class="adjoined">Cost</span></th>
						<td><%=pList.get(2)%></td>
						<td><button style="width: 45px;"
								class="medium primary btn six columns centered">
								<i class="fa fa-shopping-cart"></i>
							</button></td>

					</tr>
					<%
						}
						}
						if (count == 0) {
					%>
					<tr>
						<td><b>No available item for purchase!</b></td>
					</tr>
					<%
						}
					%>

				</table>
			</div>
		</FORM>

		<%@ include file="footer.jsp"%>
</body>
</html>