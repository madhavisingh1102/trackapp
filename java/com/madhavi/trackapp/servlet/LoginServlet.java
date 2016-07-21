package com.madhavi.trackapp.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//get user id and password.
		String User = request.getParameter ("username");
		String pwd = request.getParameter ("password");
		//get user id and password from database.
		
		// compare DB details with entered user details.
		//if true then return home page else return error page.
		
	}

}

