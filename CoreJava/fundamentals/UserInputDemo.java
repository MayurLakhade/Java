package CoreJava.fundamentals;

import java.util.Scanner;

public class UserInputDemo {
     
    public static void main(String[]args)
    {
        //
        Scanner sc = new Scanner(System.in);  //This is the object of scanner class
        System.out.println("Enter your name : ");
        String name = sc.nextLine();     //nextLine() = Methode
        System.out.println("Enter your surname");
        String surname = sc.nextLine();
        System.out.println("Enter your email.");
        String email = sc.nextLine();
        System.out.println("Enter your current location");
        String currentlocation = sc.nextLine();

        System.out.println("Name: "+name+"\nSurname: "+surname+"\nemail: "+email+"\ncurrentlocation: " +currentlocation  );
        
        
    }

    
}
