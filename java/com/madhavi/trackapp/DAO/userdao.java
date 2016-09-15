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
 
try 
{
  String dburl = "http://localhost:8080";
  String dbname= "trackapp_db";
  String dbpass= "ta@1234";
  // loads the driver class (by class loader)??
  class.forName("com.mysql.jdbc.driver")
 
  // opens the connection with database
  Connection con = DriverManager.getConnection("http://localhost:8080" ,'trackapp_db', 'ta@1234');
}
 catch (Exception e)
 {
  System.out.println(e.getMessage());
 }

public boolean addUser(User u)
{
 try 
{
  //Execute Query : cteate statement on con object createStatement()
  Statement stmnt = con.createStatement();
  userinfo user = new userinfo();
  uname = user.getName();
  uemail = user.getEmail();
  
  // store sql query in string type variable sql.
  String sql = "insert into userinfo (name,email) values ('"+uname+"' , '"+uemail+"')";
  
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
 
 public boolean updateUser (User u)
 {
  // how to get the variable email to update user name variable.
  userinfo user = new userinfo();
  uemail = user.setEmail(user.getEmail());
  uname = user.getName();
   try
   {
   Statement stmnt = con.createStatement();
   String sql = "update userinfo set email='"+uemail+"' where name='"+uname+"';
   
   stmnt.executeUpdate(sql);
   return true;
   }
   catch (Exception e)
   {
     System.out.println(e.getMessage);
     return false;
   }
   
   public getByEmail(String email)
   {
     try
    {
     userinfo user = new userinfo();
     usremail = user.getEmail();
     Statement stmnt = con.createStatement();
     String sql = "select * from userinfo where email='"+usremail+"'';
     
     ResultSet rs = stmnt.executeQuery(sql);
     
     while(rs.next())
     {
       user.setName(rs.getName());
       user.setEmail(rs.getEmail());
       //System.out.println("Welcome " +uname +"Your email is" +uemail);
      }
      return user;
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
   }
 ====================================================
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

  
  
