<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<title>Search Result</title>
</head>
<body>
<%@ include file="header.jsp"%>

<center>
<!-- content here -->
<table width="700" align="center" border="1";>
	          <theader> 
                <tb><b>Result</b></tb>
              </theader> 
             <%
                int count = 0;
                String color = "white";
                if (request.getSession().getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getSession().getAttribute("piList");
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
                <td><b>Username</b></td>
                <td><%=pList.get(0)%></td>
            </tr>
            
            <tr>
                <td><b>Gender</b></td>
                <td><%=pList.get(1)%></td>
            </tr>
            <tr>
                <td><b>Age</b></td>
                <td><%=pList.get(2)%></td>
            </tr>
            <tr>
                <td><b>Height(CM)</b></td>
                <td><%=pList.get(3)%></td>
            </tr>
            <tr>
                <td><b>Weight(KG)</b></td>
                <td><%=pList.get(4)%></td>
            </tr>
            <tr>
            <td>&nbsp;</td>
            </tr>
          
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td><b>No Result Found</b></td>
            </tr>
            <%            }
            %>
        </table>
       
</center>
<%@ include file="footer.jsp"%>
</body>
</html>