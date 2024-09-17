import java.util.Scanner;
//create a method which takes name and email as parameters.
public class Task6 {
    public String details(String name , String email)
    {
       // return "The name is: "+name+ "\nThe email is: "+email;
       return "The name is: "+name+"\nThe email is: "+email;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s1 = sc.nextLine();

        System.out.println("Enter your email: ");
        String s2 = sc.nextLine();

        Task6 ts = new Task6();
        String message = ts.details(s1,s2); 

        System.out.println(message);
      
    }
    
}
