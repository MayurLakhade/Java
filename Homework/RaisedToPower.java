import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int r = a;

        for(int i = 1 ; i<b ; i++)
        {
            r *= a;
        }
        System.out.println("the value of a raised to power b is: "+r);
    }
    
}
