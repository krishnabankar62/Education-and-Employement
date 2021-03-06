package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;    
import javax.mail.*;
import javax.mail.internet.*; 

public class Contact extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(""
                    + "<!-- Required meta tags-->\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"    <meta name=\"description\" content=\"Colorlib Templates\">\n" +
"    <meta name=\"author\" content=\"Colorlib\">\n" +
"    <meta name=\"keywords\" content=\"Colorlib Templates\">\n" +
"\n" +
"    <!-- fox project-->\n" +
"    <title>Fox University - Free Bootstrap 4 Template by Colorlib</title>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/animate.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/aos.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"\n" +
"    <!-- Icons font CSS-->\n" +
"    <link href=\"registrationVendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n" +
"    <link href=\"registrationVendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n" +
"    <!-- Font special for pages-->\n" +
"    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\n" +
"\n" +
"    <!-- Vendor CSS-->\n" +
"    <link href=\"registrationVendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n" +
"    <link href=\"registrationVendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n" +
"\n" +
"    <!-- Main CSS-->\n" +
"    <link href=\"registrationCss/main.css\" rel=\"stylesheet\" media=\"all\">\n" +
"\n" +
"    <!--location js-->\n" +
"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n" +
"    <script src=\"LocationJS/location.js\"></script>"+
      "<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n" +
"  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n" +
"  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n" +
"  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>"+
"    <script src=\"js/script.js\"></script>" + "");            
            out.println("</head>");
            out.println("<body>");
            out.println(""
                    + "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n" +
"    <div class=\"container d-flex align-items-center px-4\">\n" +
"        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"            <span class=\"oi oi-menu\"></span> Menu\n" +
"        </button>\n" +
"        <form action=\"#\" class=\"searchform order-lg-last\">\n" +
"            <div class=\"form-group d-flex\">\n" +
"                <input type=\"text\" class=\"form-control pl-3\" placeholder=\"Search\">\n" +
"                <button type=\"submit\" class=\"form-control search\"><span class=\"ion-ios-search\"></span></button>\n" +
"            </div>\n" +
"        </form>\n" +
"        <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n" +
"            <ul class=\"navbar-nav mr-auto\">\n" +
"                 <li class=\"nav-item\">\n" +
"                    <img style=\"border-radius: 50%;\" src=\"images/ShareSEK1.png\" width=\"80%\" height=\"95%\">\n" +
"                </li>&nbsp;&nbsp;&nbsp;&nbsp;"+
"                <li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link pl-0\">Home</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"courses.html\" class=\"nav-link\">Courses</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"teacher.html\" class=\"nav-link\">Staff</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"registration.html\" class=\"nav-link\">Registration</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"LoginForCheckAvailability.html\" class=\"nav-link\">CheckAvailability</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"RateNReview\" class=\"nav-link\">ReviewNRate</a></li>"+ 
"            </ul>\n" +
"        </div>\n" +
"    </div>\n" +
"</nav>\n" +
"<!-- END nav -->\n" +
"\n" 
 + "");
            
    //====================================================================================================================
    
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        String msg = "name : "+name+"\n"+"phone : "+phone+"\n"+"Email : "+email+"\n"+"message : "+message+"\n";
        
        try{
            Mailer.send("krishnabankar62@gmail.com","7566727426","krishnabankar52@yahoo.com","RND USER",msg);  
        }catch(Exception e)
        {
            out.println("Your Mail Id Is Not Valid !");
        }
        
        
        out.println("<h2 style=\"color : green;\">"
                + "<div id=\"dialog-message\" title=\"Message Sent !\">\n" +
            "            <p>\n" +
            "              <span class=\"ui-icon ui-icon-circle-check\" style=\"float:left; margin:0 7px 50px 0;\"></span>\n" +
            "              Thank you for your query, our IT persion will contact you soon.\n" +
            "            </p>\n" +
            "        </div>"
                + "</h2>");
        
    //=====================================================================================================================
            
            
            out.println(""
                    + "<footer class=\"ftco-footer ftco-bg-dark ftco-section\">\n" +
"    <div class=\"container\">\n" +
"        <div class=\"row mb-5\">\n" +
"            <div class=\"col-md-6 col-lg-3\">\n" +
"                <div class=\"ftco-footer-widget mb-5\">\n" +
"                    <h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n" +
"                    <div class=\"block-23 mb-3\">\n" +
"                        <ul>\n" +
"                            <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">CUC Professor CR Rao Road P O, Hyderabad Central University Rd, Gachibowli, Hyderabad, Telangana 500046</span></li>\n" +
"                            <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+91 8516956613</span></a></li>\n" +
"                            <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">krishana@uohyd.ac.in</span></a></li>\n" +
"                        </ul>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"col-md-6 col-lg-3\">\n" +
"                <div class=\"ftco-footer-widget mb-5\">\n" +
"                    <h2 class=\"ftco-heading-2\">Recent Blog</h2>\n" +
"                    <div class=\"block-21 mb-4 d-flex\">\n" +
"                        <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_1.jpg);\"></a>\n" +
"                        <div class=\"text\">\n" +
"                            <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n" +
"                            <div class=\"meta\">\n" +
"                                <div><a href=\"#\"><span class=\"icon-calendar\"></span> June 27, 2019</a></div>\n" +
"                                <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n" +
"                                <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"col-md-6 col-lg-3\">\n" +
"                <div class=\"ftco-footer-widget mb-5 ml-md-4\">\n" +
"                    <h2 class=\"ftco-heading-2\">Links</h2>\n" +
"                    <ul class=\"list-unstyled\">\n" +
"                        <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Home</a></li>\n" +
"                        <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>About</a></li>\n" +
"                        <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Services</a></li>\n" +
"                        <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Deparments</a></li>\n" +
"                        <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Contact</a></li>\n" +
"                    </ul>\n" +
"                </div>\n" +
"            </div>\n" +
"            <div class=\"col-md-6 col-lg-3\">\n" +
"                <div class=\"ftco-footer-widget mb-5\">\n" +
"                    <h2 class=\"ftco-heading-2\">Subscribe Us!</h2>\n" +
"                    <form action=\"EmailSubscription\" method=\"post\" class=\"subscribe-form\">\n" +
"                <div class=\"form-group\">\n" +
"                    <input type=\"text\" name=\"hidden\" value=\"1\" hidden=\"\">\n" +
"                    <input type=\"email\" name=\"emailSubscription\" class=\"form-control mb-2 text-center\" placeholder=\"Enter email address\">\n" +
"                  <input type=\"submit\" value=\"Subscribe\" class=\"form-control submit px-3\">\n" +
"                </div>\n" +
"              </form>\n" +
"                </div>\n" +
"                <div class=\"ftco-footer-widget mb-5\">\n" +
"                    <h2 class=\"ftco-heading-2 mb-0\">Connect With Us</h2>\n" +
"                    <ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-3\">\n" +
"                        <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n" +
"                        <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n" +
"                        <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n" +
"                    </ul>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"            <div class=\"col-md-12 text-center\">\n" +
"\n" +
"                <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n" +
"                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Developed By Krishna Bankar                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</footer>\n" +
"\n" +
"\n" +
"\n" +
"<!-- loader -->\n" +
"<div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n" +
"\n" +
"\n" +
"<script src=\"js/jquery.min.js\"></script>\n" +
"<script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n" +
"<script src=\"js/popper.min.js\"></script>\n" +
"<script src=\"js/bootstrap.min.js\"></script>\n" +
"<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"<script src=\"js/jquery.waypoints.min.js\"></script>\n" +
"<script src=\"js/jquery.stellar.min.js\"></script>\n" +
"<script src=\"js/owl.carousel.min.js\"></script>\n" +
"<script src=\"js/jquery.magnific-popup.min.js\"></script>\n" +
"<script src=\"js/aos.js\"></script>\n" +
"<script src=\"js/jquery.animateNumber.min.js\"></script>\n" +
"<script src=\"js/scrollax.min.js\"></script>\n" +
"<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n" +
"<script src=\"js/google-map.js\"></script>\n" +
"<script src=\"js/main.js\"></script>"
                    + "");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //PrintWriter out = response.getWriter();
        
        processRequest(request, response);
    }
    
}


//============================================================================================


