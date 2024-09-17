package CoreJava.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
 * 1) java.sql package import.
 * 2) Load the driver
 * 3) Create the connection.
 * 4) Query executed with the help of statement/prepared Statement.
 * 5) If in case we are executing select type query, then mysql server will give some data
 *    in return. This is received in the java program by ResultSet object.
 * 6) To close all the objects.
 */
public class Example1 {
    public static void main(String[] args) 
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201";
            String user = "root";
            String pass = "Lakhade@2001";
            Connection con = DriverManager.getConnection(url,user, pass);

            String sql = "insert into Employee_Honda values(112, 'Piyush','sql developer')";
            Statement st = con.createStatement();
            int i = st.executeUpdate(sql);

            if(i > 0)
            {
                System.out.println("Data inserted successfully.");
            }
            else
            System.out.println("Error while inserting data.");

            st.close();
            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
