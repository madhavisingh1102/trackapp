package com.madhavi.trackapp.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SaveExpense extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
	
		String category = req.getParameter("cat");
		String date = req.getParameter ("date");
		String amount = req.getParameter("amt");
		String subcategory = req.getParameter("subcat");
		String currentuser = req.getParameter("curruser");
		// How to get current user 
		
		//boolean done = UserService.addExpense(cat,date,amt,subcat,curruser);
		
		//	if (done==true) 
		//	{
		// 		message for successful addition
		//	}
		//	else 
		//	{
		//		message for failure
		//	}
		
	}
}
