<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../css/datePlanner.css">
 <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
      html { height: 100% }
      body { height: 100%; margin: 0; padding: 0 }
      #map-canvas { height: 100% }
    </style>
<!--     <script type="text/javascript" -->
<!--       src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDxFBPmTCsAlmW2hA6Es_gbtt6dBa86L44&sensor=false"> -->
<!--     </script> -->
    <script type="text/javascript">
    function loadScript() {
    	  var script = document.createElement('script');
    	  script.type = 'text/javascript';
    	  script.src = 'https://maps.googleapis.com/maps/api/js?key=AIzaSyDxFBPmTCsAlmW2hA6Es_gbtt6dBa86L44&sensor=false&' +
    	      'callback=initialize';
    	  document.body.appendChild(script);
    	  alert("Asynchronous Loaded");
    	}
    
      function initialize() {
        var mapOptions = {
          center: new google.maps.LatLng(-34.397, 150.644),
          zoom: 8
        };
        var map = new google.maps.Map(document.getElementById("map-canvas"),
            mapOptions);
      }
      
      window.onload = loadScript;
    </script>
</head>
<body>
	<div id="map-canvas"/>
</body>
</html>