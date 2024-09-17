package CoreJava.exceptionPrograms;
/* Object class is the parent of all java classes.
 *
 * In java whenever an exception occurs JVM creates one of the exception class object. 
 * Lets see Exception hierarchy:- 
 * object
 * 
 * Throwable class: This is the parent of all error and exception class.
 * 
 * Error class: This class has many child classes whose objects are created at serious error code.
 *              As developers we need to solve those errors. We should not handle them using try catch.
 * Ex. :- StackOverFlowError, OutOfMemoryError.
 * 
 * Exception class: This is the parent of many exception type classes. These exception occur at error code
 *                  which are not that serious. Hence we can simply handle them using try catch.
 * Ex. :- ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, ClassNotFoundException.
 * 
 * Types of Exception:-
 * RuntimeException: All sub classes of the RuntimeException class is also known as of type RuntimeException.
 * These exceptions are not checked by the compiler while compiling your code.
 * We as developers come to know that such exception are occuring only after we run the program.
 * 
 * CompileTime exception / checked exception:-
 * These types of exceptions are checked by compiler and it forces us to handle
 * the exception there itself. Program will not run until we handle the exception.
 */
public class ExceptionTypes {
    public static void main(String[] args) 
    {

        /*
         * Below we are trying to call a method on null value hence at the line where we call charAt method jvm
         * will create the object of NullPointerException class and terminate our program.
         * 
         * We can handle this exception by writing try catch blocks.
         */
        System.out.println("Welcome to this program...");
        String s = null;

        try
        {
            System.out.println(s.charAt(2)); // new NullPointerException();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        
        System.out.println("Thank you for using our application.");
    }
    
}
