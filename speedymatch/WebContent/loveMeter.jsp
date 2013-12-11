<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Love Meter</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<center class="content">
		<!-- 	</center> -->
		<div class="picker" style="border-radius: 25px 2px;">
			<div class="Himage">
				<img id="urs" src="images\taurus-glyph.gif">
			</div>
			&nbsp;
			<h2 style="text-align: left;">Your Horoscope:</h2>
			<select>
				<option id="aq">Aquarius [21 Jan - 19 Feb]</option>
				<option id="pi">Pisces [20 Feb - 20 Mar]</option>
				<option id="ar">Aries [21 Mar - 20 Apr]</option>
				<option id="ta">Taurus [21 Apr - 21 May]</option>
				<option id="ge">Gemini [22 May - 21 June]</option>
				<option id="ca">Cancer [22 June - 22 July]</option>
				<option id="le">Leo [23 July - 22 Aug]</option>
				<option id="vi">Virgo [23 Aug - 21 Sep]</option>
				<option id="li">Libra [22 Sep - 22 Oct]</option>
				<option id="sc">Scorpio [23 Oct - 21 Nov]</option>
				<option id="sa">Sagittarius [22 Nov - 21 Dec]</option>
				<option id="ca">Capricorn [22 Dec - 20 Jan]</option>
			</select> &nbsp;
			<div class="Himage">
				<img id="his/her" src="images\aries-glyph.gif">
			</div>
			&nbsp;
			<h2 style="text-align: left;">His/Her Horoscope:</h2>
			<select>
				<option id="aq">Aquarius [21 Jan - 19 Feb]</option>
				<option id="pi">Pisces [20 Feb - 20 Mar]</option>
				<option id="ar">Aries [21 Mar - 20 Apr]</option>
				<option id="ta">Taurus [21 Apr - 21 May]</option>
				<option id="ge">Gemini [22 May - 21 June]</option>
				<option id="ca">Cancer [22 June - 22 July]</option>
				<option id="le">Leo [23 July - 22 Aug]</option>
				<option id="vi">Virgo [23 Aug - 21 Sep]</option>
				<option id="li">Libra [22 Sep - 22 Oct]</option>
				<option id="sc">Scorpio [23 Oct - 21 Nov]</option>
				<option id="sa">Sagittarius [22 Nov - 21 Dec]</option>
				<option id="ca">Capricorn [22 Dec - 20 Jan]</option>
			</select>
		</div>
		&nbsp;
		<div>
			<button href=# class="pretty medium primary btn">Calculate
				our compatibility!</button>
		</div>
		&nbsp; &nbsp; &nbsp;
		<div
			style="background: white; -webkit-box-shadow: 10px 10px 5px 0px rgba(245, 12, 71, 0.28); -moz-box-shadow: 10px 10px 5px 0px rgba(245, 12, 71, 0.28); box-shadow: 10px 10px 5px 0px rgba(245, 12, 71, 0.28);">
			Both of you are extremely compatible with each other. Bright future
			ahead of you! Congratulations!</div>
		<%@ include file="footer.jsp"%>
</body>
</html>