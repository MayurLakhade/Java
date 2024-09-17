import java.util.Scanner;

public class Fri11 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String s = sc.nextLine();

        System.out.print(Character.toUpperCase(s.charAt(0))+".");

        for(int i = 1 ; i < s.length()-1 ; i++)
        {
            if(s.charAt(i) == ' ')
            {
                System.out.print(" "+Character.toUpperCase(s.charAt(i+1)));
            }
        }
    }
    
}
