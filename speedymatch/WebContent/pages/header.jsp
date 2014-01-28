<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Use the .htaccess and remove these lines to avoid edge case issues.
			 More info: h5bp.com/b/378 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>Speedy Match</title>
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
<link rel="stylesheet" href="../css/homepage.css">
<link rel="stylesheet" href="../css/alert.css">
<!-- <link rel="stylesheet" href="css/style.css"> -->

<!--icons font awesome  -->
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="../gumby/js/libs/modernizr-2.6.2.min.js"></script>
</head>


<body class="docs uikit useFontAwesome" id="inner-doc">
<%@ page import ="speedymatch.entities.Member" %>
<%
session = request.getSession();
Member member = (Member)session.getAttribute("member");
%>

	<div class="navbar" id="nav1">
		<div class="row">
			<a class="toggle" gumby-trigger="#nav1 > .row > ul" href="#"><i
				class="icon-menu"></i></a>
			<h3 class="four columns logo">
				<a id="logoName" href="profile.jsp"> <img
					src="../images/SpeedyMatch.png" gumby-retina />speedymatch
				</a>
			</h3>


			<ul class="eight columns">



				<!-- 				<li class="field">

						<input class="search input" type="search" placeholder="search by username" />
				</li> -->

				<li class="nav-fields"><h4>
						<a href="search.jsp"><i class="fa fa-search"></i>&nbsp;Search</a>
					</h4></li>



				<li class="nav-fields" id="friendsTab">
					<h4>
						<a href="#"><i class="fa fa-users"></i>&nbsp;Friends</a>
					</h4>
				</li>

				<li class="nav-fields">
					<h4>
						<a href="#"><i class="fa fa-user"></i>&nbsp;<%=member.getUsername() %></a>
					</h4>
					<div class="dropdown">
						<ul>

							<li><h5>
									<a href="profile.jsp">profile</a>
								</h5></li>
						<li><h5>
									<a href="repPoints.jsp">reputation</a>
								</h5></li>
							<li><h5>
									<a href="../speedymatch.jsp">sign out</a>
								</h5></li>
						</ul>
					</div>
				<li class="nav-fields" id="alert"
					onclick="alert('someone just visit your profile!')">
					<h4>
						<i class="fa fa-bullhorn"></i>&nbsp;
					</h4>
				</li>
				<li class="nav-fields" id="alert"
					onclick="alert('new private message')">
					<h4>
						<i class="fa fa-envelope-o"></i>&nbsp;
					</h4>
				</li>
				<li class="nav-fields" id="alert"
					onclick="alert('new friend request')">
					<h4>
						<i class="fa fa-female"></i>
					</h4>
				</li>



			</ul>
		</div>
	</div>


	<div id="friends" class="navbar">

		<ul class="twelve columns">

			<li class="nav-fields">
				<div class="friendList">
					<p class="friend">Samuel Ong K.C</p>
				</div>
				<div class="dropdown friendActivities">
					<ul>
						<li><h6>
								<a href="friendProfile.jsp">View Profile</a>
							</h6></li>
						<li><h6>
								<a href="message.jsp">Send Message</a>
							</h6></li>
						<li><h6>
								<a href="cinemaForm.jsp">Invite for movie</a>
							</h6></li>
						<li><h6>
								<a href="inviteSystem.jsp">Member Invite</a>
							</h6></li>
							<li><h6>
								<a href="#">delete Friend</a>
							</h6></li>
					</ul>
				</div>

			</li>
		</ul>
	</div>

	<div class="wrapper nopad" id="nav-sidebar">
		<div class="row">
			<section class="four columns">
				<nav id="sidebar-nav-holder" class="vertical-nav">
					<ul id="sidebar-nav">

						<li>
							<h4>
								<a href="datePlanner.jsp"><i class="fa fa-calendar"></i>&nbsp;Date
									Planner</a>
							</h4>
						</li>

						<li>
							<h4>
								<a href="message.jsp"><i class="icon-chat"></i>Messaging</a>
							</h4>
						</li>

						<li>
							<h4>
								<a href="store.jsp"><i class="icon-basket"></i>Store</a>
							</h4>
						</li>

						<!-- 						<li>
							<h4>
								<a href="#"><i class="fa fa-video-camera"></i>&nbsp;Video
									Chat</a>
							</h4>
						</li> -->
						<li>
							<h4>
								<a href="loveMeter.jsp"><i class="icon-heart"></i>Love Meter</a>
							</h4>
						</li>
						<li>
							<h4>
								<a href="recommendation.jsp"><i class="fa fa-thumbs-o-up"></i>Recommends</a>
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
				<h1 class="lead">
					<!-- Header here -->
				</h1>
				<div class="row">