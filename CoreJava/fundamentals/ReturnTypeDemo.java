package CoreJava.fundamentals;

/*
 * Return type declares the type of value that the method is returning.
 */

import java.util.Scanner;

public class ReturnTypeDemo {

    public void display()
    {
        System.out.println("This is the display method. it will not return anything");
    }

    public int add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int total = num1 + num2;

        return total;
        
    }
    
    public static void main(String[] args) 
    {
        ReturnTypeDemo rt = new ReturnTypeDemo();
        rt.display();

        /*
         * Below we are storing the total which is returned by add method
         * into the variable ans.
         */

        int ans = rt.add();
        System.out.println("ans : "+ans);

    }
    
}
