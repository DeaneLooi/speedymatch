<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Enter to database</title></head>
<body>
<div id="tfheader">
		<form id="tfnewsearch" method="get" action="adminSearchResult.jsp">
		        <input type="text" class="tftextinput" name="username" size="21" 
maxlength="100"><input type="submit" value="Search" class="tfbutton">    
		</form>
	</div>
<table>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*;" %>
<% 

java.sql.Connection con = null;
java.sql.Statement s = null;
java.sql.ResultSet rs = null;
java.sql.PreparedStatement pst = null;


// Remember to change the next line with your own environment 
String url= "jdbc:mysql://127.0.0.1:3306/speedymatch";
String id= "adming1vWayv";
String pass = "2MVCBKUIFISG";
try{

Class.forName("com.mysql.jdbc.Driver");
con = java.sql.DriverManager.getConnection(url, id, pass);

}catch(ClassNotFoundException cnfex){
cnfex.printStackTrace();

}
String sql = "select * from Profiles";
try{
s = con.createStatement();
rs = s.executeQuery(sql);
%>

<%
while( rs.next() ){
%><tr>

<td><%= rs.getInt("username") %></td>
<td><%= rs.getString("age") %></td>
<td><%= rs.getString("gender") %></td>

</tr>
<%
}
%>

<%

}
catch(Exception e){e.printStackTrace();}
finally{
if(rs!=null) rs.close();
if(s!=null) s.close();
if(con!=null) con.close();
}

%>

</body>
</html>