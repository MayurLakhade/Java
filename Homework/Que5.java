// Program to show that main methods can be overloaded.
public class Que5 {

/*
 * In this example, the Que5 class contains several overloaded main methods.
 * Each method has a different parameter, it may be String, int, char, double.
 * 
 * When you run the program, you can call any of these main methods based on your requirements. 
 */

    public static void main(String[] args) 
    {
        System.out.println("Original main method.");
    }

    // It will be executed when int value is passed.
    public static void main(int[] args) 
    {
        System.out.println("Overloaded main method.");
        //Inside main method with int parameter.
    }

    // It will be executed when char value is passed.
    public static void main(char[] args) 
    {
        System.out.println("overloaded main method.");
        // Inside main method with char parameter.
    }
    // This is how main method can be overloaded.
}
