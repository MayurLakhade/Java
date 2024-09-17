package CoreJava.jdbcExamples;
import java.sql.*;
public class ResultSetDemo1 {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
     
            Connection con = DriverManager.getConnection(url);
            String sql = "select * from Employee_honda";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next())
            {
                System.out.println("Employee id: "+rs.getInt(1));
                System.out.println("Employee name: "+rs.getString(2));
                System.out.println("Employee designation: "+rs.getString(3));

                System.out.println("_________________________________________________");
            }
            rs.close();
            st.close();
            con.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
}
