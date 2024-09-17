package CoreJava.jdbcExamples;
import java.sql.*;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
     
            Connection con = DriverManager.getConnection(url);
            String sql = "insert into Employee_honda values(?,?,?)";
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter employee id: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee name: ");
            String empName = sc.nextLine();

            System.out.println("Enter employee designation: ");
            String designation = sc.nextLine(); 

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empId);
            ps.setString(2, empName);
            ps.setString(3, designation);

            int i = ps.executeUpdate();
            if(i>0)
            System.out.println("Data inserted successfully.");

            ps.close();
            con.close();
            sc.close();

        }
        catch(Exception e)
        {
            System.out.println("Error while inserting data.");
            e.printStackTrace();
        }
    
    }

    
}
