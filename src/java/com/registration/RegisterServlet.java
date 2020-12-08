
package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>Welcome to Registration Servlet</h1>");
        
        String name=req.getParameter("user_name");
        String password=req.getParameter("user_password");
        String email=req.getParameter("user_email");
        String gender=req.getParameter("user_gender");
        String course=req.getParameter("user_course");
        
        String condition=req.getParameter("condition");
   if(condition!=null){     
  if(condition.equals("checked")) 
  {
      out.println("<h1>Name : "+name+"</h1>");
      out.println("<h1> Password : "+password+"</h1>");
      out.println("<h1> Email : "+email+"</h1>");
      out.println("<h1> Gender : "+gender+"</h1>");
      out.println("<h1> Course : "+course+"</h1>");
      
      //
      //jdbc
      //
      
      //save to db
      RequestDispatcher rd=req.getRequestDispatcher("sucess");
      rd.forward(req, resp);
      
  }
   
  else
  {
      out.println("<h1>you have not accepted terms and conditions</h1>");
  }
     
   }
   
   else{
       out.println("<h1>you have not accepted terms and conditions</h1>");
       //i want to include output of index.html
       //get the object of request dispatcher
       RequestDispatcher rd=req.getRequestDispatcher("index.html");
       rd.include(req, resp);
       
   }
        
    }
    
}
