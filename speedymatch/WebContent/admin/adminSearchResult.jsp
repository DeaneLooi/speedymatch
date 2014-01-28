<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<title>Result</title>
</head>
<body>
<%@ include file="adminHeader.jsp" %>
<center>
<!-- content here -->

<table width="1000" align="center" style="border:1px solid #000000;">
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#F13C73;">
                    <b>Result</b></td>
            </tr>
            <tr style="background-color:white;">
                <td><b>User id</b></td>
                <td><b>Name</b></td>
                <td><b>Gender</b></td>
                <!-- <td><b>Registration Date</b></td> -->
            </tr>
            <%
                int count = 0;
                String color = "white";
                if (request.getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("piList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {
 
                        if ((count % 2) == 0) {
                            color = "white";
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
                <td><%=pList.get(0)%></td>
                <td><%=pList.get(1)%></td>
                <td><%=pList.get(2)%></td>
               <%--  <td><%=pList.get(3)%></td> --%>
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:white"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
        </table>

</center>
<%@ include file="../pages/footer.jsp" %>
</body>
</html>