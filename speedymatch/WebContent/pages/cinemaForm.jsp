<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="../images/SpeedyMatch.png" type="image/x-icon" />

<title>Online Cinema</title>
</head>

<%@ include file="header.jsp" %>

<%@ page import="speedymatch.entities.Movie,
speedymatch.entities.dao.MovieDAO,
speedymatch.entities.FriendList,
speedymatch.entities.dao.FriendListDAO,
java.util.ArrayList" %>

<% ArrayList<Movie>movies = MovieDAO.retrieveMovies(); 
	FriendList f = new FriendList(username);
	f = FriendListDAO.retrieveFriends(f);
	ArrayList<String>friends = f.getFriendList();
%>
		<h1 class="lead">Online Cinema</h1>
		
					<form method="post" action="${pageContext.request.contextPath}/CinemaForm">

						<label for="movie">Select movie</label>

						<div class="picker">
							<select id="movie" name="movie">
								<option value="#" disabled>Select movie</option>
								<%for(int i=0; i<movies.size();i++){ %>
								<option value="<%=movies.get(i).getMovieId()%>"><%=movies.get(i).getMovieId() %></option>
								<%} %>
							</select>
						</div>

						<label for="friend">Select friend</label>

						<div class="picker">
							<select id="friend" name="friend">
								<option value="#" disabled>Select friend</option>
								<%
								if(friends.size()!=0){
								for(int i=0; i<friends.size();i++){ %>
								<option value="<%=friends.get(i)%>"><%=friends.get(i) %></option>
								<%} 
								}
								else{
								%>
								<%	
								}%>
							</select>
						</div>
						<br>
						<div class="medium primary btn">
							<input type="submit" value="send request" />	
							
						</div>
						
					</form>


<%@ include file="footer.jsp" %>
</html>

			