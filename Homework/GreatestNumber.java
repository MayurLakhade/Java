import java.util.Scanner;
//greatest number out of three numbers.
public class GreatestNumber {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("enter third number: ");
        int c = sc.nextInt();

        if((a>b)&&(a>c))
        {
            System.out.println("the greatest number is: "+a);
        }
        else if((a<b)&&(b>c))
        {
            System.out.println("the greatest number is: "+b);
        }
        else
        {
            System.out.println("the greatest number is:  "+c);
        }

        /*if(a>b)
        {
            //nested if else.
            if(a>c)
            {
                System.out.println("The greatest number is: "+a);
            }
            else
            {
                System.out.println("The greatest number is: "+c);
            }
        }
        else if(b>c)
        {
            System.out.println("The greatest number is: "+b);
        }
        else
        {
            System.out.println("The greatest number is: "+c);
        }*/

        
    }
    
}
