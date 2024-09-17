package CoreJava.statementsAndLoops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) 
    {
        /*
         * While loop are another type of loop used to execute repetitive task.
         * we use for loop when we know the exact number of times that we want to repeat a task.
         * while loop is used when we do not know how many times we need to repeat a particular task.
         * 
         * Syntax:- 
         * while(condition){
         * repetitive task
         * increament/decrement
         * }
         */
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
         int count = 0;

         while(num > 0)
         {
            num = num/10;
            count++;
         }
         System.out.println("number of digits is: "+count);
    }
    
}
