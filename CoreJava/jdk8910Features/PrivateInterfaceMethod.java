package CoreJava.jdk8910Features;
/*
 * We can also make private methods inside an interface.
 * Uses:-
 * 1) To encapsulate some important codes.
 * 2) If we have some common line of codes which needs to be repeated again and again then we can
 *    write it once in a private method and call this private method wherever we want to execute 
 *    the commom line of codes.
 */
interface PrivateDemo{
    private void display()
    {
        System.out.println("Welcome to our interface!!!");
    }

    default void show()
    {
        display();
        System.out.println("This is the show method.");
    }

    default void add()
    {
        display();
        System.out.println("This is the add method.");
    }
}

public class PrivateInterfaceMethod {
    public static void main(String[] args) 
    {

        
    }
    
}
