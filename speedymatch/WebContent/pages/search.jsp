<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/search.css">

</head>

<%@include file="/pages/header.jsp"%>

<div class="search" id="advance">

	<div class="search" id="header-s">
		<div class="header-looking" id="search-h">I am looking for...</div>
		
	</div>

	<div class="search" id="left-search">

		<form action ="${pageContext.request.contextPath}/Search" method="post">
			<table width="700px">
			
		<div class="medium default btn">
		<input type ="submit" name="submit" value="Search">
		</div>
			
			<tr class="prepend field">
				<!-- gender -->
				<td><span>Gender:</span></td>
					<td><div class="picker">		
								<select name ="gen">
									<option>Male</option>
									<option>Female</option>
								</select>
					</div></td>		
			</tr>
			<tr class="prepend field">
				<!-- smoking -->
				<td><span>Smoking:</span></td>
							<td><div class="picker">
								<select name="smoke">
									<option>No</option>
									<option>Yes</option>
									<option>Occasionally</option>
								</select>
							</div></td>
						
			</tr>
			
			<tr class="prepend field">
					<!-- drinking -->
				<td><span>Drinking:</span>
							<td><div class="picker">
								<select name="drink">
									<option>No</option>
									<option>Yes</option>
									<option>Occasionally</option>
								</select>
					</div></td></tr>		
						
					<tr class="prepend field">
				<td><span>Status:</span>
							<td><div class="picker">
								<select name="status">
									<option>Single</option>
									<option>Divorced</option>
									<option>Widowed</option>
									<option>Separated</option>
								</select>
							
					</div></td></tr>
				<tr class="prepend field">
				<td><span>Want child:</span>
							<td><div class="picker">
								<select name="child">
									<option>No</option>
									<option>Yes</option>
								</select>
						
					</div></td></tr>
					
					<tr class="prepend field">
					<td><span>Education:</span>
							<td><div class="picker">
								<select name="edu">
									<option>College</option>
									<option>Diploma</option>
									<option>Bachelor</option>
									<option>Master</option>
									<option>Doctoral or above</option>
								</select>
							
					</div></td>	</tr>
					<tr class="prepend field">
					<td><span>Zodiac:</span>
							<td><div class="picker">
								<select name ="zodiac">
									<option>Aries</option>
									<option>Taurus</option>
									<option>Gemini</option>
									<option>Cancer</option>
									<option>Leo</option>
									<option>Virgo</option>
									<option>Libra</option>
									<option>Scorpio</option>
									<option>Sagittarius</option>
									<option>Capricorn</option>
									<option>Aquarius</option>
									<option>Pisces</option>
								</select>
							
					</div></td>	</tr>
					<tr class="prepend field">
					<td><span>Occupation:</span>
							<td><div class="picker">
								<select name="occupation">

									<option>IT</option>
									<option>Blue collar</option>
									<option>Sales</option>
									<option>Medical field</option>
									<option>Education</option>
									<option>Legal</option>
									<option>Finance</option>
									<option>Business owner</option>
									<option>Engineer</option>
									<option>Hospitality</option>
									<option>Government</option>
									<option>Researcher</option>
									<option>Others</option>
								</select>
							
					</div></td></tr>
					<tr class="prepend field">
					<td><span>Race:</span>
						<td><div class="picker">
								<select name="race">

									<option>Chinese</option>
									<option>Malay</option>
									<option>Indian</option>
									<option>Others</option>
									
								</select>
							
					</div></td>
					<tr class="prepend field">
					<td><span>Religion:</span>
						<td><div class="picker">
								<select name="religion">

									<option>Buddhist</option>
									<option>Muslim</option>
									<option>Catholic</option>
									<option>Christian</option>
									<option>Others</option>
								</select>
							
					</div></td></tr>
					<tr class="prepend field">
					<td><span>Hobby:</span>
						<td><div class="picker">
								<select name="hobby">
									<option>Cooking</option>
									<option>Performing arts</option>
									<option>Outdoor recreation</option>
									<option>Gardening</option>
									<option>Sports</option>
									<option>Reading</option>
									<option>Collecting</option>
									<option>Traveling</option>
									<option>Online activity</option>
								</select>
							
					</div></td></tr>

			
			</table>
		</form>
	</div>
</div>

<%@ include file="footer.jsp"%>
</body>
</html>