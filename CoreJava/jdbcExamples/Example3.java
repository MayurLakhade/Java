package CoreJava.jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
     
            Connection con = DriverManager.getConnection(url);
            String sql = "select * from Employee_honda where empId = ?";

            Scanner sc = new Scanner (System.in);
            System.out.println("Enter Employee id to be searched: ");
            int empId = sc.nextInt();
            sc.nextLine();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empId );
            ResultSet rt = ps.executeQuery();

            if(rt.next())
            {
                System.out.println("Employee id: "+rt.getInt(1));
                System.out.println("Employee name: "+rt.getString(2));
                System.out.println("Employee designation: "+rt.getString(3));
            }
            else
            System.out.println("No Employee found.");
            

            rt.close();
            con.close();
            ps.close();
            sc.close();


            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
