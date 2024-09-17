package CoreJava.abstraction.interfaces;
/*
 * Interfaces are template of a class. We use it to create a basic structure for the class.
 * 
 * Points to remember:-
 * 1) All methods in the interface are automatically considered as public and abstract.
 *  We do not need to add keywords public or abstract.
 * 2) All variables in the interface are automatically public, static and final.
 * 3) Interface objects cannot be created.
 * 4)Interfaces do not have constructors.
 *   Constructors basically are used to create object and to initialize the instance variable.
 *   Since we cannot make the object of interfece and we cannot initialize final variable thru constructor,
 *   hence there is no requirement of constructors in interface. Therefore the concept of constructors are not allowed in interface.
 * 
 * 5) We use 'implements' keyword to make an IS-A relation between class and interface.
 * 6) An interface cannot extend another class. Interface can extend an interface.
 * 7) A class can implement more than one interface. 
 * 8) A class can do both extend another class and implements many interfaces at the same time.
 * 9) We can make nested interfaces also.
 * 10) if in case a class does not want to implement all the methods of an interface, then the class has to declare itself as abstract.
 */

interface ClothingApp{

    public String addToCart(String s);
    double coupon(String code);

}

class MohakApp implements ClothingApp{

    public String addToCart(String s)
    {
        return s;
    }

    public double coupon(String code) 
    {
    
        return 0;
    }
   
}

class PrathmApp implements ClothingApp{

    @Override
    public String addToCart(String s) {
        // TODO Auto-generated method stub
        return s;
    }

    @Override
    public double coupon(String code) {
        // TODO Auto-generated method stub
        return 0;
    }

}
public class InterfacesDemo1 {
    public static void main(String[] args) 
    {
        MohakApp m = new MohakApp();
        System.out.println(m.addToCart("Shirt"));

        System.out.println("variable i in demo2: "+Demo2.i);

    }
    
}
