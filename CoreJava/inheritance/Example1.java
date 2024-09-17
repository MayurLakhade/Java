package CoreJava.inheritance;
/*
 * Java follows OOPS concept.
 * Main pillars of OOPS:-
 * 1) Inheritance:- Reusing the code of one class into another.
 * 2) Abstraction
 * 3) Polymorphism:- Same name different behaviour.
 * 4) Encapsulation:- Protecting class/class member by using access specifier.
 * 
 * Inheritance is the process of inheriting the members of another class into our own class.
 * This is done by making our class child/sub class of that another class.
 * "extends" is the keyword used to make our class a child class of some other class.
 * 
 * Parent class is also known as base class or super class.
 * Child class is also known as derived class or sub class.
 * 
 * Note:-
 * extends keyword can be followed by only one class name.
 * we can make only one class as our parent class.
 * we cannot make multiple classses as our parent. therefore multiple inheritance is not allowed in java.
 * 
 * Types of Inheritance:-
 * 1) Single inheritance:- one parent and one child class.
 * 2) multi level inheritance:-
 */

 class MobileApp
 {
    public void textMessage()
    {
        System.out.println("Sending text message...");
    }
    public void voiceCall()
    {
        System.out.println("Voice call connecting...");
    }
 }

 class MohakApp
 {
    public void temporaryText()
    {
        System.out.println("Text will be deleted after 24 hrs.");
    }
 }

 class MyApp extends MobileApp
 {
    public void videoCall()
    {
        System.out.println("Video call is connecting...");
    }
 }

public class Example1 {
    
    public static void main(String[] args) 
    {
        MyApp m = new MyApp();
        m.textMessage();
    }
}
