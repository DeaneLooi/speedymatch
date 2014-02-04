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

<%@include file="header.jsp"%>

<div class="search" id="advance">

	<div class="search" id="header-s">
		<div class="header-looking" id="search-h">I am looking for...</div>
		<div class="header-looking" id="search-btn">
			<a href="#">Search</a>
		</div>
	</div>

	<div class="search" id="left-search">

		<form>
			<ul>
				<!-- gender -->
				<li class="field" id="gender"><span class="title">Gender:</span><label
					class="radio checked" for="radio1"> <input name="gender"
						value="1" type="radio" id="radio1"> <span></span> Male
				</label> <label class="radio" for="radio2"> <input name="gender"
						value="2" type="radio" id="radio2"> <span></span> Female
				</label></li>

				<!--age-->
				<li class="field"><span class="title">Age:</span> <label
					class="age"><input class="xnarrow text input" type="text"
						placeholder="18"> </label>to <label class="age"><input
						class="xnarrow text input" type="text" placeholder="80"> </label></li>

				<!--height-->
				<li class="field"><span class="title">Height:</span> Min. <label
					class="height-weight"><input class="xnarrow text input"
						type="text" placeholder="150cm"> </label>Max. <label
					class="height-weight"><input class="xnarrow text input"
						type="text" placeholder="200cm"> </label></li>

				<!--weight-->
				<li class="field"><span class="title">Weight:</span> Min. <label
					class="height-weight" id="weight"><input
						class="xnarrow text input" type="text" placeholder="40kg">
				</label>Max. <label class="height-weight" id="weight"><input
						class="xnarrow text input" type="text" placeholder="200kg">
				</label></li>

				<!-- smoking -->
				<li class="field"><span class="title">Smokes:</span><label
					class="radio checked" for="radio1"> <input name="smokes"
						value="1" type="radio" id="radio1"> <span></span>No
				</label> <label class="radio" for="radio2"> <input name="smokes"
						value="2" type="radio" id="radio2"> <span></span>
						Occasionally
				</label><label class="radio" for="radio3"> <input name="smokes"
						value="3" type="radio" id="radio3"><span></span> Often
				</label></li>

				<!-- drinking -->
				<li class="field"><span class="title">Drinks:</span><label
					class="radio checked" for="radio1"> <input name="drinks"
						value="1" type="radio" id="radio1"> <span></span>No
				</label> <label class="radio" for="radio2"> <input name="drinks"
						value="2" type="radio" id="radio2"> <span></span>
						Occasionally
				</label><label class="radio" for="radio3"> <input name="drinks"
						value="3" type="radio" id="radio3"><span></span> Often
				</label></li>

				<!-- relationship status -->
				<li class="field"><p>
						<span class="title">Relationship status:</span>
					</p> <label class="radio checked" for="radio1"> <input
						name="status" value="1" type="radio" id="radio1"> <span></span>I
						don't care
				</label> <label class="radio" for="radio2"> <input name="status"
						value="2" type="radio" id="radio2"> <span></span> Single
				</label><label class="radio" for="radio3"> <input name="status"
						value="3" type="radio" id="radio3"><span></span> Divorced
				</label><label class="radio" for="radio3"> <input name="status"
						value="4" type="radio" id="radio4"><span></span> Widowed
				</label><label class="radio" for="radio4"> <input name="status"
						value="5" type="radio" id="radio5"><span></span> Separated
				</label></li>

				<!-- children -->
				<li class="field"><p>
						<span class="title">Want children?</span>
					</p> <label class="radio checked" for="radio1"> <input
						name="child" value="1" type="radio" id="radio1"> <span></span>I
						don't know
				</label> <label class="radio" for="radio2"> <input name="child"
						value="2" type="radio" id="radio2"> <span></span>Yes
				</label><label class="radio" for="radio3"> <input name="child"
						value="3" type="radio" id="radio3"><span></span> No
				</label></li>

			</ul>
		</form>
	</div>

	<div class="search" id="right-search">

		<div class="search" id="inner-right-search">
			<form>
				<ul>
					<!-- edu -->
					<li class="field"><span class="title">Education:</span><label
						class="drop">
							<div class="picker">
								<select>
									<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
									<option>I don't care</option>
									<option>High school or below</option>
									<option>College</option>
									<option>Diploma</option>
									<option>Bachelor</option>
									<option>Master</option>
									<option>Doctorate or above</option>
								</select>
							</div>
					</label></li>

					<!-- Zodiac -->
					<li class="field"><span class="title">Zodiac:</span><label
						class="drop">
							<div class="picker">
								<select>
									<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
									<option>I don't care</option>
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
							</div>
					</label></li>

					<!-- occupation -->
					<li class="field"><span class="title">Occupation:</span><label
						class="drop">
							<div class="picker">
								<select>
									<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
									<option>I don't care</option>
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
							</div>
					</label></li>
				</ul>
			</form>
		</div>
		<form>
			<ul>
				<!-- ethnicity -->
				<li class="field"><p>
						<span class="title">Ethnicity:</span>
					</p> <label class="checkbox" for="checkbox1"> <input name="eth"
						type="checkbox" checked="" id="checkbox1"> <span></span> I
						dont't care
				</label> <label class="checkbox" for="checkbox2"> <input name="eth"
						type="checkbox" id="checkbox2"> <span></span> Chinese
				</label> <label class="checkbox" for="checkbox3"> <input name="eth"
						type="checkbox" id="checkbox3"> <span></span> Malay
				</label> <label class="checkbox" for="checkbox4"> <input name="eth"
						type="checkbox" id="checkbox4"> <span></span> Indian
				</label> <label class="checkbox" for="checkbox5"> <input name="eth"
						type="checkbox" id="checkbox5"> <span></span> Others
				</label></li>

				<!-- religion -->
				<li class="field"><p>
						<span class="title">Religion:</span>
					</p> <label class="checkbox" for="checkbox1"> <input
						name="religion1" type="checkbox" checked="" id="checkbox1">
						<span></span> I dont't care
				</label> <label class="checkbox" for="checkbox2"> <input
						name="religion2" type="checkbox" id="checkbox2"> <span></span>
						Buddhist
				</label> <label class="checkbox" for="checkbox3"> <input
						name="religion3" type="checkbox" id="checkbox3"> <span></span>
						Muslim
				</label> <label class="checkbox" for="checkbox4"> <input
						name="religion4" type="checkbox" id="checkbox4"> <span></span>
						Catholic
				</label> <label class="checkbox" for="checkbox5"> <input
						name="religion5" type="checkbox" id="checkbox5"> <span></span>
						Christian
				</label> <label class="checkbox" for="checkbox6"> <input
						name="religion6" type="checkbox" id="checkbox6"> <span></span>
						Others
				</label></li>

				<!-- hobby -->
				<li class="field"><p>
						<span class="title">Hobby:</span>
					</p> <label class="checkbox" for="checkbox1"> <input
						name="hobby1" type="checkbox" checked="""checkbox1"> <span></span>
						I don't care
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
				</label> <label class="checkbox" for="checkbox10"> <input
						name="hobby10" type="checkbox" id="checkbox10"> <span></span>
						Online activities
				</label></li>

			</ul>
		</form>
	</div>
</div>

<%@ include file="footer.jsp"%>
</body>
</html>