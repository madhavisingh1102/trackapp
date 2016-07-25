import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Validate {

public static void main(String args[])
{
   try
   {
   String host = "address";
   String dbusername = "Madhavi";
   String dbpassword = "mad#123";
   
   Connection con = DriverManger.getConnection(host,dbusername,dbpassword);
   public boolean checkUser(String user, String pwd)
   {
   Statement stmt = con.createStatement();
   Result rs = stmt.executeQuesry("Select user_name and password from user_validation");
   if (user.equals(user_name))
   {
     if (pwd.equals(password))
    return true; 
     
   }
   
   }
   catch (SQLException err)
   {
     System.out.println(err.getMessage())
   }
   }
   finally()
   {
     out.close();
   }
}
}
