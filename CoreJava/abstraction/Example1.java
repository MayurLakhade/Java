package CoreJava.abstraction;
/*
 * Abstraction is another pillar of OOPS concept.
 * 
 * In java we achieve abstraction by making abstract method.
 * Abstract method do not have their own method body. They only have method signature.
 * These abstract methods are given implementation/method body by child classes according to 
 * their requirements.
 * 
 * Points to remember:-
 * 1) Abstract method has to be declared by using abstract keyword.
 * 2) an abstract method can only be made inside an abstract class,
 *  meaning if your class has an abstract method; then it is compulsory to declare
 *  the class also abstract.
 * 3) We cannot make the object of abstract class because our class is incomplete, since it has
 * abstract methods.
 * 4) Any child class of an abstract parent class has to give implementation to the abstract method.
 * 5) If a child class does not want to give implementation to abstract method inherited from parent class,
 *  then it will have to declare itself as abstract.
 * 6) Abstract class can have constructor. We cannot call this constructor directly after new keyword.
 *  We have to call it with super keyword from child class constructor.
 * 7) Abstract keyword and final keyword can never be used together.
 *  Because abstract keyword and final keyword are doing completely opposite work.
 *  With abstract we are expecting the child class to change the implementation; Whereas with
 *  final keyword we are preventing child class to make changes.
 *  Hence we are not allowed to use these keywords together.
 */

 abstract class Robot1{
    public void talking ()
    {
        System.out.println("the robot is coding.");
    }

    public void cleaning()
    {
        System.out.println("the robot is cleaning.");
    }
    /*
     * Below we are seeing an abstract method.
     * this type of method does not have method body.
     */
    public abstract void dancing(); 

 }

 class MayurRobot extends Robot1{
    public void dancing()
    {
        System.out.println("My robot is doing boxing instead.");
    }
 }

 class PrathmRobot extends Robot1{
    public void dancing()
    {
        System.out.println("my robot is doing webdev instead.");
    }
 }

 abstract class KaluRobot extends Robot1 {
    public void singing()
    {
        System.out.println("robot singing.");
    }
 }

 class SmitRobot extends KaluRobot{
    public void dancing()
    {
        System.out.println("Robot is doing data analysis.");
    }
 }
public class Example1 {
    public static void main(String[] args) 
    {
        System.out.println("Mayur Robot is capable of...");
        MayurRobot m = new MayurRobot();
        m.dancing();
        m.cleaning();
        m.talking();

        System.out.println("\nPrathm robot is capable of...");
        PrathmRobot p = new PrathmRobot();
        p.dancing();
        p.cleaning();
        p.talking();

        SmitRobot s = new SmitRobot();
        System.out.println("\nSmitRobot is...");
        s.singing();


    }
    
    
}
