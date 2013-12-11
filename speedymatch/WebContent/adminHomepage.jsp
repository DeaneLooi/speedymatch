<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Speedy Match Administration</title>
<!-- We highly recommend you use SASS and write your custom styles in sass/_custom.scss.
		 However, there is a blank style.css in the css directory should you prefer -->
<link rel="stylesheet" href="gumby/css/gumby.css">
<link rel="stylesheet" href="css/adminHomepage.css">


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
				<a id="logoName" href="adminHomepage.jsp"> <img
					src="images/SpeedyMatch.png" gumby-retina />speedymatch
				</a>
			</h3>


			<ul class="eight-columns">



				<!-- 				<li class="field">

						<input class="search input" type="search" placeholder="search by username" />
				</li> -->

				<li class="nav-fields"><div id="topheaderProfile">
						<h4>
							<a href="#"><i class="fa fa-user"></i>&nbsp;Admin</a>
						</h4>
					</div></li>

				<li class="nav-fields"><div id="topheaderSignout">
					<h4>
						<a href="#"><i class="fa fa-sign-out"></i>&nbsp;Sign out</a>
					</h4>
					
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
						<a href="#"><i class="fa fa-times">&nbsp;</i>Deactivate Account</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="fa fa-warning">&nbsp;</i>Suspend Account</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="fa fa-edit">&nbsp;</i>View Report</a>
					</h4>
				</li>
				
				<li>
					<h4>
						<a href="WebContent/adminAuditLog.jsp"><i class="fa fa-list-alt">&nbsp;</i>Audit logs</a>
					</h4>
				</li>

				<li>
					<h4>
						<a href="#"><i class="fa fa-fire">&nbsp;</i>Firewall</a>
					</h4>
				</li>




			</ul>
			</nav> </section>
		</div>
	</div>
	
	
	<div id="tfheader">
		<form id="tfnewsearch" method="get" action="http://www.google.com">
		       <i class="fa fa-search"> <input type="text" class="tftextinput" name="" size="21" maxlength="100"><input type="submit" value="Search" class="tfbutton"></i>
		         
		</form>
	</div>
	
	<!--temp div-->
	
	<ul class="temp">
	
		<li>name: hello world</li>
		<li>membership status: premium member</li>
		<li>age: 46</li>
		<li>birth date: 01/01/1970</li>
	
	</ul>
	
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
</html>