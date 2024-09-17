import java.util.Scanner;

public class Fri3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();

        if(a%5 == 0 && a%7 == 0)
        {
            System.out.println("The given number is divisible by 5 and 7.");
        }
        else
        {
            System.out.println("The number is not divisible by 5 and 7.");
        }
    }
    
}
