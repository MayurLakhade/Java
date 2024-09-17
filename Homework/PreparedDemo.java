import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Anudip_6201?user=root&password=Lakhade@2001";
     
            Connection con = DriverManager.getConnection(url);
            String sql = "delete from Employee_honda where empId = ?";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee id: ");
            int empId = sc.nextInt();
            sc.nextLine();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empId);

            int i = ps.executeUpdate();
            if(i>0)
            System.out.println("Employee deleted successfully.");
            else
            System.out.println("No employee with given id is found");

            ps.close();
            con.close();
            sc.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error while deleting data.");
            e.printStackTrace();
        }
        
    }
    
}
