</div>
		</div>


			
		</div>


	</section>


	<script>
		$(document).ready(function() {
			$("#friendsTab").click(function() {
				$("#friends").slideToggle("fast");
			});

		});
	</script>
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
