package CoreJava.stringPrograms;

import java.util.Scanner;

/*
 * write a program to take user input of any word.
 * Example:-
 * String s = "Anudip";
 * 
 * Print pattern as follows:
 * pidunA
 * pidun
 * pidu
 * pid
 * pi
 * p
 * 
 */
public class Exercise6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String.");
        String s = sc.nextLine();
        String a = "";

        for(int i = s.length()-1 ; i>=0 ; i--)
        {
            a += s.charAt(i);
        }
        System.out.println(a+"\n");

        for(int j = a.length()-1 ; j>=0 ; j--)
        {
            for(int k = 0 ; k<=j ; k++)
            {
                System.out.print(a.charAt(k));
            }
            System.out.println();
        }

        Exe es = new Exe();
        es.mes();
    }
    
}

class Exe{
    Scanner sc = new Scanner(System.in);
    
    public void mes()
    {
        System.out.println("Enter String:-");
        String s = sc.nextLine();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            for(int j = s.length()-1 ; j >= i ; j--)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
