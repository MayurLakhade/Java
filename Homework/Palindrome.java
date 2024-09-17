import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPal = true ;
        
        int i = 0;
        int j = s.length()-1;
        while(i < j)
        {
                if(s.charAt(i) != s.charAt(j))
                {
                    isPal = false;
                    break;
                }
            i++;
            j--;
           
        }
        if(isPal)
        {
            System.out.println("String is palindrome.");
        }
        else
        System.out.println("not palimdrome..");

        sc.close();

    }
    
}
