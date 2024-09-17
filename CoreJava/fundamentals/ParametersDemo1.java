package CoreJava.fundamentals;
// Parameters are made in methods to take inputs.
import java.util.Scanner;

public class ParametersDemo1 {

    public int add(int num1, int num2)
    {
        return num1+num2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int i = sc.nextInt();

        System.out.print("Enter second number: ");
        int j = sc.nextInt();

        ParametersDemo1 pd = new ParametersDemo1();
        int total = pd.add(i, j);

        System.out.print("Total is: "+total);
    }
    
}
