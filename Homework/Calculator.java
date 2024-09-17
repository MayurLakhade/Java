import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the operation from the list below :"+"\naddition: add, subtraction : sub, multiplication : mul, division : div");
        String operation = sc.next();
        

        switch(operation)
        {
            case "add" : System.out.println("the addition is: "+(a+b));
            break;

            case "sub": System.out.println("The subtraction is: "+(a-b));
            break;

            case "mul" :System.out.println("The multiplication is: "+(a*b));
            break;

            case "div" :System.out.println("the division is: "+(a/b));
            break;

            default : System.out.println("wrong operation.");
        }

    }
    
}
