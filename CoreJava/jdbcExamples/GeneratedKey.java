package CoreJava.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GeneratedKey {
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
            Connection con = DriverManager.getConnection(url);

            String sql = "insert into Employee_honda(empName, designation) values (?,?)";

            System.out.println("Enter Employee name:");
            String empName = sc.nextLine();

            System.out.println("Enter Employee Designation: ");
            String designation = sc.nextLine();

            PreparedStatement pd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pd.setString(1, empName);
            pd.setString(2, designation);

            int i = pd.executeUpdate();

            if(i>0)
            {
                System.out.println("Data inserted successfully.");
                ResultSet rm = pd.getGeneratedKeys();

                if(rm.next())
                {
                    System.out.println("The primary key generated: "+rm.getInt(1));
                }
                rm.close();
            }

            pd.close();
            con.close();
            sc.close();
            
     
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
}
