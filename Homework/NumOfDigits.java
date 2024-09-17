import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long a = sc.nextLong();
        long b = 0;
        for( long i = a ; i>0 ; i = i/10)
        {
            b++;
        }
        System.out.println("Number of Digits: "+b);
    }
    
}
