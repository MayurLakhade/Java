package CoreJava.inheritance.polymorphism;
/*
 * Method overloading is the process of making methods of the same name
 * in the same class.
 * 
 * Uses:-
 * It is used for increasing the readability of the class.
 * 
 * how to do method overloading:-
 * 1) make same name methods in the same class.
 * 2) parameters should be different.
 * 3) parameters can be changed in the following way:-
 *     a) Increase the number of parameter.
 *     b) Change the datatype of parameter.
 *     c) Change the sequence of datatype
 */

 class Calculator{

    public void add()
    {
        System.out.println("This is the add method.");
    }

    public void add(char c)// Increasing number of datatype.
    {
        System.out.println("the addition of char: "+(c+c));
    }

    public void add(long g)// changing the datatype of parameter.
    {
        System.out.println("the addition of value: "+(g+g));
    }

    public void add(int i, double j) // Sequence of datatype.
    {
        System.out.println("the addition of  values: "+(i+j));
    }

    public void add(double j , int i)
    {
        System.out.println("the addition of values: "+(j+i));
    }

    public void add(String s , String t)
    {
        System.out.println("The addition of two Strings: "+(s+t));
    }

    public void add(double d)
    {
        System.out.println("The addition of given double value: "+(d+d));
    }

 }
public class MethodOverloading1 {
    public static void main(String[] args) 
    {
        Calculator c = new Calculator();
        c.add();
        c.add(45.2);
        c.add("am I", " Yes.");
        c.add(21.2, 22);
    }
    
}
