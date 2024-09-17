import java.util.Scanner;
//percentage calculator.
public class Task5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks obtained: ");
        double marks = sc.nextInt();
        double p = (marks/500)*100;
        System.out.println("percentage: "+p);
    }
    
}
