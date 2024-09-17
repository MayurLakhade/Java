package CoreJava.classAndObjects;

import java.util.Scanner;

/*
 * class is the template to write our code.
 * class is the blueprint of an object.
 * class is a group of states and behaviours. :-- states : variables , behaviours : methods.
 * class is a group of member variables, methods and objects.
 * 
 * Object is the real life entity of a class. It has proper memory allocated for different 
 * variables and methods.
 * object is created with new keyword and then calling the constructor.
 * constructor is a special method used to create object.
 * 
 * Syntax of constructor:-
 * accessSpecifier className(parameters){}.
 * 
 * a class can have more than one constructor. This is known as constructor overloading.
 * Meaning many constructors in one class with same name and different parameters.
 */
public class ClassDemo {
    int a = 10;
    public String display(String b)
    {
        System.out.println("TOday is the last day of working week"+a);
        System.out.println("the input received in display: "+b);
        return "raksha bandhan is comming";
    }

    public ClassDemo()
    {
        System.out.println("I am the constructor of this class");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        ClassDemo ds = new ClassDemo();

        String b = "Whatsup";
        String s = ds.display(b);

        System.out.println(s);

    }
    
}
 