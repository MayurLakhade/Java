package CoreJava.classAndObjects;
//Constructor will always return object of class. It do not have return type in syntax.
public class ConstructorDemo1 {

    public ConstructorDemo1()
    {
        System.out.println("this is non parameterized constructor.");
    }

    public ConstructorDemo1(String s)
    {
        System.out.println("The string data given: "+s);
    }
    public ConstructorDemo1(String s, int a)
    {
        System.out.println("This constructor has two parameters");
        System.out.println("String data: "+s+"\nint data: "+a);
    }
    public static void main(String[] args) 
    {
       /*
        * we can make more than one object of the same class.
        * It is our wish how we want to create the object,we can use any of the constructors,
        * available to us to make object.
        */
        ConstructorDemo1 cd = new ConstructorDemo1("Anudip", 100);
        ConstructorDemo1 cd1 = new ConstructorDemo1("Mayur");
        ConstructorDemo1 cd2 = new ConstructorDemo1();

    }
    
}
