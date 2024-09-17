package CoreJava.stringPrograms;

import java.util.Scanner;

/*
 * Take any word from user and print it in following pattern.
 * Example:- James
 * 
 * james
 * jame
 * Jam
 * ja
 * j
 */
public class Exercise4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println(name.length());
        
        for(int i = name.length()-1 ; i>=0 ; i-- )
        {
            for(int j = 0 ; j<=i ; j++)
            {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }


        //Exercise4 x = new Exercise4();
        //x.dis();
    }

    public void dis()
    {
        String name = "Mayur";
        int s = name.length();

        for(int i = 0 ; i < name.length() ; i++)
        {
            for(int j = 0 ; j < s ; j++)
            {
                System.out.print(name.charAt(j));
            }
            s--;

            System.out.println();

        }
    }
    
}
