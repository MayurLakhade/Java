import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = 0;
        for(; a > 0 ;a/=10 )
        {
            int rem = a%10;
            b = (b*10)+rem;
            //a = a/10;
        }
        System.out.println("Reverse: "+b);
    }
    
}
