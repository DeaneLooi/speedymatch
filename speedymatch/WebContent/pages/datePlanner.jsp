<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<link rel="stylesheet" href="../css/datePlanner.css">
<script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDxFBPmTCsAlmW2hA6Es_gbtt6dBa86L44&sensor=false">
    </script>
    <script type="text/javascript">
      function initialize() {
        var mapOptions = {
          center: new google.maps.LatLng(-34.397, 150.644),
          zoom: 8
        };
        var map = new google.maps.Map(document.getElementById("map-canvas"),
            mapOptions);
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
</head>
<body>
<%@ include file="header.jsp" %>
<center>
		<div id="content">
        	<iframe>
        		<div id="map-canvas"></div>       
        	</iframe>
        </div>
</center>
<%@ include file="footer.jsp" %>
</body>
</html>