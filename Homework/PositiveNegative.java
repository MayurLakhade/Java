import java.util.Scanner;
//Check whether the number is positive or negative.
public class PositiveNegative {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = sc.nextInt();
        if((a > 0))
        {
            System.out.println("The number is positive");
        }
        else
        {
            System.out.println("the number is negative");
        }
    }
    
}
