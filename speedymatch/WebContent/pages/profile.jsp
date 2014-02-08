<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="../js/profile.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

		//generate a random number between 1 to 10
		var rand_num1 = Math.round(Math.random() * 10) + 1;
		var rand_num2 = Math.round(Math.random() * 10) + 1;
		//put random nums into the spans
		document.getElementById("digit1").innerHTML = rand_num1;
		document.getElementById("digit2").innerHTML = rand_num2;
	});

	function validate() {
		var answer = document.getElementById("answer").value;
		var digit1 = parseInt(document.getElementById("digit1").innerHTML);
		var digit2 = parseInt(document.getElementById("digit2").innerHTML);
		var sum = digit1 + digit2;
		if (answer == null || answer == "") {
			alert("Please provide the answer to the simple addition.");
			return false;
		} else if (answer != sum) {
			alert("Wrong answer!");
			return false;
		} else {
			document.getElementById("updateBtn").disabled = false;
			document.getElementById("answer").innerHTML = "";
			return true;
		}
	}
</script>
<title>Profile</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/profile.css">
</head>
${alert}
<%
	request.getSession().removeAttribute("alert");
%>
<body>
	<%@ include file="header.jsp"%>
	<%@ page
		import="speedymatch.entities.Profile,speedymatch.entities.dao.ProfileDAO,java.util.Date"%>
	<%
		Member member = (Member) request.getSession()
				.getAttribute("member");
		Profile profile = new Profile();
		profile.setUsername(member.getUsername());
		profile = ProfileDAO.retrieveProfile(profile);

		String fname = member.getFname();
		String lname = member.getLname();
		String email = member.getEmail();
		int age = profile.getAge();
		int height = profile.getHeight();
		int weight = profile.getWeight();
		Date dob = member.getDob();

		String gender = profile.getGender();
		String child = profile.getChild();
		String smoking = profile.getSmoking();
		String drinking = profile.getDrinking();
		String relaStatus = profile.getRace();
		String eduLevel = profile.getEduLevel();
		String race = profile.getRace();
		String hobby = profile.getHobby();
		String religion = profile.getReligion();
		String occupation = profile.getOccupation();
		String horo = profile.getHoro();
		String cpw = member.getPasswd();
	%>
	<center>
		<!-- content here -->
		<FORM method="post"
			action="${pageContext.request.contextPath}/Profile">
			<table class="profile">
				<caption>Profile</caption>
				<tr class="prepend field">
					<th><span class="adjoined">User ID</span></th>
					<td><h3 id="username"><%=username%></h3></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Age</span></th>
					<td><input name="age" class="xwide text input" type="text"
						placeholder="enter age" value=<%=age%>></td>
				</tr>
				<!-- 				<tr class="prepend field">
					<th><span class="adjoined">New Password</span></th>
					<td><input name="pw " class="password input" type="password"
						placeholder="Enter new password"></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Confirm Password</span></th>
					<td><input name="cpw" class="password input" type="password"
						placeholder="Enter password again"></td>
				</tr> -->
				<tr class="prepend field">
					<th><span class="adjoined">First Name</span></th>
					<td><input name="fname" class="xwide text input" type="text"
						placeholder="enter first name" value=<%=fname%>></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Last Name</span></th>
					<td><input name="lname" class="xwide text input" type="text"
						placeholder="Enter last name" value=<%=lname%>></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Email</span></th>
					<td><input name="email" class="email input" type="text"
						placeholder="Enter email" value=<%=email%>></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Date of Birth</span></th>
					<td><input name="dob" class="xwide text input" type="date"
						placeholder="DDMMYYYY" value=<%=dob%>></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Height:</span></th>
					<td><input name="height" class="narrow text input" type="text"
						value=<%=height%>><span class="adjoined">cm</span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Weight</span></th>
					<td><input name="weight" class="narrow text input" type="text"
						value=<%=weight%>><span class="adjoined">kg</span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Gender</span></th>
					<td><label class="radio" for="male"> <input
							name="gender" value="m" type="radio"> <span></span>Male
					</label> <label class="radio" for="female"> <input name="gender"
							value="f" type="radio"> <span></span>Female
					</label></td>
					<td><span>pre-edit: <%=gender%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Want children?</span></th>
					<td><label class="radio checked" for="yes"> <input
							name="child" value="yes" type="radio" id="yes"> <span></span>Yes
					</label> <label class="radio" for="no"> <input name="child"
							value="no" type="radio" id="no"> <span></span>No
					</label></td>
					<td><span>pre-edit: <%=child%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Smokes?</span></th>
					<td><div class="picker">
							<select name="smoking">
								<option value="no">No</option>
								<option value="occasionally">Occasionally</option>
								<option value="often">Often</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=smoking%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Drinks?</span></th>
					<td><div class="picker">
							<select name="drinking">
								<option value="no">No</option>
								<option value="occasionally">Occasionally</option>
								<option value="often">Often</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=drinking%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Relationship Status</span></th>
					<td><div class="picker">
							<select name="relaStatus">
								<option value="single">Single</option>
								<option value="divorced">Divorced</option>
								<option value="widowed">Widowed</option>
								<option value="separated">Separated</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=relaStatus%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Horoscope</span></th>
					<td><div class="picker">
							<select name="horo">
								<option value="aries">Aries</option>
								<option value="taurus">Taurus</option>
								<option value="gemini">Gemini</option>
								<option value="cancer">Cancer</option>
								<option value="leo">Leo</option>
								<option value="virgo">Virgo</option>
								<option value="libra">Libra</option>
								<option value="scorpio">Scorpio</option>
								<option value="sagittarius">Sagittarius</option>
								<option value="capricorn">Capricorn</option>
								<option value="aquarius">Aquarius</option>
								<option value="pisces">Pisces</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=horo%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Education Level</span></th>
					<td><div class="picker">
							<select name="eduLevel">
								<option value="high school and below">High School and
									below</option>
								<option value="college">College</option>
								<option value="diploma">Diploma</option>
								<option value="bachelor">Bachelor</option>
								<option value="master">Master</option>
								<option value="doctorate and above">Doctorate and above</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=eduLevel%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Occupation</span></th>
					<td><div class="picker">
							<select name="occupation">
								<option value="business owner">Business owner</option>
								<option value="blue collar">Blue collar</option>
								<option value="sales">Sales</option>
								<option value="medical field">Medical field</option>
								<option value="education">Education</option>
								<option value="legal">Legal</option>
								<option value="finance">Finance</option>
								<option value="IT">IT</option>
								<option value="engineer">Engineer</option>
								<option value="hospitality">Hospitality</option>
								<option value="government">Government</option>
								<option value="researcher">Researcher</option>
								<option value="others">Others</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=occupation%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Race</span></th>
					<td><div class="picker">
							<select id="race">
								<option value="chinese">Chinese</option>
								<option value="malay">Malay</option>
								<option value="indian">Indian</option>
								<option value="others">Others</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=race%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Religion</span></th>
					<td><div class="picker">
							<select id="religion">
								<option value="buddhist">Buddhist</option>
								<option value="muslim">Muslim</option>
								<option value="christian">Christian</option>
								<option value="catholic">Catholic</option>
								<option value="others">Others</option>
							</select>
						</div></td>
					<td><span>pre-edit: <%=religion%></span></td>
				</tr>
				<tr class="prepend field">
					<th><span class="adjoined">Hobbies</span></th>
					<td><label class="checkbox" for="online activities"> <input
							name="hobby" type="checkbox" value="online activities"> <span></span>
							Online activities
					</label> <label class="checkbox" for="outdoor recreation"> <input
							name="hobby" type="checkbox" value="outdoor recreation">
							<span></span> Outdoor recreation
					</label> <label class="checkbox" for="performing arts"> <input
							name="hobby" type="checkbox" value="performing arts"> <span></span>
							Performing arts
					</label> <label class="checkbox" for="cooking"> <input name="hobby"
							type="checkbox" value="cooking"> <span></span> Cooking
					</label> <label class="checkbox" for="gardening"> <input
							name="hobby" type="checkbox" value="gardening"> <span></span>
							Gardening
					</label> <label class="checkbox" for="sports"> <input name="hobby"
							type="checkbox" value="sports"> <span></span> Sports
					</label> <label class="checkbox" for="reading"> <input name="hobby"
							type="checkbox" value="reading"> <span></span> Reading
					</label> <label class="checkbox" for="collecting"> <input
							name="hobby" type="checkbox" value="collecting"> <span></span>
							Collecting
					</label> <label class="checkbox" for="gardening"> <input
							name="hobby" type="checkbox" value="gardening"> <span></span>
							Gardening
					</label> <label class="checkbox" for="traveling"> <input
							name="hobby" type="checkbox" value="traveling"> <span></span>
							Traveling
					</label></td>
					<td><span>pre-edit: <%=hobby%></span></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

			</table>
			<!-- h3 was strong originally while strong was span originally -->
			<h3>Add these numbers to make sure you're human</h3>
			<strong id="digit1"> </strong> + <strong id="digit2"> </strong> = <input
				type="text" id="answer" size="2" /> <input
				class="medium primary btn" type="button" value="submit"
				onclick="return validate()"> <input type="submit"
				style="width: 150px;" class="medium primary btn" value="Update"
				id="updateBtn" disabled="disabled" />
		</form>
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>