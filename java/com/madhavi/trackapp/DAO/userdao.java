import java.sql.DriverManager;
import java.sql.connection;
import java.sql.SQLException;
//import java.io.IOException;
//import java.io.ServletException;
//import java.io.HttpServletRequest;
//import java.io.HttpServletResponse;
//import java.io.HttpServlet;

public class userdao 
//extends HttpServlet
{
  // connection to database.
  //insert query 
  // return true if inserted

// initialize variables : url,user_name,password.

public boolean addUser(User u)
{
  String dburl = "http://localhost:8080";
  String dbname= "trackapp_db";
  String dbpass= "ta@1234";
  
try 
{
  // loads the driver class (by class loader)??
  class.forName("com.mysql.jdbc.driver")
 
  // opens the connection with database
  Connection con = DeriverManager.getConnection("http://localhost:8080" ,'trackapp_db', 'ta@1234');
  
  //Execute Query : cteate statement on con object createStatement()
  Statement stmnt = con.createStatement();
  
  // store sql query in string type variable sql.
  String sql = "insert into userinfo (name,email) values ('Madhavi','madhavisingh1102@gmail.com')";
  
  // execute query by calling executeUpdate and pass string variable.
  stmnt.executeUpdate(sql);
  
  // return boolean value if data inserted.
  return true
  
} 
 catch (Exception e)
 {
  System.out.println(e.getMessage());
  return false;
 }
 finally 
 {
  try
  {
  stmnt.close();
  con.close();
  }
  catch (Exception e)
  {
    System.out.println(e.getMessage());
  }
 }
}
 
}

  
  
