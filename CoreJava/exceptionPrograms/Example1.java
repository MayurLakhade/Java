package CoreJava.exceptionPrograms;
/*
 * Exception is something that occurs out of the ordinary.
 * In java programs exceptions occur when jvm does not execute all the lines of code in the program,
 * It terminates the program in between due to some error code. This is known as exception.
 * 
 * Defination:-
 * Exception is the abrupt termination of the program without reaching the end point.
 * 
 * When an exception occurs i.e. jvm terminates the program abruptly one of the exception class object
 * is created at the error code.
 * As developers we need to know how to handle such abrupt interruptions and get the program to be executed
 * to the last line of code.
 * This is done by exception handling.
 */
public class Example1 {
    public static void main(String[] args) 
    {
        System.out.println("Hello everyone!!!");
        System.out.println("today is the first day of the week.");

        /*
         * Below we are handling the exception using try and catch block.
         * try block: Used to write any code where exception may occur.
         * 
         * catch block: the exception occuring in try block is caught by catch block,
         * hence jvm will not terminate the program.
         * 
         */

        try
        {
            int div = 10/0; //new arithmeticException();
        }
        catch(Exception e)
        {
            System.err.println("An exception has occured.");
        }

        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nbye Evenyone");
    }
    
}
