import java.util.Scanner;
//Message printing.
public class Task4 {

    public void message()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" Welcome to this java session.");

    }
    public static void main(String[] args) 
    {
        Task4 ts = new Task4();
        ts.message(); 
    }
    
}
