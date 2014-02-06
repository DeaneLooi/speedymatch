<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Love Meter</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page
		import="speedymatch.entities.Horoscope,
	speedymatch.entities.dao.HoroscopeDAO"%>
	<center class="content">
		<!-- 	</center> -->
		<form method="post"
			action="${pageContext.request.contextPath}/HoroscopeServlet">
			<table width="100%" cellpadding="0" cellspacing="0">
				<tbody>
					<tr valign="top">
						<td>&nbsp;</td>
						<td><span>Your Sign</span></td>
						<td width="250" style="text-align: left;"><img
							id="sign1Image" src="../images/SpeedyMatch.png" width="100"
							border="0"><br>
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
						<td width="250" style="text-align: left;"><img
							id="sign2Image" src="../images/SpeedyMatch.png" width="100"
							border="0"><br>
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
							class="medium primary btn" id="button" type="submit"
							value="Show me our traits!"></td>
						<td>&nbsp;</td>
					</tr>
				</tbody>
			</table>
		</form>

		<div style="background: white; border-radius: 10px;">
			<h3>Your Traits:</h3>
			<span>${trait1}</span> <br>
			<div id="u1Traits">${sign1}</div>
			<br>
			<h3>His/Her Traits:</h3>
			<span>${trait2}</span> <br>
			<div id="u2Traits">${sign2}</div>
			<div>
				<br>
				<h3>Compatibility Grid</h3>
				<span id="compatibility"><img id="comGrid"
					src="../images/Compatibility grid.jpg"><br></span>

			</div>
		</div>
		<%
			request.getSession().removeAttribute("sign1");
			request.getSession().removeAttribute("sign2");
			request.getSession().removeAttribute("trait1");
			request.getSession().removeAttribute("trait2");
		%>
	</center>
	<%@ include file="footer.jsp"%>
</body>
</html>