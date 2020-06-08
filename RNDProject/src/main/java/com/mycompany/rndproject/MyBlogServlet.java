package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyBlogServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        HttpSession hs = request.getSession(false);
        String uid;
        String email;
        
        if(hs==null)
        {
           pw.println("<font color=red>U need to login first</font>");
           RequestDispatcher rd = request.getRequestDispatcher("logInForm.html");
           rd.include(request, response);
        }
        else
        {        
            uid = (String)hs.getAttribute("uid");
            email = (String)hs.getAttribute("email");
            
            
            
            
            try  {
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>\n" +
"\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
"    <meta name=\"description\" content=\"\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"\n" +
"    <title>Blog</title>\n" +
"\n" +
"    <!-- Bootstrap core CSS -->\n" +
"    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
"\n" +
"    <!-- Custom fonts for this template -->\n" +
"    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n" +
"    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n" +
"\n" +
"    <!-- Custom styles for this template -->\n" +
"    <link href=\"css/clean-blog.min.css\" rel=\"stylesheet\">\n" +
"\n" +
                    
   /////////////////////////////////////////////////////////////////////////////////////////////
                    
"<link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/animate.css\">\n" +
"    \n" +
"    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/aos.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n" +
"    \n" +
"    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"    \n" +
"    <script  src=\"js/validation.js\"></script>"+
                    
/////////////////////////////////////////////////////////////////////////////////////////////               
                    
"  </head>");
    
            pw.println(""
                    + "<link rel=\"stylesheet\" href=\"css/star.css\">\n" +
"        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">"
                    + "");
            
            pw.println("<body style=\"text-align:center; background-color:#cfd9df\">");
            
            
            pw.println(""
                    + "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n" +
"	    <div class=\"container d-flex align-items-center px-4\">\n" +
"				<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"	        <span class=\"oi oi-menu\"></span> Menu\n" +
"	      </button>\n" +
"	      \n" +
"	      <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n" +
"	        <ul class=\"navbar-nav mr-auto\">\n" +
                                "<li class=\"nav-item\">\n" +
"                                   <img style=\"border-radius: 50%;\" src=\"images/ShareSEK1.png\" width=\"80%\" height=\"95%\">\n" +
"                               </li>&nbsp;&nbsp;&nbsp;&nbsp;"+
"				<li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link pl-0\">Home</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"courses.html\" class=\"nav-link\">Courses</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"teacher.html\" class=\"nav-link\">Staff</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n" +
"				<li class=\"nav-item\"><a href=\"registration.html\" class=\"nav-link\">Registration</a></li>\n" +
"                                <li class=\"nav-item\"><a href=\"LoginForCheckAvailability.html\" class=\"nav-link\">CheckAvailability</a></li>\n" +
"                                <li class=\"nav-item active\"><a href=\"RateNReview\" class=\"nav-link\">ReviewNRate</a></li>\n" +
"	        </ul>\n" +
"	      </div>\n" +
"	    </div>\n" +
"	  </nav>"
                    + "");
            
            pw.print("<br><br><h1><b>WELCOME : "+uid+"</b></h1>");pw.print("<b><a style=\"margin:90%\" href=LogOutServlet> Logout </a></b><br><br>");
            
            
            
            pw.println("<br><br><br><form action=\"MyBlogServlet\" method=\"post\">");
            //pw.println("<h5>you can write here... " + request.getContextPath() + "</h5>");
            pw.print(""
                    + "<div class=\"rating\">\n" +
"            <input type=\"radio\" name=\"star\" id=\"star1\" value=\"5\"><label for=\"star1\"> </label>\n" +
"            <input type=\"radio\" name=\"star\" id=\"star2\" value=\"4\"><label for=\"star2\"> </label>\n" +
"            <input type=\"radio\" name=\"star\" id=\"star3\" value=\"3\"><label for=\"star3\"> </label>\n" +
"            <input type=\"radio\" name=\"star\" id=\"star4\" value=\"2\"><label for=\"star4\"> </label>\n" +
"            <input type=\"radio\" name=\"star\" id=\"star5\" value=\"1\"><label for=\"star5\"> </label>\n" +
"        </div>"
                    + "<br>");
            pw.println("<textarea rows=\"4\" cols=\"50\" name=\"ttext\" placeholder=\"leave you comment here...\"></textarea>");
            pw.println("<button type=\"submit\">Post</button>");
            pw.println("</form>");
            pw.println("</body>");
            pw.println("</html>");
        }catch(Exception e)
        {
            //pw.print(e);
            System.out.println(e);
        }
            
            
            
            String ttext = (String)request.getParameter("ttext");
            int star = Integer.parseInt(request.getParameter("star"))+0;
            Date date = new Date();
            String stdate = date.toString()+"";
            
            
            //import Java.io.flush();
            try{
    
                
                Class.forName("com.mysql.jdbc.Driver");  
                PreparedStatement st2;
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rndproject", "root", "")) {
                    if(ttext!=null)
                    {
                        String sql = "insert into blog(ttext,uid,email,stdate,star) values(?,?,?,?,?)";
                        try (PreparedStatement st = con.prepareStatement(sql)) {
                            st.setString(1, ttext);
                            st.setString(2, uid);
                            st.setString(3, email);
                            st.setString(4,stdate);
                            st.setInt(5,star);
                            st.executeUpdate();
                            //con.close();
                        }
                    }
                    //Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root", "");
                    st2 = con.prepareStatement("select ttext, uid, stdate,star from blog order by sno desc;");
                    ResultSet rs = st2.executeQuery();
                    while(rs.next())
                    {
                        String ttext2 = rs.getString("ttext");
                        String UserId = rs.getString("uid");
                        //String UserEmail = rs.getString("email");
                        String reviewdate =  rs.getString("stdate");
                        int bstar = rs.getInt("star");
                        
                        
                        //if(UserId.equals(uid)&& UserEmail.equals(email))
                        //if(ttext2!=null)
                        //{
                        pw.println("<html>");
                        pw.println("<head>");
                        
                        pw.println(""
                                + "<link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                                "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n" +
                                "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>"
                                + "");
                        pw.println("</head>");
                        pw.println("<body>");
                        
                        pw.println("<div class=\"container\" \"sidebar-module sidebar-module-inset\" \"col-sm-3 col-sm-offset-1 blog-sidebar\">");
                        pw.print("<div class=\"review-block-description\"><i style=\"color:blue\">"+UserId+" : "+reviewdate+" : ");
                        
                        switch (bstar) {
                            case 1:
                                pw.print("&#x2605;");
                                break;
                            case 2:
                                pw.print("&#x2605;&#x2605;");
                                break;
                            case 3:
                                pw.print("&#x2605;&#x2605;&#x2605;");
                                break;
                            case 4:
                                pw.print("&#x2605;&#x2605;&#x2605;&#x2605;");
                                break;
                            case 5:
                                pw.print("&#x2605;&#x2605;&#x2605;&#x2605;&#x2605;");
                                break;
                            default:
                                pw.print("0");
                                break;
                        }
                        pw.println("</i><br>");
                        
                        //pw.println("Email : <i>"+UserEmail+"</i><br>");
                        pw.println("<h5><p  style=\" margin-right: 150px;\n" +
                                "  margin-left: 150px;\"\"align-content: stretch;\" > : "+ttext2+"</p></h5></div><br><br>");
                        pw.println("</div>");
                        //RequestDispatcher rd = request.getRequestDispatcher("MyBlogServlet");
                        //rd.include(request, response);
                        
                        // }             
                        pw.println("</body>");
                        pw.println("</htmln>");
                    }
                }
                st2.close();
    
                }catch(ClassNotFoundException | SQLException e2)
                {
                    //pw.println(e2);
                    System.out.println(e2);
                }

            
            pw.println("<!-- Footer -->\n" +
                "<footer class=\"ftco-footer ftco-bg-dark ftco-section\">\n" +
"      <div class=\"container\">\n" +
"        <div class=\"row mb-5\">\n" +
"          <div class=\"col-md-6 col-lg-3\">\n" +
"            <div class=\"ftco-footer-widget mb-5\">\n" +
"            	<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n" +
"            	<div class=\"block-23 mb-3\">\n" +
"	              <ul>\n" +
"	                <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">CUC Professor CR Rao Road P O, Hyderabad Central University Rd, Gachibowli, Hyderabad, Telangana 500046</span></li>\n" +
"	                <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+91 8516956613</span></a></li>\n" +
"	                <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">krishana@uohyd.ac.in</span></a></li>\n" +
"	              </ul>\n" +
"	            </div>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md-6 col-lg-3\">\n" +
"            <div class=\"ftco-footer-widget mb-5\">\n" +
"              <h2 class=\"ftco-heading-2\">Recent Blog</h2>\n" +
"              <div class=\"block-21 mb-4 d-flex\">\n" +
"                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_1.jpg);\"></a>\n" +
"                <div class=\"text\">\n" +
"                  <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n" +
"                  <div class=\"meta\">\n" +
"                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> June 27, 2019</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n" +
"                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n" +
"                  </div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md-6 col-lg-3\">\n" +
"            <div class=\"ftco-footer-widget mb-5 ml-md-4\">\n" +
"              <h2 class=\"ftco-heading-2\">Links</h2>\n" +
"              <ul class=\"list-unstyled\">\n" +
"                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Home</a></li>\n" +
"                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>About</a></li>\n" +
"                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Services</a></li>\n" +
"                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Deparments</a></li>\n" +
"                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Contact</a></li>\n" +
"              </ul>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"col-md-6 col-lg-3\">\n" +
"            <div class=\"ftco-footer-widget mb-5\">\n" +
"            	<h2 class=\"ftco-heading-2\">Subscribe Us!</h2>\n" +
"                <form action=\"EmailSubscription\" name=\"form1\" method=\"post\" class=\"subscribe-form\">\n" +
"                <div class=\"form-group\">\n" +
"                    <input type=\"text\" name=\"hidden\" value=\"1\" hidden=\"\">\n" +
"                    <input type=\"email\" required=\"\" onchange=\"checkEmail(document.form1.emailSubscription)\" name=\"emailSubscription\" class=\"form-control mb-2 text-center\" placeholder=\"Enter email address\">\n" +
"                  <input type=\"submit\" value=\"Subscribe\" class=\"form-control submit px-3\">\n" +
"                </div>\n" +
"              </form>\n" +
"            </div>\n" +
"            <div class=\"ftco-footer-widget mb-5\">\n" +
"            	<h2 class=\"ftco-heading-2 mb-0\">Connect With Us</h2>\n" +
"            	<ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-3\">\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n" +
"                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n" +
"              </ul>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"        <div class=\"row\">\n" +
"          <div class=\"col-md-12 text-center\">\n" +
"\n" +
"            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n" +
"                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Developed By Krishna Bankar  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </footer>\n" +
"    \n" +
"  \n" +
"\n" +
"  <!-- loader -->\n" +
"  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n" +
"\n" +
"\n" +
"  <script src=\"js/jquery.min.js\"></script>\n" +
"  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n" +
"  <script src=\"js/popper.min.js\"></script>\n" +
"  <script src=\"js/bootstrap.min.js\"></script>\n" +
"  <script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"  <script src=\"js/jquery.waypoints.min.js\"></script>\n" +
"  <script src=\"js/jquery.stellar.min.js\"></script>\n" +
"  <script src=\"js/owl.carousel.min.js\"></script>\n" +
"  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n" +
"  <script src=\"js/aos.js\"></script>\n" +
"  <script src=\"js/jquery.animateNumber.min.js\"></script>\n" +
"  <script src=\"js/scrollax.min.js\"></script>\n" +
"  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n" +
"  <script src=\"js/google-map.js\"></script>\n" +
"  <script src=\"js/main.js\"></script>"+
                "");
            pw.println("\n" +
"    <!-- Bootstrap core JavaScript -->\n" +
"    <script src=\"vendor/jquery/jquery.min.js\"></script>\n" +
"    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n" +
"\n" +
"    <!-- Custom scripts for this template -->\n" +
"    <script src=\"js/clean-blog.min.js\"></script>\n" +
"");
            
        }
    }
}
