<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<script type="text/javascript">
	function chckpw() {
		var pw = document.getElementById("pw").text;
		var pw2 = document.getElementById("cpw").text;

		if (pw == pw2) {
			document.getElementById("updateBtn").disabled = false;
			return true;
		} else
			return false;
	}

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

	function randNums() {
		//generate a random number between 1 to 10
		var rand_num1 = math.floor(Math.random() * 10) + 1;
		var rand_num2 = math.floor(Math.random() * 10) + 1;
		//put random nums into the spans
		document.getElementById("digit1").value = rand_num1;
		document.getElementById("digit2").value = rand_num2;
	}
</script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="../js/profile.js"></script>
<title>Profile</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/profile.css">
</head>
<body onload="randNums();">
	<%@ include file="header.jsp"%>
	<%@ page import="speedymatch.entities.Member"%>
	<center>
		<!-- content here -->
		<FORM method="get" action="updateProfile.jsp" onload="randNums()">
			<table class="profile">
				<tr class="prepend field">
					<td><span class="adjoined">User ID</span></td>
					<td><label id="userID"><%=username%></label></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">New Password</span></td>
					<td><input name="pw " class="password input" type="password"
						placeholder="Enter new password"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Confirm Password</span></td>
					<td><input name="cpw" class="password input" type="password"
						placeholder="Enter password again"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Name</span></td>
					<td><input name="name" class="xwide text input" type="text"
						placeholder="Enter name"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Email</span></td>
					<td><input name="email" class="email input" type="text"
						placeholder="Enter email"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Telephone</span></td>
					<td><input name="phone" class="phone input" type="tel"
						placeholder="Enter phone"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Birthdate</span></td>
					<td><input name="dob" class="xwide text input" type="text"
						placeholder="DDMMYYYY"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Address</span></td>
					<td><textarea name="add" class="input textarea"
							placeholder="Enter address" rows="3"></textarea></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Height:</span></td>
					<td><input name="height" class="narrow text input" type="text"><span
						class="adjoined">cm</span></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Gender</span></td>
					<td>
						<div class="picker">
							<select name="gender">
								<option id="m">Male</option>
								<option id="f">Female</option>
							</select>
						</div>
					</td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Weight</span></td>
					<td><input name="weight" class="narrow text input" type="text"><span
						class="adjoined">kg</span></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Smokes?</span></td>
					<td><div class="picker">
							<select name="smoke">
								<option id="nonSmoker">No</option>
								<option id="occSmoker">Occasionally</option>
								<option id="heavySmoker">Often</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Drinks?</span></td>
					<td><div class="picker">
							<select name="drink">
								<option id="noDrink">No</option>
								<option id="occDrink">Occasionally</option>
								<option id="heavyDrink">Often</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Relationship Status</span></td>
					<td><div class="picker">
							<select name="rs">
								<option id="single">Single</option>
								<option id="divorced">Divorced</option>
								<option id="widowed">Widowed</option>
								<option id="separated">Separated</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Want children?</span></td>
					<td><label class="radio checked" for="radio1"> <input
							name="child" value="1" type="radio" id="radioYes"> <span></span>Yes
					</label> <label class="radio" for="radio2"> <input name="child"
							value="2" type="radio" id="radioNo"> <span></span>No
					</label></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Education Level</span></td>
					<td><div class="picker">
							<select name="el">
								<option id="olvl">Secondary and below</option>
								<option id="dip">Diploma</option>
								<option id="deg">Degree</option>
								<option id="bach">Bachelor</option>
								<option id="master">Master</option>
								<option id="Dr">Doctorate and above</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Occupation</span></td>
					<td><input name="occupation" class="xwide text input"
						type="text" placeholder="Enter Occupation"></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Ethnic</span></td>
					<td><div class="picker">
							<select id="ethnic">
								<option id="chinese">Chinese</option>
								<option id="malay">Malay</option>
								<option id="indian">Indian</option>
								<option id="caucasian">Caucasian</option>
								<option id="ethnic.others">Others</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Religion</span></td>
					<td><div class="picker">
							<select id="religion">
								<option id="Buddhist">Buddhist</option>
								<option id="Taoist">Taoist</option>
								<option id="Muslim">Muslim</option>
								<option id="Christian">Christian</option>
								<option id="Catholic">Catholic</option>
								<option id="Atheist">Atheist</option>
								<option id="Free-thinker">Free-thinker</option>
								<option id="Others">Others</option>
							</select>
						</div></td>
				</tr>
				<tr class="prepend field">
					<td><span class="adjoined">Hobbies</span></td>
					<td><label class="checkbox" for="checkbox1"> <input
							name="hobby1" type="checkbox" id="checkbox1"> <span></span>
							Online activities
					</label> <label class="checkbox" for="checkbox2"> <input
							name="hobby2" type="checkbox" id="checkbox2"> <span></span>
							Outdoor recreation
					</label> <label class="checkbox" for="checkbox3"> <input
							name="hobby3" type="checkbox" id="checkbox3"> <span></span>
							Performing arts
					</label> <label class="checkbox" for="checkbox4"> <input
							name="hobby4" type="checkbox" id="checkbox4"> <span></span>
							Cooking
					</label> <label class="checkbox" for="checkbox5"> <input
							name="hobby5" type="checkbox" id="checkbox5"> <span></span>
							Gardening
					</label> <label class="checkbox" for="checkbox6"> <input
							name="hobby6" type="checkbox" id="checkbox6"> <span></span>
							Sports
					</label> <label class="checkbox" for="checkbox6"> <input
							name="hobby6" type="checkbox" id="checkbox6"> <span></span>
							Reading
					</label> <label class="checkbox" for="checkbox7"> <input
							name="hobby7" type="checkbox" id="checkbox7"> <span></span>
							Collecting
					</label> <label class="checkbox" for="checkbox8"> <input
							name="hobby8" type="checkbox" id="checkbox8"> <span></span>
							Gardening
					</label> <label class="checkbox" for="checkbox9"> <input
							name="hobby9" type="checkbox" id="checkbox9"> <span></span>
							Traveling
					</label></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>

			</table>
			<strong>Add these numbers to make sure you're human</strong> <span
				id="digit1"> </span> + <span id="digit2"> </span> = <input
				type="text" id="answer" size="2" /> <input
				class="medium primary btn" type="submit" value="submit"
				onclick="return validate()">
		</form>
		<input type="button" style="width: 150px;" class="medium primary btn"
			value="Update" id="updateBtn" onclick="return chckpw()" disabled />
		</FORM>
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>