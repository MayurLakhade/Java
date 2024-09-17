package CoreJava.abstraction.interfaces;
/*
 * Functional interface is any interface having only one abstract method.
 */

 interface Printable{
    public void print();
 }

 interface SchoolTemplate{ // another example.

    public void attendance(int a , String b);

 }

public class FunctionalInterface {
    public static void main(String[] args) 
    {
        /*
         * lambda expression is a very quick way of giving implementation to an abstract method
         * of a functional interface.
         * 
         * Syntax:-
         * FunctionalInterfaceName variable = (parameters)->{};
         */
        Printable p = ()->{
            System.out.println("This is the implementation given in lambda expression.");
        };

        p.print(); // calling the print method so that our lambda expression starts execution.

        SchoolTemplate s = (int a , String b )->{
            System.out.println("implementation");
        };
        s.attendance(15, "pre");
    }
    
}
