package CoreJava.jdk8910Features;

/*
 * Upto jdk7 we were able to make only abstract methods in an interface, due to which any 
 * class that implements an interface had to give implementation to all the abstract methods.
 * 
 * But in jdk8 the concept of default method had been introduced in java.
 * Now we can make methods having its own implementation inside the interface itself.
 * We make such methods by declaring it with keyword default.
 * 
 * Any child class which implements the interface having default method do not have to override
 * the default method again.
 */

interface Camera{
    public void clickPic();
    public void flash();
    default public  void panorama()
    {
        System.out.println("taking panoramic shots.");
    }
}

class Nikon implements Camera{

    @Override
    public void clickPic() 
    {
        System.out.println("Clicking pics.");
    }

    @Override
    public void flash() 
    {
        System.out.println("Flash on.");
    }

}

public class DefaultInterfaceMethod {
    public static void main(String[] args) 
    {
        
    }
    
}
