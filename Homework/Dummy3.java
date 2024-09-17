import java.util.Scanner;

public class Dummy3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1 = 0 ; 
        int count2 = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '@')
            {
                count1++;
            }
            
        }
        if(s.contains("gmail.com") || s.contains("yahoo.com") || s.contains("rediffmail.com"))
        {
            count2++;
        }

        if(count1 == 1)
        {
            System.out.println("The given email has only one '@' sign." );
        }
        else
        {
            System.out.println("Email has multiple or no '@' sign.");
        }

        if(count2 != 0)
        {
            System.out.println("It have some domain in it.");
        }
        else
        {
            System.out.println("it does not have any domain in it.");
        }


    }
    
}
