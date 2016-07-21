package com.madhavi.trackapp.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//get user id and password.
		String User = req.getParameter ("username");
		String pwd = req.getParameter ("password");
		//get user id and password from database.
		if (Validate.CheckUser(User,pwd))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Welcome");
			rd.forward(req,res);
		}
		else
		{
			System.out.println("User and Password in incorrect");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFront.jsp");
			rd.include(req,res);

		}
		
	}

}

