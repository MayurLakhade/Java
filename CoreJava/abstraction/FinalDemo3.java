package CoreJava.abstraction;

final class Demo3{
    String name = "Mohak";
    int id = 11;

    public void dis()
    {
        System.out.println("Hello...");
    }
}
/*
 * Below we are not able to extend the Demo3 class because a final class
 * cannot be extended.
 * A final class can never be a super class/parent class.
 */

class SubDemo3 //extends Demo3
{

}

public class FinalDemo3 {
    public static void main(String[] args) 
    {
        /*
         * We can make object of final class. And we can call the methods
         * of final class from the main method.
         */

         Demo3 d = new Demo3();
         d.dis();
        
    }
    
}
