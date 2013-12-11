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

		<h1 class="lead">Online Cinema</h1>
		
					<form>

						<label for="movie">Select movie</label>

						<div class="picker">
							<select id="movie" name="movie">
								<option value="#" disabled>Select movie</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
								<option>EXTERMINATE</option>
							</select>
						</div>

						<label for="friend">Select friend</label>

						<div class="picker">
							<select id="friend" name="friend">
								<option value="#" disabled>Select friend</option>
								<option>Samuel Ong K.C</option>
							</select>
						</div>
						<br>
						<div class="medium primary btn">
							<input type="submit" value="send request" />	
							
						</div>
						
					</form>


<%@ include file="footer.jsp" %>
</html>

			