<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Love Meter</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />

<script>
	function displayTraits() {

	}
</script>

</head>
<body>
	<%@ include file="header.jsp"%>
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
								onchange="document.getElementById('sign1Image').src='../images/'+ this.options[this.selectedIndex].text +'.png';">
								<option value="01">Aries</option>
								<option value="02">Taurus</option>
								<option value="03">Gemini</option>
								<option value="04">Cancer</option>
								<option value="05">Leo</option>
								<option value="06">Virgo</option>
								<option value="07">Libra</option>
								<option value="08">Scorpio</option>
								<option value="09">Sagittarius</option>
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
								onchange="document.getElementById('sign2Image').src='../images/'+ this.options[this.selectedIndex].text +'.png';">
								<option value="01">Aries</option>
								<option value="02">Taurus</option>
								<option value="03">Gemini</option>
								<option value="04">Cancer</option>
								<option value="05">Leo</option>
								<option value="06">Virgo</option>
								<option value="07">Libra</option>
								<option value="08">Scorpio</option>
								<option value="09">Sagittarius</option>
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
						class="medium primary btn" id="button" name="" type="submit"
						value="Get your Love Compatibility!"></td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td><span class="adjoined">Your Traits</span></td>
					<td><div id="u1Traits">Imaginative and sensitive
							Compassionate and kind Selfless and unworldly Intuitive and
							sympathetic Escapist and idealistic Secretive and vague
							Weak-willed and easily led</div></td>
				</tr>
				<tr>
					<td><span class="adjoined">His/Her Traits</span></td>
					<td><div id="u2Traits">Adventurous and energetic
							Pioneering and courageous Enthusiastic and confident Dynamic and
							quick-witted Selfish and quick-tempered Impulsive and impatient
							Foolhardy and daredevil</div></td>
				</tr>
				<tr>
					<td><span class="adjoined">Compatibility</span></td>
					<td>80%</td>
				</tr>
			</tbody>
		</table>

		<%@ include file="footer.jsp"%>
</body>
</html>