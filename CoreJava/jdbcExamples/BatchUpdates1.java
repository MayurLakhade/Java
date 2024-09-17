package CoreJava.jdbcExamples;
import java.sql.*;

public class BatchUpdates1 {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
     
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();

            String sql1 = "insert into Employee_honda values (141, 'Dinesh','System Engineering')";
            st.addBatch(sql1);

            String sql2 = "update Employee_Honda set empName=Nandu where empId =123";
            st.addBatch(sql2);

            String sql3 = "delete from Employee_honda where empId = 139";
            st.addBatch(sql3);

            int [] arr = st.executeBatch();

            System.out.println("No. of rows inserted : "+arr[0]);
            System.out.println("No. of rows updated : "+arr[1]);
            System.out.println("No. of rows deleted : "+arr[2]);

            st.close();
            con.close();


        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    
}
