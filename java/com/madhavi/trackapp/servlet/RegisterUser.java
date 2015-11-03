package com.madhavi.trackapp.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterUser extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)
  {
    //Once user click on register tab, then return form.
    //get all the user details from form.
    String name= req.getParameter("name");
    float salary= req.getParameter("sal");
    String dob = req.getParameter ("dob");//Observed that while putting DATA TYPE as Date it showing error but why?
    
//insert all user data to database user table.
    
  //    boolean success = UserService.addUser('name','sal','dob')
  //  {
//After inserting data in DB return User welcome page.
  //   if (success == true)
  //    {
  //     return successpage;
  //    }
  //    else
  //    {
  //      return error page;
  //    }
  //  }
    
  }
}
