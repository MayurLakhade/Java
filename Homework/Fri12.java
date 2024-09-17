import java.util.Scanner;

public class Fri12 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        boolean pass = false;

        do
        {
            System.out.println("Enter password: ");
            String a = sc.nextLine();
            System.out.println("Re-enter password: ");
            String b = sc.nextLine();

            if(a.equals(b))
            {
                System.out.println("Password is created successfully...");
                pass = true;
            }
            else
            {
                System.out.println("Passwords do not match. Try again.");
            }

        }
        while(!pass);

        
        sc.close();
    }
    
}
