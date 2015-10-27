packge com.madhavi.trackapp.servlet;
import java.io.*;
import java.servlet.*;
import java.servlet.http.*;
public class ForgotPwd extends HttpServlet
{
  public void doGet(HttpServletrequest req,HttpServletResponse res)
  {
    once user click on forgot password then return page to enter email id.
    get user email id and send mail of random password.
    get user's new password and overwrite in DB table.
    Return successful message to user.
  }
}
