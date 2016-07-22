

public class Validate {

public static void main(String args[])
{
  try 
  {
         
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
        String db_username = null;
        String db_password = null;
            query = "SELECT username, password FROM login;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                db_username = rs.getString("username");
                db_password = rs.getString("password");
                //check null's also 
                if(dbUsername.equals(username) && dbPassword.equals(password)){
                   System.out.println("sucess");

                }

            }
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
