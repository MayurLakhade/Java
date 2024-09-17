import java.util.Scanner;
//Check whether the number is even or odd.
public class EvenOdd {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if((a%2)==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("the number is odd");
        }
    }
    
}
