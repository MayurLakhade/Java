import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = 1;
       /*  for(int i = 1 ; i<=a ; i++ )
        {
           b = b*i;
           
        }
        System.out.println("Factorial: "+b);*/

        for (int i = a; i > 0; i--) 
        {
            b = i*b;
        }
        System.out.println("Factorial: "+b);
    }

    
}
