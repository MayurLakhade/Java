import java.util.Scanner;
//Code for prime number.
public class Fri7 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        boolean isPrime = true;
        if(a < 2)
        {
            isPrime = false;
        }
        else
        {
            for(int i = 2 ; i <= a/i ; i++)
            {
                if(a % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("The number is prime number.");
            }
            else
            {
                System.out.println("The number is not prime number.");
            }
        }
    }
    
}
