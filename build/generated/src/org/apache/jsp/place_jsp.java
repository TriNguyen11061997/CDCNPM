package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Bean.CityBean;
import java.util.List;

public final class place_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>The Travler Website Template | Services :: w3layouts</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <link href=\"Assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- Add fancyBox main JS and CSS files -->\n");
      out.write("        <link href=\"Assets/css/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"Assets/js/jquery-1.9.1.min.js\"></script> \n");
      out.write("        <script src=\"Assets/js/jquery.easydropdown.js\"></script>\n");
      out.write("        <script src=\"Assets/js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("                    type: 'inline',\n");
      out.write("                    fixedContentPos: false,\n");
      out.write("                    fixedBgPos: true,\n");
      out.write("                    overflowY: 'auto',\n");
      out.write("                    closeBtnInside: true,\n");
      out.write("                    preloader: false,\n");
      out.write("                    midClick: true,\n");
      out.write("                    removalDelay: 300,\n");
      out.write("                    mainClass: 'my-mfp-zoom-in'\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- start header-->\n");
      out.write("        ");
 List<CityBean> list = (List<CityBean>) request.getAttribute("listCity");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header_bg\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header_right\">\n");
      out.write("                        <div class=\"search\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" value=\"\" placeholder=\"Searh for something here\">\n");
      out.write("                                <input type=\"submit\" value=\"\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"drp-dwn\">\n");
      out.write("                            <div class=\"dropdown-button\">\n");
      out.write("                                <select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("                                    <option value=\"0\">Select from dropdown</option>\t\n");
      out.write("                                    <option value=\"1\">Linux</option>\n");
      out.write("                                    <option value=\"2\">Windows</option>\n");
      out.write("                                    <option value=\"3\">Solaris</option>\n");
      out.write("                                    <option value=\"4\">Mac</option>\n");
      out.write("                                    <option value=\"5\">Unix</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"quick_link\">\n");
      out.write("                            <h2><a href=\"site_map.jsp\">Quick links <i class=\"icon1\"> </i></a></h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header_menu\">\n");
      out.write("                    <div class=\"menu_box_list\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"color1\"><a href=\"travel_guide.jsp\"><i class=\"icon1\"> </i><span>travel guide</span></a></li>\n");
      out.write("                            <li class=\"color2 active\"><a href=\"service.jsp\"> <i class=\"icon2\"> </i> <span>Service</span></a></li>\n");
      out.write("                            <li class=\"color3\"><a href=\"about.jsp\"> <i class=\"icon3\"> </i><span>about</span></a></li>\n");
      out.write("                            <li class=\"color4\"><a href=\"service.jsp\"> <i class=\"icon4\"> </i><span>the hour</span></a></li>\n");
      out.write("                            <li class=\"color5\"><a href=\"travel_guide.jsp\"> <i class=\"icon5\"> </i> <span>Place</span></a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- start top-->\n");
      out.write("        <div class=\"top_bg\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                <div class=\"top_grids1\">\n");
      out.write("                    <div class=\"top_grids_text\">\n");
      out.write("                        <h2>Anywhere, any time, where here to help.</h2>\n");
      out.write("                        <p>And what mean that</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top_map1\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"map\"></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- start content -->\n");
      out.write("        <div class=\"content_bg\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- start popup -->\n");
      out.write("                    <div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("                        <div class=\"pop_up\">\n");
      out.write("                            <h2>Integer lacinia quam</h2>\n");
      out.write("                            <img src=\"Assets/images/ser_pic1.jpg\" title=\"image-name\">\n");
      out.write("                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- end popup -->\t\n");
      out.write("                    <!-- start btm_grids -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- start footer -->\n");
      out.write("        <div class=\"footer_bg\">\n");
      out.write("            <div class=\"wrap\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <div class=\"f_grids\">\n");
      out.write("                        <div class=\"f_grid right\">\n");
      out.write("                            <h2><a href=\"index.jsp\"></a></h2>\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</p>\n");
      out.write("                        </div>\t\n");
      out.write("                        <div class=\"f_grid\">\n");
      out.write("                            <ul class=\"f_nav\">\n");
      out.write("                                <li><a class=\"active\" href=\"#\">portfolio</a></li> |\n");
      out.write("                                <li><a  href=\"#\">services</a></li> |\n");
      out.write("                                <li><a href=\"#\">staff</a></li> |\n");
      out.write("                                <li><a href=\"#\">articles</a></li> |\n");
      out.write("                                <li><a href=\"#\">contact</a></li>\n");
      out.write("                                <div class=\"clear\"></div>\t\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"f_nav1\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li ><a href=\"#\"> <i class=\"icon1\"> </i><span>twitter</span></a></li>\n");
      out.write("                                    <li ><a href=\"#\"> <i class=\"icon2\"> </i> <span>facebook</span></a></li>\n");
      out.write("                                    <li ><a href=\"#\"> <i class=\"icon3\"> </i><span>rss</span></a></li>\n");
      out.write("                                    <li ><a href=\"#\"> <i class=\"icon4\"> </i><span>mail</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </div>     \t\t\n");
      out.write("                        </div>\t\n");
      out.write("                        <div class=\"clear\"></div>\t\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"footer_nav\">\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">footer links</a></li>\n");
      out.write("                        <li><a href=\"#\">privacy</a></li>\n");
      out.write("                        <li><a href=\"#\">contact</a></li>\n");
      out.write("                        <div class=\"clear\"></div>\t\n");
      out.write("                    </ul>\t\n");
      out.write("                    <p class=\"f_para\">On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. </p>\n");
      out.write("                    <div class=\"footer_top\">\n");
      out.write("                        <p class=\"link\"><span>Â© All rights reserved | Template by&nbsp; <a href=\"http://w3layouts.com/\"> W3Layouts</a></span></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
