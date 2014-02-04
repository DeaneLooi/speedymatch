<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Love Meter</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />

<script type="text/javascript">
	function compatibility() {
		var c;
		var s1 = document.getElementById('sign1').selectedIndex.text;
		var s2 = document.getElementById('sign2').selectedIndex.text;

		if (s1 == "Aries" && s2 == "Pisces" || s1 == "Pisces" && s2 == "Aries") {
			c = "15%";
		}

		document.getElementById('compatibility').text = c;
	}
</script>

</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page
		import="speedymatch.entities.Horoscope,
	speedymatch.entities.dao.HoroscopeDAO"%>
	<%
		String sign1 = s1;
		Horoscope h1 = new Horoscope(sign1);
		String desc1 = h1.getHoroscopeDesc();

		String sign2 = document.getElementById("Sign2").selectedIndex.text;
		Horoscope h2 = new Horoscope(sign2);
		String desc2 = h2.getHoroscopeDesc();
	%>

	<center class="content">
		<!-- 	</center> -->
		<table width="100%" cellpadding="0" cellspacing="0">
			<tbody>
				<tr valign="top">
					<td>&nbsp;</td>
					<td><span>Your Sign</span></td>
					<td width="250" style="text-align: left;"><img id="sign1Image"
						src="../images/SpeedyMatch.png" width="100" border="0"><br>
						<div class="picker">
							<select name="sign1"
								onchange="document.getElementById('sign1Image').src='../images/'+ this.options[this.selectedIndex].text +'.gif';">
								<option value="1">Aries</option>
								<option value="2">Taurus</option>
								<option value="3">Gemini</option>
								<option value="4">Cancer</option>
								<option value="5">Leo</option>
								<option value="6">Virgo</option>
								<option value="7">Libra</option>
								<option value="8">Scorpio</option>
								<option value="9">Sagittarius</option>
								<option value="10">Capricorn</option>
								<option value="11">Aquarius</option>
								<option value="12">Pisces</option>
							</select>
						</div></td>
					<td>&nbsp;</td>
					<td><span>His/Her Sign</span></td>
					<td width="250" style="text-align: left;"><img id="sign2Image"
						src="../images/SpeedyMatch.png" width="100" border="0"><br>
						<div class="picker">
							<select name="sign2"
								onchange="document.getElementById('sign2Image').src='../images/'+ this.options[this.selectedIndex].text +'.gif';">
								<option value="1">Aries</option>
								<option value="2">Taurus</option>
								<option value="3">Gemini</option>
								<option value="4">Cancer</option>
								<option value="5">Leo</option>
								<option value="6">Virgo</option>
								<option value="7">Libra</option>
								<option value="8">Scorpio</option>
								<option value="9">Sagittarius</option>
								<option value="10">Capricorn</option>
								<option value="11">Aquarius</option>
								<option value="12">Pisces</option>
							</select>
						</div></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td colspan="3" align="center"><input
						class="medium primary btn" id="button" name="" type="button"
						value="Get your Love Compatibility!" onclick="compatibility()"></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><span class="adjoined">Your Traits</span></td>
					<td><div id="u1Traits"><%=desc1%></div></td>
				</tr>
				<tr>
					<td><span class="adjoined">His/Her Traits</span></td>
					<td><div id="u2Traits"><%=desc2%>Adventurous and
							energetic Pioneering and courageous Enthusiastic and confident
							Dynamic and quick-witted Selfish and quick-tempered Impulsive and
							impatient Foolhardy and daredevil
						</div></td>
				</tr>
				<tr>
					<td><span class="adjoined">Compatibility</span></td>
					<td><span id="compatibility"></span></td>
				</tr>
			</tbody>
		</table>
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>