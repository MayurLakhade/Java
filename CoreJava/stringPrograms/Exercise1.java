package CoreJava.stringPrograms;

import java.util.Scanner;

/*
 * Take the name of user.
 * Find out the mirror image of the given name.
 */
public class Exercise1 {
    static String g = "";

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        for(int i = 0 ; i < s.length() ; i++)
        {

            char d = s.charAt(i);
            g = d+g;
        }
        System.out.println("Reverse of string is: "+g);


        ReverseOfString rs = new ReverseOfString();
        rs.reverse(s);

        
    }
    
}
class ReverseOfString {
    public void reverse(String s)
    {
        Exercise1.g = "";
        for(int i = s.length()-1 ; i>=0 ; i--)
        {
            Exercise1.g += s.charAt(i);
        }
        System.out.println("Reverse of string is: "+Exercise1.g);
    }
}
