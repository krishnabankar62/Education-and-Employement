package com.mycompany.rndproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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

public class Login extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0); // Proxies.

response.setContentType("text/html");
PrintWriter pw = response.getWriter();

HttpSession hs = request.getSession();
                
        
String uid = request.getParameter("uid");
String passwd = request.getParameter("passwd");
String name = request.getParameter("name");

try{
    
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rndproject", "root", "");
    //String sql = "insert into signup values(?,?,?,?)";
    
    
    String sql="";
             
    if(name=="user")
        sql = "select name, passWord, email from user;";
    else
        sql = "select name, passWord, email from expert;";

    PreparedStatement st = con.prepareStatement(sql);

   
    ResultSet rs = st.executeQuery();
    
    while(rs.next())
    {
        String UserId = rs.getString("name");
        String Userpasswd = rs.getString("passWord");
        String email = rs.getString("email");
        
        if(UserId.equals(uid)&& Userpasswd.equals(passwd))
        {
            
            
            hs.setAttribute("uid", uid);
            hs.setAttribute("email", email);
            RequestDispatcher rd = request.getRequestDispatcher("MyBlogServlet");
            rd.forward(request, response);
    
    
            con.close();
            st.close();
            
            return;
        }
        
    }
    
            pw.print("<font color=red> UserId Or User password Not Matched !</font>");
            RequestDispatcher rd = request.getRequestDispatcher("logInForm.html");
            rd.include(request, response);
        
    
    
  con.close();
  st.close();
  
    
  
}
catch(IOException | ClassNotFoundException | SQLException | ServletException e){pw.println(e);}
 
  
    }
}
