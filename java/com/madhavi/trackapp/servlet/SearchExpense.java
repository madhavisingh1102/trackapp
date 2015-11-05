package com.madhavi.trackapp.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SearchExpense extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res, Object list)
	{
		String fromdate = req.getParameter ("fromdate");
		String todate = req.getParameter ("todate");
		//list<user> users = UserService.userExpense(fromdate,todate)
		// user is user object regarding class user in model package.
		// if (users.empty())
		//{
		//  	return (error.jsp);
		// }
		// else
		//{
			//for (user u : users)
			//{
				//return jsp with list users.
			//}
		//}
	//}

}
}
