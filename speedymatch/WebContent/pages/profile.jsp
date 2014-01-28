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
		document.getElementById("digit1").innerHTML = rand_num1;
		document.getElementById("digit1").innerHTML = rand_num2;
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
<body onload="randomNums();">
	<%@ include file="header.jsp"%>
	<center>
		<!-- content here -->
		<table class="profile">
			<tr class="prepend field">
				<td><span class="adjoined">User ID</span></td>
				<td><label id="userID">Samuel Ong</label></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">New Password</span></td>
				<td><input class="password input" type="password"
					placeholder="Enter new password"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Confirm Password</span></td>
				<td><input class="password input" type="password"
					placeholder="Enter password again"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Name</span></td>
				<td><input class="xwide text input" type="text"
					placeholder="Enter display name"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Email</span></td>
				<td><input class="email input" type="text"
					placeholder="Enter email"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Telephone</span></td>
				<td><input class="phone input" type="tel"
					placeholder="Enter phone"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Birthdate</span></td>
				<td><input class="xwide text input" type="text"
					placeholder="DDMMYYYY"></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Address</span></td>
				<td><textarea class="input textarea"
						placeholder="Enter address" rows="3"></textarea></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Height:</span></td>
				<td><input class="narrow text input" type="text"><span
					class="adjoined">cm</span></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Gender</span></td>
				<td>
					<div class="picker">
						<select>
							<option>Male</option>
							<option>Female</option>
						</select>
					</div>
				</td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Weight</span></td>
				<td><input class="narrow text input" type="text"><span
					class="adjoined">kg</span></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Smokes?</span></td>
				<td><div class="picker">
						<select>
							<option>No</option>
							<option>Occasionally</option>
							<option>Often</option>
						</select>
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Drinks?</span></td>
				<td><div class="picker">
						<select>
							<option>No</option>
							<option>Occasionally</option>
							<option>Often</option>
						</select>
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Relationship Status</span></td>
				<td><div class="picker">
						<select>
							<option>Single</option>
							<option>Divorced</option>
							<option>Widowed</option>
							<option>Separated</option>
						</select>
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Want children?</span></td>
				<td><label class="radio checked" for="radio1"> <input
						name="child" value="1" type="radio" id="radio1"> <span></span>Yes
				</label> <label class="radio" for="radio2"> <input name="child"
						value="2" type="radio" id="radio2"> <span></span>No
				</label></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Education Level</span></td>
				<td><div class="picker">
						<select>
							<option>Secondary and below</option>
							<option>Diploma</option>
							<option>Degree</option>
							<option>Bachelor</option>
							<option>Master</option>
							<option>Doctorate and above</option>
						</select>
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Occupation</span></td>
				<td><div class="picker">
						<select>
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
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Ethnic</span></td>
				<td><div class="picker">
						<select>
							<option>Chinese</option>
							<option>Malay</option>
							<option>Indian</option>
							<option>Caucasian</option>
							<option>Others</option>
						</select>
					</div></td>
			</tr>
			<tr class="prepend field">
				<td><span class="adjoined">Religion</span></td>
				<td><div class="picker">
						<select>
							<option>Buddhist</option>
							<option>Taoist</option>
							<option>Muslim</option>
							<option>Christian</option>
							<option>Catholic</option>
							<option>Atheist</option>
							<option>Free-thinker</option>
							<option>Others</option>
						</select>
					</div></td>
			</tr>
			<!-- <tr class="prepend field">
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
			</tr> -->
			<tr>
				<td>&nbsp;</td>
			</tr>

		</table>
		<form action="" method="post" onsubmit="return validate();">
			<strong>Add these numbers to make sure you're human</strong> <span
				id="digit1"></span> + <span id="digit2"></span> = <input type="text"
				id="answer" size="2" /> <input type="submit" value="submit">
		</form>
		<input type="button" style="width: 150px; disabled: true;"
			class="medium primary btn" value="Update" id="updateBtn" />
		<%@ include file="footer.jsp"%>
</body>
</html>