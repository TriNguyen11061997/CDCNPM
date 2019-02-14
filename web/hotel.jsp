<%@page import="Bean.PlaceBean"%>
<%@page import="Bean.CityBean"%>
<%@page import="java.util.List"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
    <head>
        <title>The Travler Website Template | Services :: w3layouts</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="Assets/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- Add fancyBox main JS and CSS files -->
        <link href="Assets/css/magnific-popup.css" rel="stylesheet" type="text/css">
        <script src="Assets/js/jquery-1.9.1.min.js"></script> 
        <script src="Assets/js/jquery.easydropdown.js"></script>
        <script src="Assets/js/jquery.magnific-popup.js" type="text/javascript"></script>
        <script>
            $(document).ready(function () {
                $('.popup-with-zoom-anim').magnificPopup({
                    type: 'inline',
                    fixedContentPos: false,
                    fixedBgPos: true,
                    overflowY: 'auto',
                    closeBtnInside: true,
                    preloader: false,
                    midClick: true,
                    removalDelay: 300,
                    mainClass: 'my-mfp-zoom-in'
                });
            });
        </script>

    </head>
    <body>
        <!-- start header-->


        <div class="header_bg">
            <div class="wrap">
                <div class="header">
                    <div class="logo">
                        <a href="index.jsp"></a>
                    </div>
                    <div class="header_right">
                        <div class="search">
                            <form>
                                <input type="text" value="" placeholder="Searh for something here">
                                <input type="submit" value="">
                            </form>
                        </div>
                        <div class="drp-dwn">
                            <div class="dropdown-button">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}'>
                                    <option value="0">Select from dropdown</option>	
                                    <option value="1">Linux</option>
                                    <option value="2">Windows</option>
                                    <option value="3">Solaris</option>
                                    <option value="4">Mac</option>
                                    <option value="5">Unix</option>
                                </select>
                            </div>
                        </div>
                        <div class="quick_link">
                            <h2><a href="site_map.jsp">Quick links <i class="icon1"> </i></a></h2>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="header_menu">
                    <div class="menu_box_list">
                        <ul>
                            <li class="color1"><a href="travel_guide.jsp"><i class="icon1"> </i><span>travel guide</span></a></li>
                            <li class="color2 active"><a href="service.jsp"> <i class="icon2"> </i> <span>Service</span></a></li>
                            <li class="color3"><a href="about.jsp"> <i class="icon3"> </i><span>about</span></a></li>
                            <li class="color4"><a href="service.jsp"> <i class="icon4"> </i><span>the hour</span></a></li>
                            <li class="color5"><a href="travel_guide.jsp"> <i class="icon5"> </i> <span>Place</span></a></li>

                        </ul>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- start top-->
        <div class="top_bg">
            <div class="wrap">
                <div class="top_grids1">

                    <div class="top_map1">
                        <ul>
                            <li class="map"></li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                </div>	
            </div>
        </div>
        <!-- start content -->
        <div class="content_bg">
            <div class="wrap">
                <div class="content">
                    <!-- start popup -->

                    <% List<PlaceBean> list = (List<PlaceBean>) request.getAttribute("listPlace");%>
                    <div class="container">
                        <div class="row">
                            <% for (PlaceBean item : list) {
                            %>   
                            <div class="col-md-4">
                                <div class="card mb-4 box-shadow">
                                    <img class="card-img-top" src="Assets/images/ser_pic1.jpg" alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22348%22%20height%3D%22225%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20348%20225%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_168eb23f7ab%20text%20%7B%20fill%3A%23eceeef%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A17pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_168eb23f7ab%22%3E%3Crect%20width%3D%22348%22%20height%3D%22225%22%20fill%3D%22%2355595c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22116.7265625%22%20y%3D%22120.3%22%3EThumbnail%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true">
                                    <div class="card-body">
                                        <p class="card-text"><%=item.getPlaceName()%></p>
                                        <div class="d-flex justify-content-between align-items-center">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                                <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
                                            </div>
                                            <small class="text-muted">9 mins</small>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%}
                            %>
                            <div id="small-dialog" class="mfp-hide">
                                <div class="pop_up">
                                    <h2>Integer lacinia quam</h2>
                                    <img src="Assets/images/ser_pic1.jpg" title="image-name">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- start footer -->
                <div class="footer_bg">
                    <div class="wrap">
                        <div class="footer">
                            <div class="f_grids">
                                <div class="f_grid right">
                                    <h2><a href="index.jsp"></a></h2>
                                    <div class="clear"></div>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>
                                </div>	
                                <div class="f_grid">
                                    <ul class="f_nav">
                                        <li><a class="active" href="#">portfolio</a></li> |
                                        <li><a  href="#">services</a></li> |
                                        <li><a href="#">staff</a></li> |
                                        <li><a href="#">articles</a></li> |
                                        <li><a href="#">contact</a></li>
                                        <div class="clear"></div>	
                                    </ul>
                                    <div class="f_nav1">
                                        <ul>
                                            <li ><a href="#"> <i class="icon1"> </i><span>twitter</span></a></li>
                                            <li ><a href="#"> <i class="icon2"> </i> <span>facebook</span></a></li>
                                            <li ><a href="#"> <i class="icon3"> </i><span>rss</span></a></li>
                                            <li ><a href="#"> <i class="icon4"> </i><span>mail</span></a></li>
                                        </ul>
                                        <div class="clear"></div>
                                    </div>     		
                                </div>	
                                <div class="clear"></div>	
                            </div>
                            <ul class="footer_nav">
                                <li><a href="#">About</a></li>
                                <li><a href="#">footer links</a></li>
                                <li><a href="#">privacy</a></li>
                                <li><a href="#">contact</a></li>
                                <div class="clear"></div>	
                            </ul>	
                            <p class="f_para">On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. </p>
                            <div class="footer_top">
                                <p class="link"><span>© All rights reserved | Template by&nbsp; <a href="http://w3layouts.com/"> W3Layouts</a></span></p>
                            </div>
                        </div>
                    </div>	</div>
                </body>
                </html>