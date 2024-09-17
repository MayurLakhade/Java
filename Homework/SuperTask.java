public class SuperTask {
    /*
     * Create a parent class Vehicle having three constructor.
     * create its child class Car which should have two constructor.
     * Demonstrate how you will call parent constructor from Car class.
     */
    public static void main(String[] args) 
    {
        Car cr = new Car();
    }
    
}

class Vehicle{
    public Vehicle()
    {
        System.out.println("this is zero parameter constructor of Vehicle");
    }

    public Vehicle(String n)
    {
        System.out.println("the vehicle name is: "+n);
    }

    public Vehicle(int a , String b)
    {
        System.out.println("the Vehicle has run: "+a+" kms and the vehicle name is: "+b);
    }
}

class Car extends Vehicle{
    public Car ()
    {
        super(45, "Fortuner");
        System.out.println("this is zero parameterized constructor of Car.");
    }

    public Car(String s)
    {
        System.out.println("the Car name is: "+s);
    }
}
