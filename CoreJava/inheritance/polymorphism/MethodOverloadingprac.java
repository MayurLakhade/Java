package CoreJava.inheritance.polymorphism;
/*
 * Write a program where a car can run on different types of fuel.
 */

 class FuelType{
    public void fuel()
    {
        System.out.println("The car is running on petrol.");
    }

    public void fuel(int i)
    {
        System.out.println("The car is running on CNG.");
    }

    public void fuel(String s)
    {
        System.out.println("The is running on diesel.");
    }
 }
public class MethodOverloadingprac {
    public static void main(String[] args) 
    {
        FuelType fl = new FuelType();
        fl.fuel();
        fl.fuel(1);
        fl.fuel("diesel");
    }
    
}
