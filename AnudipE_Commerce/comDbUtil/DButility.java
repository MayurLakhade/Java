package AnudipE_Commerce.comDbUtil;
import java.sql.*;
import java.sql.Connection;

public class DButility {
    public static Connection makeConnection()
    {
        Connection con = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_commerce?user=root&password=Lakhade@2001");
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return con;
    }

    
}
