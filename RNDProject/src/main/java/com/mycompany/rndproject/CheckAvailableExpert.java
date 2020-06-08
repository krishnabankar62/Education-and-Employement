package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckAvailableExpert extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        HttpSession hs = request.getSession(false);
            String userName="";
            String userLocation="";
            String userSubDomain="";
            String userQualification ="";
            String userSkill ="";
            String userSex ="";
            String userTypeOfService ="";
            String userTypeOfPlatform ="";
        
        if(hs==null)
        {
           pw.println("<font color=red>U need to login first</font>");
           RequestDispatcher rd = request.getRequestDispatcher("LoginForCheckAvailibility.html");
           rd.include(request, response);
        }
        else
        {        
            userName = (String)hs.getAttribute("name");
            userLocation = (String)hs.getAttribute("location");
            userSubDomain = (String)hs.getAttribute("subDomain");
            userQualification = (String)hs.getAttribute("qualification");
            userSkill = (String)hs.getAttribute("skill");
            userSex = (String)hs.getAttribute("sex");
            userTypeOfService = (String)hs.getAttribute("typeOfService");
            userTypeOfPlatform = (String)hs.getAttribute("typeOfPlatform");
            
            
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println(""+
                      "<head>\n" +
"    <title>Welcome to University of Hyderabad</title>\n" +
"    <!-- Required meta tags-->\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"    <meta name=\"description\" content=\"Colorlib Templates\">\n" +
"    <meta name=\"author\" content=\"Colorlib\">\n" +
"    <meta name=\"keywords\" content=\"Colorlib Templates\">\n" +
"\n" +
"    <!-- fox project-->\n" +
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
"    <script src=\"LocationJS/location.js\"></script>\n" +
"    \n" +
"    \n" +
"\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <!--<div></div>-->\n" +
"    \n" +
"<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n" +
"    <div class=\"container d-flex align-items-center px-4\">\n" +
"        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"            <span class=\"oi oi-menu\"></span> Menu\n" +
"        </button>\n" +
"        \n" +
"        <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n" +
"            <ul class=\"navbar-nav mr-auto\">\n" +
"                <li class=\"nav-item\">\n" +
"                    <img style=\"border-radius: 50%;\" src=\"images/ShareSEK1.png\" width=\"35%\" height=\"80%\">\n" +
"                </li>\n" +
"                <li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link pl-0\">Home</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"courses.html\" class=\"nav-link\">Courses</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"teacher.html\" class=\"nav-link\">Staff</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"registration.html\" class=\"nav-link\">Registration</a></li>\n" +
"                <li class=\"nav-item active\"><a href=\"LoginForCheckAvailability.html\" class=\"nav-link\">CheckAvailability</a></li>\n" +
"                <li class=\"nav-item\"><a href=\"RateNReview\" class=\"nav-link\">ReviewNRate</a></li>\n" +
"            </ul>\n" +
"        </div>\n" +
"    </div>\n" +
"</nav>\n" +
"<!-- END nav -->\n" +
"\n" +
"\n" +
"<!--================================================================================================================-->\n" +
"\n" +
"<div class=\"page-wrapper bg-gra-03 p-t-45 p-b-50\">\n" +
"    <div class=\"wrapper wrapper--w790\">\n" +
"        <div class=\"card card-5\">\n" +
"            <div class=\"card-heading\">\n" +
"                <h2 class=\"title\">Filter your Result</h2>\n" +
"            </div>\n" +
"            <div class=\"card-body\">\n" +
"                <form method=\"POST\" action=\"CheckServices\">\n" +
"\n" +
"                       <input type=\"text\" name=\"userName\" value="+userName+" hidden>"+
"                       <input type=\"text\" name=\"userLocation\" value="+userLocation+" hidden>"+
"                       <input type=\"text\" name=\"userSubDomain\" value="+userSubDomain+" hidden>"+
"                       <input type=\"text\" name=\"userQualification\" value="+userQualification+" hidden>"+
"                       <input type=\"text\" name=\"userSkill\" value="+userSkill+" hidden>"+
"                       <input type=\"text\" name=\"userSex\" value="+userSex+" hidden>"+
"                       <input type=\"text\" name=\"userTypeOfService\" value="+userTypeOfService+" hidden>"+
"                       <input type=\"text\" name=\"userTypeOfPlatform\" value="+userTypeOfPlatform+" hidden>"+

"                    <div class=\"form-row\">\n" +
"                        <div class=\"name col-6\">Select your location : </div>\n" +
"                        <div class=\"value\">\n" +
"                            <div class=\"input-group\">\n" +
"                                <div class=\"rs-select2  select--no-search col-6\">\n" +
"                                    <select name=\"location\" required=\"\">\n" +
"                                        <option id=\"id1\"></option>\n" +
"                                        <option value=\"banglore\">Banglore</option>\n" +
"                                        <option value=\"pune\">Pune</option>\n" +
"                                        <option value=\"hyderabad\">Hyderabad</option>\n" +
"                                        <option value=\"delhi ncr\">Delhi NCR</option>\n" +
"                                        <option value=\"channai\">Chennai</option>\n" +
"                                        <option value=\"indore\">Indore</option>\n" +
"                                    </select>\n" +
"                                    <div class=\"select-dropdown\"></div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"form-row\">\n" +
"                        <div class=\"name col-6\">Area of skill : </div>\n" +
"                        <div class=\"value\">\n" +
"                            <div class=\"input-group\">\n" +
"                                <div class=\"rs-select2 js-select-simple select--no-search col-6\">\n" +
"                                    <select name=\"skill\" required=\"\">\n" +
"                                        <option label=\"slect a skill\"></option>\n" +
"                                        <option label=\"slect a skill\"></option>\n" +
"                                        <optgroup label=\"MBA\">\n" +
"                                            <option value=\"finance\">Finance</option>\n" +
"                                            <option value=\"marketing\">Marketing</option>\n" +
"                                            <option value=\"human resource\">Human Resource</option>\n" +
"                                            <option value=\"operations\">Operations</option>\n" +
"                                            <option value=\"business analytics\">Business Analytics</option>\n" +
"                                        </optgroup>\n" +
"                                        <optgroup label=\"SCIS\">\n" +
"                                            <option value=\"mca\">MCA</option>\n" +
"                                            <option value=\"mtech ai\">MTech AI</option>\n" +
"                                            <option value=\"mtech it\">MTech IT</option>\n" +
"                                            <option value=\"mtech cs\">MTech CS</option>\n" +
"                                        </optgroup>\n" +
"                                        <optgroup label=\"Economics\">\n" +
"                                            <option value=\"finance\">Finance</option>\n" +
"                                            <option value=\"general\">General</option>\n" +
"                                        </optgroup>\n" +
"                                        <optgroup label=\"Chemistry\">\n" +
"                                            <option value=\"organic\">Organic</option>\n" +
"                                            <option value=\"inorganic\">InOrganic</option>\n" +
"                                            <option value=\"quantum\">Quantum</option>\n" +
"                                            <option value=\"physical\">Physical</option>\n" +
"                                            <option value=\"materials\">Materials</option>\n" +
"                                        </optgroup>\n" +
"                                        <optgroup label=\"Physics\">\n" +
"                                            <option value=\"condensed matter\">Condensed Matter</option>\n" +
"                                            <option value=\"nuclear and particals\">Nuclear and Particle</option>\n" +
"                                            <option value=\"high energy\">High Energy</option>\n" +
"                                            <option value=\"optics\">Optics</option>\n" +
"                                            <option value=\"electronics\">Electronics</option>\n" +
"                                        </optgroup>\n" +
"                                    </select>\n" +
"                                    <div class=\"select-dropdown\"></div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"\n" +
"\n" +
"                    <div class=\"form-row p-t-20\">\n" +
"                        <label class=\"label label--block\">Type of service : </label>\n" +
"                        <div class=\"p-t-15\">\n" +
"                            <label class=\"radio-container m-r-55\">Free\n" +
"                                <input type=\"radio\" checked=\"checked\" name=\"typeOfService\" value=\"free\">\n" +
"                                <span class=\"checkmark\"></span>\n" +
"                            </label>\n" +
"                            <label class=\"radio-container  m-r-55\">Paid\n" +
"                                <input type=\"radio\" name=\"typeOfService\" value=\"paid\">\n" +
"                                <span class=\"checkmark\"></span>\n" +
"                            </label>\n" +
"                            <label class=\"radio-container  m-r-55\">Honorarium\n" +
"                                    <input type=\"radio\" name=\"typeOfService\" value=\"honorarium\">\n" +
"                                    <span class=\"checkmark\"></span>\n" +
"                            </label>\n" +
"                        </div>\n" +
"                    </div>\n" +
"\n" +
"                    <div class=\"form-row\">\n" +
"                            <div class=\"name col-6\">Type of Platform : </div>\n" +
"                            <div class=\"value\">\n" +
"                                <div class=\"input-group\">\n" +
"                                    <div class=\"rs-select2 js-select-simple select--no-search col-6\">\n" +
"                                        <select name=\"typeOfPlatform\" required=\"\">\n" +
"                                            <option label=\"select a platform\"></option>\n" +
"                                            <optgroup label=\"Online Session\">\n" +
"                                                <option value=\"WhatsApp\">WhatsApp</option>\n" +
"                                                <option value=\"Telegram\">Telegram</option>\n" +
"                                                <option value=\"YouTube\">YouTube</option>\n" +
"                                                <option value=\"Mail\">Mail</option>\n" +
"                                                <option value=\"PhoneCall\">Phone Call</option>\n" +
"                                            </optgroup>\n" +
"                                            <optgroup label=\"Personal Session\">\n" +
"                                                <option value=\"userPlace\">User Place</option>\n" +
"                                                <option value=\"expertPlace\">Expert Place</option>\n" +
"                                            </optgroup>\n" +
"                                       </select>\n" +
"                                        <div class=\"select-dropdown\"></div>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"\n" +
"                    <div>\n" +
"                        <button class=\"btn btn--radius-2 btn--red\" value=\"reset\" type=\"reset\">Reset</button>\n" +
"                        <button class=\"btn btn--radius-2 btn--red\" value=\"submit\" type=\"submit\">Search</button>\n" +
"                    </div>\n" +
"                </form>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</div>\n" +
"\n" +
"<!-- Jquery JS-->\n" +
"<script src=\"registrationVendor/jquery/jquery.min.js\"></script>\n" +
"<!-- Vendor JS-->\n" +
"<script src=\"registrationVendor/select2/select2.min.js\"></script>\n" +
"<script src=\"registrationVendor/datepicker/moment.min.js\"></script>\n" +
"<script src=\"registrationVendor/datepicker/daterangepicker.js\"></script>\n" +
"\n" +
"<!-- Main JS-->\n" +
"<script src=\"registrationJs/global.js\"></script>\n" +
"<!--==============================================================================================================-->\n" +
"\n" +
"<footer class=\"ftco-footer ftco-bg-dark ftco-section\">\n" +
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
"<script src=\"js/main.js\"></script>\n" +
"\n" +
"</body><!-- This templates was made by Colorlib (https://colorlib.com) -->"
                    + "");
            out.println("</html>");
        }
    }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
