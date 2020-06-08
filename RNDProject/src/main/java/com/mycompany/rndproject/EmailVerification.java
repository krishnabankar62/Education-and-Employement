package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmailVerification extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String OTP)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmailVerification</title>"); 
            out.println(""
                    + "<meta charset=\"utf-8\">\n" +
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                    "\n" +
                    "  <title>Nexmo Two-Factor Authentication Demo</title>\n" +
                    "  <meta name=\"description\" content=\"Nexmo SMS Demo\">\n" +
                    "  <meta name=\"author\" content=\"Tomomi Imura  @girlie_mac\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One\">\n" +
                    "  <link rel=\"stylesheet\" href=\"https://opensource.keycdn.com/fontawesome/4.6.3/font-awesome.min.css\" crossorigin=\"anonymous\">\n" +
                    "  <link rel=\"stylesheet\" href=\"EmailVerify/EmailVarifyCSS/style.css\">"
                    + "");
            
            
            
            out.println("</head>");
            out.println("<body>");
            
            String str = ""+OTP;
            
            out.println(""
                    +"<script>\n" +
                    "		function checkOTP()\n" +
                    "		{\n" +
                    "			var pin = document.getElementById(\"id1\").value;\n" +
                    "			var hide = "+str+";\n" +
                    "			if(pin==hide)\n" +
                    "				document.getElementById(\"resultId\").innerHTML=\"You are verified !\";\n" +
                    "			else document.getElementById(\"resultId\").innerHTML=\"You fail to verified !\";\n" +
                    "		}\n" +
                    "  </script>"+
                    "");
            
//             out.println("<h1>Servlet EmailVerification at " + request.getContextPath() + "</h1>");
            out.println(""
                    +"<header>\n" +
                    "	<h1>Enter 4 digit OTP </h1>\n" +
                    "  </header>\n" +
                    "  \n" +
                    "  <section id=\"main\" role=\"main\">\n" +
                    "      <form name=\"form1\" method=\"post\">\n" +
                    "      <div class=\"fa fa-key\"></div>\n" +
                    "      <input type=\"text\" id=\"id1\" name=\"pin\" placeholder=\"eg:1234\" required>\n" +
                    "      <input type=\"hidden\" id=\"requestId\" value=\"<%=OTP%>\" >\n" +
                    "      <button type=\"button\" onclick=\"checkOTP()\" value=\"Verify PIN\">Verify PIN</button>\n" +
                    "    </form>\n" +
                    "  </section>\n" +
                    "\n" +
                    "  <p id=\"resultId\" class=\"response\"></p>"+
                        "");
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String email_To = request.getParameter("email");
        Integer OTP = (int)(Math.random()*9000+1000);
            
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if(pat.matcher(email_To).matches())
        {
            String msg = "One Time Password : "+OTP;
            try{
                Mailer.send("krishnabankar62@gmail.com","7566727426",email_To,"Email Verification",msg);
            }catch(Exception e)
            {
                out.println("Your Mail Id Does Not Exist !");
            }
        }
        else out.println("Your Mail Id Is Not Valid !");
        
        String str = ""+OTP;
        processRequest(request, response, str);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
