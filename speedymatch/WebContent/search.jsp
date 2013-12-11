<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>search</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="humans.txt">

<link rel="shortcut icon" href="images/SpeedyMatch.png"
	type="image/x-icon" />

<!-- Facebook Metadata /-->
<meta property="fb:page_id" content="" />
<meta property="og:image" content="" />
<meta property="og:description" content="" />
<meta property="og:title" content="" />

<!-- Google+ Metadata /-->
<meta itemprop="name" content="">
<meta itemprop="description" content="">
<meta itemprop="image" content="">

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1">

<!-- We highly recommend you use SASS and write your custom styles in sass/_custom.scss.
		 However, there is a blank style.css in the css directory should you prefer -->
<link rel="stylesheet" href="gumby/css/gumby.css">
<link rel="stylesheet" href="css/homepage.css">
<link rel="stylesheet" href="css/search.css">
<!-- <link rel="stylesheet" href="css/style.css"> -->

<!--icons font awesome  -->
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">

<script src="gumby/js/libs/modernizr-2.6.2.min.js"></script>
</head>
<body class="docs uikit useFontAwesome" id="inner-doc">


	<div class="navbar" id="nav1">
		<div class="row">
			<a class="toggle" gumby-trigger="#nav1 > .row > ul" href="#"><i
				class="icon-menu"></i></a>
			<h3 class="four columns logo">
				<a id="logoName" href="homepage.jsp"> <img
					src="images/SpeedyMatch.png" gumby-retina />speedymatch
				</a>
			</h3>


			<ul class="eight columns">



				<!-- 				<li class="field">

						<input class="search input" type="search" placeholder="search by username" />
				</li> -->

				<li class="nav-fields"><h4>
						<a href="WebContent/search.jsp"><i class="fa fa-search"></i>&nbsp;Search</a>
					</h4></li>



				<li class="nav-fields"><h4>
						<a href="#"><i class="fa fa-cog"></i>&nbsp;Settings</a>
					</h4></li>


				<li class="nav-fields"><div id="friends">
						<h4>
							<a href="#"><i class="fa fa-users"></i>&nbsp;Friends</a>
						</h4>
					</div></li>

				<li class="nav-fields">
					<h4>
						<a href="#"><i class="fa fa-user"></i>&nbsp;Profile</a>
					</h4>
					<div class="dropdown">
						<ul>

							<li><h5>
									<a href="#">profile</a>
								</h5></li>
							<li><h5>
									<a href="speedymatch.jsp">sign out</a>
								</h5></li>
						</ul>
					</div>
				</li>

			</ul>
		</div>
	</div>




	<div class="wrapper nopad" id="nav-sidebar">
		<div class="row">
			<section class="four columns"> <nav id="sidebar-nav-holder"
				class="vertical-nav">
			<ul id="sidebar-nav">

				<li>
					<h4>
						<a href="#"><i class="fa fa-calendar"></i>&nbsp;Date Planner</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="icon-chat"></i>Messaging</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="icon-basket"></i>Store</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="fa fa-video-camera"></i>&nbsp;Video Chat</a>
					</h4>
				</li>




			</ul>
			</nav> </section>
		</div>
	</div>

	<div class="search" id="advance">
	
	<div class="search" id="header-s">
	<div class="header-looking" id="search-h">I am looking for...</div>
	<div class="header-looking" id="search-btn"><a href="#">Search</a></div>
	</div>
	
	<div class="search" id="left-search">
	
		<form>
			<ul>
				<!-- gender -->
				<li class="field" id="gender"><span class="title">Gender:</span><label class="radio checked" for="radio1">
						<input name="gender" value="1" type="radio" id="radio1"> <span></span> Male
				</label> <label class="radio" for="radio2"> <input name="gender"
						value="2" type="radio" id="radio2"> <span></span> Female
				</label></li>
				
				<!--age-->
				<li class="field"><span class="title">Age:</span>
				<label class="age"><input class="xnarrow text input" type="text" placeholder="18">
				</label>to
				<label class="age"><input class="xnarrow text input" type="text" placeholder="80">
				</label></li>
				
				<!--height-->
				<li class="field"><span class="title">Height:</span>
				Min.
				<label class="height-weight"><input class="xnarrow text input" type="text" placeholder="150cm">
				</label>Max. 
				<label class="height-weight"><input class="xnarrow text input" type="text" placeholder="200cm">
				</label></li>
				
				<!--weight-->
				<li class="field"><span class="title">Weight:</span>
				Min.
				<label class="height-weight" id="weight"><input class="xnarrow text input" type="text" placeholder="40kg">
				</label>Max. 
				<label class="height-weight" id="weight"><input class="xnarrow text input" type="text" placeholder="200kg">
				</label></li>
				
				<!-- smoking -->
				<li class="field"><span class="title">Smokes:</span><label class="radio checked" for="radio1">
						<input name="smokes" value="1" type="radio" id="radio1"> <span></span>No
				</label> <label class="radio" for="radio2"> <input name="smokes"
						value="2" type="radio" id="radio2"> <span></span> Occasionally
				</label><label class="radio" for="radio3">
						<input name="smokes" value="3" type="radio" id="radio3"><span></span> Often
				</label>
				</li>
				
				<!-- drinking -->
				<li class="field"><span class="title">Drinks:</span><label class="radio checked" for="radio1">
						<input name="drinks" value="1" type="radio" id="radio1"> <span></span>No
				</label> <label class="radio" for="radio2"> <input name="drinks"
						value="2" type="radio" id="radio2"> <span></span> Occasionally
				</label><label class="radio" for="radio3">
						<input name="drinks" value="3" type="radio" id="radio3"><span></span> Often
				</label>
				</li>
				
				<!-- relationship status -->
						<li class="field"><p><span class="title">Relationship status:</span></p><label class="radio checked" for="radio1">
						<input name="status" value="1" type="radio" id="radio1"> <span></span>I don't care
				</label> <label class="radio" for="radio2"> 
						<input name="status"value="2" type="radio" id="radio2"> <span></span> Single
				</label><label class="radio" for="radio3">
						<input name="status" value="3" type="radio" id="radio3"><span></span> Divorced
				</label><label class="radio" for="radio3">
						<input name="status" value="4" type="radio" id="radio4"><span></span> Widowed
				</label><label class="radio" for="radio4">
						<input name="status" value="5" type="radio" id="radio5"><span></span> Separated
				</label>
				</li>
				
				<!-- children -->
				<li class="field"><p><span class="title">Want children?</span></p><label class="radio checked" for="radio1">
						<input name="child" value="1" type="radio" id="radio1"> <span></span>I don't know
				</label> <label class="radio" for="radio2"> <input name="child"
						value="2" type="radio" id="radio2"> <span></span>Yes
				</label><label class="radio" for="radio3">
						<input name="child" value="3" type="radio" id="radio3"><span></span> No
				</label>
				</li>
				
				</ul>
				</form>
				</div>
				
