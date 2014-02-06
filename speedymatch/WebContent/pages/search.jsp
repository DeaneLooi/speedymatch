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
		<div class="header-looking" id="search-btn">
		</div>
	</div>

	<div class="search" id="left-search">

		<form action ="${pageContext.request.contextPath}/Search" method="post">
			
			<div class="header-looking" id="search-btn">
			<input type="submit" value="Search" /> 
			</div>
			<ul>
				<!-- gender -->
				<li class="field"><span class="title">Gender:</span><label 
						class="drop">
							
								<select name ="gen">
									<option>Male</option>
									<option>Female</option>
								</select>
							
					</label></li>
					
				<!-- smoking -->
				<li class="field"><span class="title">Smoking:</span><label 
						class="drop">
							
								<select name="smoke">
									<option>no</option>
									<option>yes</option>
									<option>occasionally</option>
								</select>
							
					</label></li>	
					<!-- smoking -->
				<li class="field"><span class="title">Drinking:</span><label 
						class="drop">
							
								<select name="drink">
									<option>no</option>
									<option>yes</option>
									<option>occasionally</option>
								</select>
							
					</label></li>	
					<!-- smoking -->
				<li class="field"><span class="title">Status:</span><label 
						class="drop">
							
								<select name="status">
									<option>Single</option>
									<option>Divorced</option>
									<option>Widowed</option>
									<option>Separated</option>
								</select>
							
					</label></li>
				
				<li class="field"><span class="title">Child:</span><label 
						class="drop">
							
								<select name="child">
									<option>no</option>
									<option>yes</option>
								</select>
						
					</label></li>
					
					
					<li class="field"><span class="title">Education:</span><label
						class="drop">
							
								<select name="edu">
									<option>College</option>
									<option>Diploma</option>
									<option>Bachelor</option>
									<option>Master</option>
									<option>Doctoral or above</option>
								</select>
							
					</label></li>	
					
					<li class="field"><span class="title">Zodiac:</span><label
						class="drop">
							
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
							
					</label></li>	
					
					<li class="field"><span class="title">Occupation:</span><label
						class="drop">
						
								<select name="occ">

									<option>Business owner</option>
									<option>Blue collar</option>
									<option>Sales</option>
									<option>Medical field</option>
									<option>Education</option>
									<option>Legal</option>
									<option>Finance</option>
									<option>IT</option>
									<option>Engineer</option>
									<option>Hospitality</option>
									<option>Government</option>
									<option>Researcher</option>
									<option>Others</option>
								</select>
							
					</label></li>
					
					<li class="field"><span class="title">Race:</span><label
						class="drop">
						
								<select name="race">

									<option>Chinese</option>
									<option>Malay</option>
									<option>Indian</option>
									<option>Others</option>
									
								</select>
							
					</label></li>
					
					<li class="field"><span class="title">Religion:</span><label
						class="drop">
						
								<select name="religion">

									<option>Buddhist</option>
									<option>Muslim</option>
									<option>Catholic</option>
									<option>Christian</option>
									<option>Others</option>
								</select>
							
					</label></li>
					
					<li class="field"><span class="title">Hobby:</span><label
						class="drop">
						
								<select name="hobby">
									<option>Outdoor recreation</option>
									<option>Performing arts</option>
									<option>Cooking</option>
									<option>Gardening</option>
									<option>Sports</option>
									<option>Reading</option>
									<option>Collecting</option>
									<option>Traveling</option>
									<option>Online activity</option>
								</select>
							
					</label></li>
						
				<!-- 				age -->
<!-- 				<li class="field"><span class="title">Age:</span> <label -->
<!-- 					class="age"><input class="xnarrow text input" type="text" -->
<!-- 						placeholder="18"> </label>to <label class="age"><input -->
<!-- 						class="xnarrow text input" type="text" placeholder="80"> </label></li> -->

<!-- 				height -->
<!-- 				<li class="field"><span class="title">Height:</span> Min. <label -->
<!-- 					class="height-weight"><input class="xnarrow text input" -->
<!-- 						type="text" placeholder="150cm"> </label>Max. <label -->
<!-- 					class="height-weight"><input class="xnarrow text input" -->
<!-- 						type="text" placeholder="200cm"> </label></li> -->

<!-- 				weight -->
<!-- 				<li class="field"><span class="title">Weight:</span> Min. <label -->
<!-- 					class="height-weight" id="weight"><input -->
<!-- 						class="xnarrow text input" type="text" placeholder="40kg"> -->
<!-- 				</label>Max. <label class="height-weight" id="weight"><input -->
<!-- 						class="xnarrow text input" type="text" placeholder="200kg"> -->
<!-- 				</label></li> -->

			</ul>
		</form>
	</div>
</div>

<%@ include file="footer.jsp"%>
</body>
</html>