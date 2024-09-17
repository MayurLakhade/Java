package CoreJava.exceptionPrograms;

import java.util.Scanner;

class Demo2{
    public void display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int div = num1/num2;

        System.out.println("Answer= "+div);
        System.out.println("Thank you.");
    }
}
public class ThrowsDemo2 {
    public static void main(String[] args) 
    {
        try
        {
            new Demo2().display();
        }
        catch(Exception e)
        {
            System.out.println("Sorry unable to calculate.");
        }

        System.out.println("Visit again.");
    }
    
}
