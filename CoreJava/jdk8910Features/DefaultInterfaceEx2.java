package CoreJava.jdk8910Features;
/*
 * Multiple inheritance with interfaces is allowed.
 * But if all the interfaces implemented by a class has default methods with exact same 
 * method signature then it becomes compulsory for the class to ovrride the method and give
 * its own implementation.
 */
interface Template1{
    default public void addToCart()
    {
        System.out.println("Product added to cart from Template1");
    } 
}

interface Template2{
    default public void addToCart()
    {
        System.out.println("Product added to cart from Template2");
    } 
}

class Amazon implements Template1, Template2{
    public void addToCart()
    {
        System.out.println("Product added to cart from Amazon.");
    }
}

public class DefaultInterfaceEx2 {
    public static void main(String[] args) 
    {
        
    }
    
}
