
<div class="clearfix mar_top4"></div>




<!-- Footer
======================================= -->

<div class="footer">
	
    <div class="clearfix mar_top4"></div>
	
    <div class="container">
    
   		<div class="one_fourth">
            
            <div id="footer_logo"><h1>JETPERU</i></h1></div>
            
            <ul class="contact_address">
                <li><!--<i class="icon-map-marker icon-large"></i>  2901 Marmora Road, Glassgow,<br />&nbsp;&nbsp;&nbsp;Seattle, WA 98122-1090--></li>
                <li><i class="icon-phone"></i> 1 -234 -456 -7890</li>
                <li><i class="icon-print"></i> 1 -234 -456 -7890</li>
                <li><img src="${pageContext.request.contextPath}/resources/images/footer-wmap.png" alt="" /></li>
            </ul>
            
        </div>
        
        <!-- 
        <div class="one_fourth">
        	
            <h2>Useful <i>Links</i></h2>
            
            <ul class="list">
                <li><a href="#"><i class="icon-angle-right"></i> Home Page Variations</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Awsome Slidershows</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Features and Typography</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Different &amp; Unique Pages</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Single and Portfolios</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Recent Blogs or News</a></li>
                <li><a href="#"><i class="icon-angle-right"></i> Layered PSD Files</a></li>
            </ul>
            
        </div>
        
        
        <div class="one_fourth">
        	
            <div class="twitter_feed">
            
            	<h2>Latest <i>Tweets</i></h2>
                
                <div class="left"><i class="icon-twitter icon-large"></i></div>
                <div class="right"><a href="https://twitter.com/gsrthemes9" target="_blank">gsrthemes9</a>: aoxhost - Responsive html5 Professional Hosting Theme<br />
				<a href="#" class="small">.9 days ago</a> .<a href="#" class="small">reply</a> .<a href="#" class="small">retweet</a> .<a href="#" class="small">favorite</a></div>
                
                <div class="clearfix divider_line4"></div>
                
                <div class="left"><i class="icon-twitter icon-large"></i></div>
                <div class="right"><a href="https://twitter.com/gsrthemes9" target="_blank">gsrthemes9</a>: Kinvexy - Responsive HTML5 / CSS3, Professional Corporate Theme.<br />
				<a href="#" class="small">.8 days ago</a> .<a href="#" class="small">reply</a> .<a href="#" class="small">retweet</a> .<a href="#" class="small">favorite</a></div>
                
            </div>
            
        </div>
        
        
        <div class="one_fourth last">
        	
            <h2>Flickr <i>Photos</i></h2>
            
        	<div id="flickr_badge_wrapper">
            	<script type="text/javascript" src="http://www.flickr.com/badge_code_v2.gne?count=9&amp;display=latest&amp;size=s&amp;layout=h&amp;source=user&amp;user=93382411%40N07"></script>     
            </div>
            
        </div>
        -->
        
    </div>
	
    <div class="clearfix mar_top2"></div>
    
    <div class="container_full">
        <div class="scrollup_area"><a href="#" class="scrollup">Subir</a></div><!-- end scroll to top of the page-->
    </div>
    

</div>

<div class="copyright_info">

    <div class="container">
    
        <div class="three_fourth">
        
            <b>Copyright © 2016 jetperu.com. Todos los derechos reservados.  <a href="#">Terminos de uso</a></b>
            
        </div>
    
    	<div class="one_fourth last">
     		
            <ul class="footer_social_links">
                <li><a href="#"><i class="icon-facebook icon-large"></i></a></li>
                <li><a href="#"><i class="icon-twitter icon-large"></i></a></li>
                <li><a href="#"><i class="icon-google-plus icon-large"></i></a></li>
                <li><a href="#"><i class="icon-linkedin icon-large"></i></a></li>
                <li><a href="#"><i class="icon-youtube icon-large"></i></a></li>
                <li><a href="#"><i class="icon-flickr icon-large"></i></a></li>
                <li><a href="#"><i class="icon-rss icon-large"></i></a></li>
            </ul>
                
    	</div>
    
    </div>
    
</div><!-- end copyright info --> 



    
<!-- ######### JS FILES ######### -->
<!-- get jQuery from the google apis -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/universal/jquery.js"></script>


<!-- main menu -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mainmenu/ddsmoothmenu.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mainmenu/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mainmenu/selectnav.js"></script>


<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mainmenu/scripts.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jetperu.js"></script>

<!-- scroll up -->
<script type="text/javascript">
    $(document).ready(function(){
 
        $(window).scroll(function(){
            if ($(this).scrollTop() > 100) {
                $('.scrollup').fadeIn();
            } else {
                $('.scrollup').fadeOut();
            }
        });
 
        $('.scrollup').click(function(){
            $("html, body").animate({ scrollTop: 0 }, 500);
            return false;
        });
 
    });
</script>

<input id="urlHome" value="${pageContext.request.contextPath}/" type="hidden" />