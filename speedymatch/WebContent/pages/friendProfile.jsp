<!--Tan Wai Kit 
    IS1201
    123696F  -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript" src="../js/profile.js"></script>
<title>Profile</title>
<link rel="shortcut icon" href="../images/SpeedyMatch.png"
	type="image/x-icon" />
<link rel="stylesheet" href="../css/friendProfile.css">
<link
	href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp"%>
	<%@ page import = "speedymatch.entities.Member,
				speedymatch.entities.dao.MemberDAO,
				java.util.Date,
				speedymatch.utils.Algorithms,
				speedymatch.entities.Notification,
				speedymatch.entities.dao.NotificationDAO,
				speedymatch.utils.NotificationVariables,
				speedymatch.entities.Profile,
				speedymatch.entities.dao.ProfileDAO" %>
	<%
	Member member = (Member)request.getSession().getAttribute("member");
	String userProfile = request.getParameter("username"); 
	Member memProfile = new Member(userProfile,null);
	memProfile = MemberDAO.retrieveAccount(memProfile);
	Date dob = memProfile.getDob();
	Profile profile = new Profile();
	profile.setUsername(userProfile);
	profile = ProfileDAO.retrieveProfile(profile);
	
	if(!member.getUsername().equals(userProfile)){
		Notification n = new Notification(member.getUsername(),userProfile,NotificationVariables.ALERT);
		NotificationDAO.createNotification(n);
	}

	
	String email = memProfile.getEmail();
	String occ = profile.getOccupation();
	String pic = memProfile.getProfilePic();
	%>
	<center class=content>
		<!-- content here -->
		<a href="#"><img id=profilepic src="<%=pic%>" alt="<%=userProfile%>" class="first" height="500px" width="400px"></a>
		<section class="profile">
		<div class="profileinfo">

			<div class="gear">
				<label class="primary label">E-Mail:</label> <span id="email"
					class="datainfo"><%=email%></span> 
			</div>

			<div class="gear">
				<label class="primary label">Full Name:</label> <span id="fullname"
					class="datainfo"><%=memProfile.getFname()+" "+memProfile.getLname() %></span> 
			</div>

			<div class="gear">
				<label class="primary label">Birthday:</label> <span id="birthday"
					class="datainfo"><%=dob.getDate()+"/"+(dob.getMonth()+1)+"/"+(dob.getYear()+1900)%></span>
			</div>

			<div class="gear">
				<label class="primary label">City/Town:</label> <span id="citytown"
					class="datainfo">SengKang, Singapore</span>
			</div>

			<div class="gear">
				<label class="primary label">Occupation:</label> <span
					id="occupation" class="datainfo"><%=occ%></span> 
			</div>

		</div>
		</section>
		<%
		boolean checkFriend = false;
		boolean checkUrself = false;
		if(userProfile.equals(member.getUsername())){
			checkUrself = true;
		}
		for(int i=0; i<friends.size();i++){ 
			if(friends.get(i).equals(userProfile)){
				checkFriend = true;
			}
		}
		if(checkFriend&&!checkUrself){%>
		
		<div class="medium gear" id="addFriend">
		<label class="primary label"><i class="icon-check"></i>Friends</label>
		</div>
		<%
		}
		
		else if(!checkFriend&&!checkUrself){%>
		
			<div class="medium btn primary" id="addFriend"><a href="${pageContext.request.contextPath}/AddFriend?username=<%=username%>&friendId=<%=userProfile%>">Add Friend</a></div>

		<%	
		}
		
		else if(checkUrself){
			
		}
		%>
		
	</center> 
		<%@ include file="footer.jsp"%>
</body>
</html>