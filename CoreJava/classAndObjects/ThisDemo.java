package CoreJava.classAndObjects;

public class ThisDemo {
    int rollNo;
    String name;

    ThisDemo(int rollNo , String name)
    {
        this();
        this.rollNo = rollNo;
        this.name = name;

        System.out.println("Wen are in the parameterised constructor.");        
    }

    ThisDemo()
    {

        System.out.println("We are in non-parameterized constructor.");
    }

    ThisDemo(int rollNo)
    {
        this(rollNo, "mok");
        this.rollNo  = rollNo;
        System.out.println("We are in parameterized constructor with int rollNo as parameter.");
    }

    public void display()
    {
        System.out.println("This is display method.");
        show();
    }

    public void show()
    {
        System.out.println("This is show method.");
        this.display();
    }
    public static void main(String[] args) 
    {
        /*
         * Definition:-
         * this keyword represents the current class object.
         * Meaning we are representing the object of class in which we are writting this keyword.
         * 
         * this keyword uses:-
         * a) To differentiate between local variable and instance variables.
         * 
         * b) To call one constructor from another constructor within same class.
         * 
         *    Points to remember (When using this keyword for constructor call) :-
         * 
         *    1) A constructor can call only one other constructor, meaning we cannot call multiple constructor
         *       from inside one single constructor.
         *    2) The constructor call should be the first line of code in the constructor.
         *    3) We cannot call constructor in a way that two constructors are calling each other,
         *       or in a way that results in infinite constructor call.
         * 
         * c) We can also pass the current class object in any method or constructor using this keyword.
         *   We will see this in detail in multithreading chapter.
         * 
         * d) We can also call same class method using this keyword.
         */

         ThisDemo t = new ThisDemo(43, "Mohak");
        
    }

}
