package CoreJava.jdk8910Features;

interface Calculator{
    default public void add(int i , int j)
    {
        System.out.println("Answer: ");
    }

    static void sub(int i , int j )
    {
        System.out.println("Subtraction: "+(i-j));
    }
}

class A implements Calculator{
    public void dio()
    {
        System.out.println(:"klskd");
    }
}

public class StaticInterfaceMethod {
    public static void main(String[] args) 
    {
        /*
         * Below we are directly calling sub method without using any objects 
         * because sub method is static.
         */
        Calculator.sub(45, 2);
    
    }
    
}