<div class="search" id="right-search">

	<div class="search" id="inner-right-search">
	<form>
			<ul>
				<!-- edu -->
				<li class="field"><span class="title">Education:</span><label class="drop">
						<div class="picker">
							<select>
								<!-- <option value="#" disabled>Favorite Dalek phrase...</option> -->
								<option>I don't care</option>
								<option>High school or below</option>
								<option>Collage</option>
								<option>Diploma</option>
								<option>Bachelor</option>
								<option>Master</option>
								<option>Doctoral or above</option>
							</select>
						</div>
				</label></li>
				
				<!-- Zodiac -->
				<li class="field"><span class="title">Zodiac:</span><label class="drop">
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
				<li class="field"><span class="title">Occupation:</span><label class="drop">
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
				</label></li></ul>
		</form>
				</div>
		<form>
			<ul>	
				<!-- ethnicity -->
						<li class="field"><p><span class="title">Ethnicity:</span></p>
							<label class="checkbox" for="checkbox1">
								<input name="eth" type="checkbox" checked="" id="checkbox1">
								<span></span> I dont't care
							</label>
							<label class="checkbox" for="checkbox2">
								<input name="eth" type="checkbox" id="checkbox2">
								<span></span> Chinese
							</label>
							<label class="checkbox" for="checkbox3">
								<input name="eth"  type="checkbox" id="checkbox3">
								<span></span> Malay
							</label>
							<label class="checkbox" for="checkbox4">
								<input name="eth"  type="checkbox" id="checkbox4">
								<span></span> Indian
							</label>
							<label class="checkbox" for="checkbox5">
								<input name="eth" type="checkbox" id="checkbox5">
								<span></span> Others
							</label>
						</li>
					
				<!-- religion -->
						<li class="field"><p><span class="title">Religion:</span></p>
							<label class="checkbox" for="checkbox1">
								<input name="religion1" type="checkbox" checked="" id="checkbox1">
								<span></span> I dont't care
							</label>
							<label class="checkbox" for="checkbox2">
								<input name="religion2" type="checkbox" id="checkbox2">
								<span></span> Buddihist
							</label>
							<label class="checkbox" for="checkbox3">
								<input name="religion3"  type="checkbox" id="checkbox3">
								<span></span> Muslim
							</label>
							<label class="checkbox" for="checkbox4">
								<input name="religion4"  type="checkbox" id="checkbox4">
								<span></span> Catholic
							</label>
							<label class="checkbox" for="checkbox5">
								<input name="religion5" type="checkbox" id="checkbox5">
								<span></span> Christian
							</label>
							<label class="checkbox" for="checkbox6">
								<input name="religion6" type="checkbox" id="checkbox6">
								<span></span> Others
							</label>
						</li>
				
			<!-- hobby -->
			<li class="field"><p><span class="title">Hobby:</span></p>
							<label class="checkbox" for="checkbox1">
								<input name="hobby1" type="checkbox" checked="" "checkbox1">
								<span></span> I don't care
							</label>
							<label class="checkbox" for="checkbox2">
								<input name="hobby2" type="checkbox" id="checkbox2">
								<span></span> Outdoor recreation
							</label>
							<label class="checkbox" for="checkbox3">
								<input name="hobby3" type="checkbox" id="checkbox3">
								<span></span> Performing arts
							</label>
							<label class="checkbox" for="checkbox4">
								<input name="hobby4"  type="checkbox" id="checkbox4">
								<span></span> Cooking
							</label>
							<label class="checkbox" for="checkbox5">
								<input name="hobby5" type="checkbox" id="checkbox5">
								<span></span> Gardening
							</label>
							<label class="checkbox" for="checkbox6">
								<input name="hobby6" type="checkbox" id="checkbox6">
								<span></span> Sports
							</label>
							<label class="checkbox" for="checkbox6">
								<input name="hobby6" type="checkbox" id="checkbox6">
								<span></span> Reading
							</label>
							<label class="checkbox" for="checkbox7">
								<input name="hobby7"  type="checkbox" id="checkbox7">
								<span></span> Collecting
							</label>
							<label class="checkbox" for="checkbox8">
								<input name="hobby8" type="checkbox" id="checkbox8">
								<span></span> Gardening
							</label>
							<label class="checkbox" for="checkbox9">
								<input name="hobby9" type="checkbox" id="checkbox9">
								<span></span> Traveling
							</label>
							<label class="checkbox" for="checkbox10">
								<input name="hobby10" type="checkbox" id="checkbox10">
								<span></span> Online activities
							</label>
						</li>
		
			</ul>
		</form>
