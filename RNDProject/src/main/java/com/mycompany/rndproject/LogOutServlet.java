package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
       response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
       response.setDateHeader("Expires", 0); // Proxies.
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        HttpSession hs = request.getSession(false);
        
        if(hs==null)
        {
           pw.println("<font color=red>U need to login first</font>");
           RequestDispatcher rd = request.getRequestDispatcher("logInForm.html");
           rd.include(request, response);
        }
        else
        {
            hs.setAttribute("uid", null);
            hs.invalidate();
           RequestDispatcher rd = request.getRequestDispatcher("logInForm.html");
           rd.include(request, response);
        }
        }    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              doGet(request,response);  
    }
}
