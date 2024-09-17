package CoreJava.stringPrograms;

import java.util.Scanner;

/*
 * Take any word from the user.
 * create a unique password from it where all
 * a --> @
 * e --> 3
 * i --> 1
 * o --> *
 * u --> $
 */
public class Exercise3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = sc.nextLine().toLowerCase();
        
        word = word.replace('a', '@');
        word = word.replace('e', '3');
        word = word.replace('i', '1');
        word = word.replace('o', '*');
        word = word.replace('u', '$');

        System.out.println("Password: "+word);

    }
    
}