</div>
	</div>

	<section class="nine columns push_one" id="docs-content">

	<div class="left-center">
		
		<!-- Content here -->
	</div>


	</section>

	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script>
		var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className
				.match(/\soldie\s/g));
		if (!oldieCheck) {
			document
					.write('<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"><\/script>');
		} else {
			document
					.write('<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
		}
	</script>
	<script>
		if (!window.jQuery) {
			if (!oldieCheck) {
				document
						.write('<script src="gumby/js/libs/jquery-2.0.2.min.js"><\/script>');
			} else {
				document
						.write('<script src="gumby/js/libs/jquery-1.10.1.min.js"><\/script>');
			}
		}
	</script>

        
	<!--
	Include gumby.js followed by UI modules followed by gumby.init.js
	Or concatenate and minify into a single file -->
	<script gumby-touch="gumby/js/libs" src="gumby/js/libs/gumby.js"></script>
	<script src="gumby/js/libs/ui/gumby.retina.js"></script>
	<script src="gumby/js/libs/ui/gumby.fixed.js"></script>
	<script src="gumby/js/libs/ui/gumby.skiplink.js"></script>
	<script src="gumby/js/libs/ui/gumby.toggleswitch.js"></script>
	<script src="gumby/js/libs/ui/gumby.checkbox.js"></script>
	<script src="gumby/js/libs/ui/gumby.radiobtn.js"></script>
	<script src="gumby/js/libs/ui/gumby.tabs.js"></script>
	<script src="gumby/js/libs/ui/gumby.navbar.js"></script>
	<script src="gumby/js/libs/ui/jquery.validation.js"></script>
	<script src="gumby/js/libs/gumby.init.js"></script>

	<!--
	Google's recommended deferred loading of JS
	gumby.min.js contains gumby.js, all UI modules and gumby.init.js

	Note: If you opt to use this method of defered loading,
	ensure that any javascript essential to the initial
	display of the page is included separately in a normal
	script tag.

	<script type="text/javascript">
	function downloadJSAtOnload() {
	var element = document.createElement("script");
	element.src = "js/libs/gumby.min.js";
	document.body.appendChild(element);
	}
	if (window.addEventListener)
	window.addEventListener("load", downloadJSAtOnload, false);
	else if (window.attachEvent)
	window.attachEvent("onload", downloadJSAtOnload);
	else window.onload = downloadJSAtOnload;
	</script> -->

	<script src="gumby/js/plugins.js"></script>
				<script src="gumby/js/main.js"></script>

	<!-- Change UA-XXXXX-X to be your site's ID -->
	<!--<script>
	window._gaq = [['_setAccount','UAXXXXXXXX1'],['_trackPageview'],['_trackPageLoadTime']];
	Modernizr.load({
	  load: ('https:' == location.protocol ? '//ssl' : '//www') + '.google-analytics.com/ga.js'
	});
	</script>-->

	<!-- Prompt IE 6 users to install Chrome Frame. Remove this if you want to support IE 6.
	   chromium.org/developers/how-tos/chrome-frame-getting-started -->
	<!--[if lt IE 7 ]>
	<script src="//ajax.googleapis.com/ajax/libs/chrome-frame/1.0.3/CFInstall.min.js"></script>
	<script>window.attachEvent('onload',function(){CFInstall.check({mode:'overlay'})})</script>
	<![endif]-->

</body>

</body>
</html>