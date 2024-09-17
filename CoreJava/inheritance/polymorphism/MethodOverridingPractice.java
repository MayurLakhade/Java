package CoreJava.inheritance.polymorphism;
/*
 * create a class Student which has instance variables rollno. and name.
 * Student class has a method attendSession which prints "student is attending the session".
 * Create a child class studentName
 * When we call attendSession from studentName class it should specify that the student is 
 * attending online
 */

 class Student{
    int rollno ;
    String name ;

    public void attendSession()
    {
        System.out.println("Student is attending the session. ");
    }

 }

 class Mayur extends Student {
    public void attendSession()
    {
        System.out.println("Student is attending online.");
    }
 }
public class MethodOverridingPractice {
    public static void main(String[] args) 
    {
        Mayur s = new Mayur();
        s.attendSession();
    }
    
}
