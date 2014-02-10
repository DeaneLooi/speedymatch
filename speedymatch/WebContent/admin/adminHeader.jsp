<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Use the .htaccess and remove these lines to avoid edge case issues.
			 More info: h5bp.com/b/378 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Speedy Match Administration</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="humans.txt">

<link rel="shortcut icon" href="../images/SpeedyMatch.png"
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
<link rel="stylesheet" href="../gumby/css/gumby.css">
<link rel="stylesheet" href="../css/adminHomepage.css">
<!-- <link rel="stylesheet" href="css/style.css"> -->

<!--icons font awesome  -->
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">

<script src="../js/jquery-1.9.1.js"></script>
<script src="../gumby/js/libs/modernizr-2.6.2.min.js"></script>
</head>


<body class="docs uikit useFontAwesome" id="inner-doc">


	<div class="navbar" id="nav1">
		<div class="row">
			<a class="toggle" gumby-trigger="#nav1 > .row > ul" href="#"><i
				class="icon-menu"></i></a>
			<h3 class="four columns logo">
				<a id="logoName" href="adminHomepage.jsp"> <img
					src="../images/SpeedyMatch.png" gumby-retina />speedymatch
				</a>
			</h3>


			<ul class="eight columns">



				<!-- 				<li class="field">

						<input class="search input" type="search" placeholder="search by username" />
				</li> -->

				<li class="nav-fields"><div id="topheaderProfile">
				<h4>
						<a href="#"><i class="fa fa-search"></i>&nbsp;Admin</a>
					</h4></div></li>



				<li class="nav-fields"><div id="topheaderSignout"><h4>
						<a href="../speedymatch.jsp"><i class="fa fa-cog"></i>&nbsp;Sign out</a>
					</h4></div></li>
			</ul>
		</div>
	</div>
	<div class="wrapper nopad" id="nav-sidebar">
		<div class="row">
			<section class="four columns">
				<nav id="sidebar-nav-holder" class="vertical-nav">
					<ul id="sidebar-nav">

						<li>
							<h4>
								<a href="#"><i class="fa fa-times"></i>&nbsp;Deactivate</a>
							</h4>
						</li>

						<li>
							<h4>
								<a href="#"><i class="fa fa-warning"></i>Suspend</a>
							</h4>
						</li>

						<li>
							<h4>
								<a href="adminReport.jsp"><i class="fa fa-edit"></i>Report</a>
							</h4>
						</li>

						<li>
							<h4>
								<a href="adminAuditLog.jsp"><i class="fa fa-list-alt"></i>&nbsp;Audit</a>
							</h4>
						</li>
						<li>
					<h4>
						<a href="adminFirewall.jsp"><i class="fa fa-fire"></i>Firewall</a>
					</h4>
				</li>
				      	
					</ul>
				</nav>
			</section>
		</div>
	</div>
	
	<section class="nine columns push_one" id="docs-content">

		<div class="left-center">
		
			<div class="row">
		<h1 class="lead"><!-- Header here --></h1>
		<div class="row">