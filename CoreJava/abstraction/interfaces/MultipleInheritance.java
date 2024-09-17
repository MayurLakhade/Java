package CoreJava.abstraction.interfaces;

interface Java{
    public void dis();
}

interface Python{
    public void dis();
}

public class MultipleInheritance implements Java, Python {

    public void dis()
    {
        System.err.println("Learning...");
    }

    public static void main(String[] args) 
    {
        MultipleInheritance ml = new MultipleInheritance();
        ml.dis();
    }
    
}
