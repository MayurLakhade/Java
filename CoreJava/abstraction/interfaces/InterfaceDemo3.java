package CoreJava.abstraction.interfaces;

interface Template1{

    public void dis();
}

class Program{
    public void coding()
    {
        System.out.println("Programmer is coding.");
    }
}

//interface Template2 extends Program{} :-- Interface cannot extend another class.

/*
 * Below we are seeing that we can make another interface as the parent 
 * of Template2 interface.
 * But we will not be able to make a class as the parent of our Template2 interface.
 */
interface Template2 extends Template1{
    public void show();
    
}

public class InterfaceDemo3 {
    public static void main(String[] args) 
    {
        
    }
    
}
