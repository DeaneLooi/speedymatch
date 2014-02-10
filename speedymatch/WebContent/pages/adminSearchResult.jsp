<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>
<%@ page import = "speedymatch.entities.*,
				   speedymatch.entities.dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 

"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />
<title>Result</title>
</head>
<body>
<%@ include file="/pages/header.jsp" %>
<center>
<!-- content here -->

<table width="500" align="center" border="1";>
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
                <td>
                <%
                session = request.getSession();
        		String gname = "";
        		if (session.getAttribute("member") != null) {
        			Member member = (Member) session.getAttribute("member");
        			gname = member.getUsername();
        		}

        		else {
        			response.sendRedirect("../login.jsp");
        		}
				%>
                <a href="profile.jsp?gname=<%=pList.get(0)%>"><%=pList.get(0)%></a></td>
            </tr>
            <tr>
                <td><b>First Name</b></td>
                <td><%=pList.get(1)%></td>
            </tr>
            <tr>
                <td><b>Last Name</b></td>
                <td><%=pList.get(2)%></td>
            </tr>
            <tr>
                <td><b>Age</b></td>
                <td><%=pList.get(3)%></td>
            </tr>
            <tr>
                <td><b>Gender</b></td>
                <td><%=pList.get(4)%></td>
            </tr>
            <tr>
                <td><b>Education level</b></td>
                <td><%=pList.get(5)%></td>
            </tr>
            <tr>
                <td><b>Hobby</b></td>
                <td><%=pList.get(6)%></td>
            </tr>
            <tr>
                <td><b>Height</b></td>
                <td><%=pList.get(7)%></td>
            </tr>
            <tr>
                <td><b>Weight</b></td>
                <td><%=pList.get(8)%></td>
            </tr>
            <tr>
                <td><b>Race</b></td>
                <td><%=pList.get(9)%></td>
            </tr>
            <tr>
                <td><b>Religion</b></td>
                <td><%=pList.get(10)%></td>
            </tr>
            <tr>
                <td><b>Child</b></td>
                <td><%=pList.get(11)%></td>
            </tr>
            <tr>    
                <td><b>Horoscope</b></td>
                <td><%=pList.get(12)%></td>
            </tr>
            <tr>
                <td><b>Occupation</b></td>
                <td><%=pList.get(13)%></td>
            </tr>
            <tr>
                <td><b>Smoking</b></td>
                <td><%=pList.get(14)%></td>
            </tr>
            <tr>
                <td><b>Drinking</b></td>
                <td><%=pList.get(15)%></td>
            </tr>
            <tr>
                <td><b>Status</b></td>
                <td><%=pList.get(16)%></td>
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
<%@ include file="../pages/footer.jsp" %>
</body>
</html>