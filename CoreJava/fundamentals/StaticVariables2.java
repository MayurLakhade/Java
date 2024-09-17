package CoreJava.fundamentals;
/*
 * If we want to access static variable of some other class, 
 * then we can do it without creating an object of that other class.
 * We simply need to use that class name to access the static variable.
 */
public class StaticVariables2 {
    public static void main(String[]args)
    {
        StaticVariables ns = new StaticVariables();
        System.out.println("Num1: "+ns.num1);
        System.out.println("Num2: "+StaticVariables.num2); 
        StaticVariables2 st = new StaticVariables2();
        st.dis();
    }
    /*
    *if we want to access instance variable of some other class into any method 
    *other than main method then we need to create an object of that class and access it through the object. 
    */
    public void dis()
    {
        StaticVariables ns = new StaticVariables();
        System.out.println("num1: "+ns.num1);

        System.out.println(StaticVariables.num2);
        
    }
    
}
