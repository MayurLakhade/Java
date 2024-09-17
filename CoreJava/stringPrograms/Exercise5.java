package CoreJava.stringPrograms;

import java.util.Scanner;

/*
 * Take user input of name, city and graduation.
 * Write a program where at the end s should have added all details in the blanks.
 */
public class Exercise5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your city");
        String city = sc.nextLine();
        System.out.println("Enter graduation: ");
        String gra = sc.nextLine();

        String s = "Hi my name is _. Im from _. I have done graduation in _.";

        s = s.replaceFirst("_" , name);
        s = s.replaceFirst("_" , city);
        s = s.replaceFirst("_", gra);

        System.out.println("b : "+s);
    }
    
}
