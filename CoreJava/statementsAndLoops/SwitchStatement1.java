package CoreJava.statementsAndLoops;

import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String[] args) 
    {
        /*
         * switch statement is used when we know that a variable is going to have
         * many possible values and we want to give different output for different values.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any colour present in rainbow: ");
         String colour = sc.nextLine();

         switch(colour)
         {
            case "violet": System.out.println("known as royal colour.");
            break;

            case "indigo": System.out.println("ashok chakra is of indigo colour.");
            break;

            case "blue": System.out.println("clear sky is of blue colour.");
            break;

            case "green": System.out.println("Grass is of green colour.");
            break;

            case "yellow": System.out.println("puranpoli is of yellow colour.");
            break;

            case "orange": System.out.println("it is a fruit whose colour is also orange.");
            break;

            case "red": System.out.println("we need to stop when traffic signal is red.");
            break; 
            
            default: System.out.println("please write in small letters only, give the colours which are present inside rainbow only.");

         }
    }
    
}
