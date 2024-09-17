package CoreJava.exceptionPrograms;
/*
 * Error is also a child class of Throwable.
 * Errors occurs on code that are dangerous or very serious and these codes should not be
 * handled by try catch. They have to rectified and solved immediately.
 */
class EDemo1{
    /*
     * This will create StackOverflowError because the methods are called infinitely.
     */
    public void display()
    {
        display();
    }
}

public class ErrorDemo1 {
    public static void main(String[] args) 
    {
        //new EDemo1().display(); :- Error (StackOverflow)

        //int [] arr = new int [1000000000]; :- Error :- This will create OutOfMemoryError because
                                                    //   the array size is too big.
                                                       
    }
    
}
