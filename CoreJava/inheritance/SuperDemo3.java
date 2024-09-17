package CoreJava.inheritance;
/*
 * Points to remember:-
 * 1) Constructors are never inherited from parent to child.
 * 2) when the object of child class is created, then always the non parameterized 
 * constructor of the parent is called.
 * 3) In parent class if we do not make any constructor then compiler creates a non parameterized 
 * constructor in it. But if we as developer are going to create constructor in parent class then always remember to make
 * non parameterized constructor also.
 * 4) We can call any constructor of parent from constructor of child by using super keyword.
 * 5) we can call parent constructor only once inside the constructor of child.
 * 6) Parent constructor call should be the first line of code in the child constructor.
 */
class Garden{
    public Garden()
    {
        System.out.println("This is non parameterised constructor of Garden");
    }

    public Garden(String city)
    {
        System.out.println("This is the garden in the city "+city);
    }
}

class Plant extends Garden{
    public Plant()
    {
        super("Pune");
        System.out.println("This is non parameterised constructor of Plant");
    }

    public Plant(String name)
    {
       // super("nagpur");
        System.out.println("This is the "+name+" plant");
    }
}
public class SuperDemo3 {
    public static void main(String[] args) 
    {
        Plant p = new Plant();
        Plant s = new Plant("lili");

    }
    
}
