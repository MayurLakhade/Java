/*
 * Below constructor overloading is shown.
 */
class Vehicle{
     public Vehicle()
     {
        System.out.println("This is non parameterized constructor.");
     }

     public Vehicle(int a) // Overloaded constructor.
     {
        System.out.println("This is parameterized constructor with 1 int type parameter.");
     }

     public Vehicle(String s) // Overloaded constructor.
     {
        System.out.println("This is parameterized constructor with 1 String type parameter.");
     }

     public Vehicle(int a , int b) // Overloaded constructor.
     {
        System.out.println("This is parameterized constructor with 2 int type parameters.");
     }

     public Vehicle(int a , String s) // Overloaded constructor.
     {
        System.out.println("This is parameterized constructor with int and String as parameters.");
     }

     public Vehicle(String s , int a) // Overloaded constructor.
     {
        System.out.println("This is parameterized constructor with String and int as parameters.");
     }

     /*
      * Constructor overloading can be done by:-
      * 1) Increasing the number of parameters.
      * 2) Changing the datatypes of parameters.
      * 3) changing the sequence of paremeters.
      */


}

public class Que2 {
    public static void main(String[] args) 
    {
        /*
         * Here we can call any desired constructor we want of a Vehicle class
         * whether it is parameterized or non-parameterized simply by passing parameters
         * while creating an object of Vehicle class.
         */
    }
    
}
