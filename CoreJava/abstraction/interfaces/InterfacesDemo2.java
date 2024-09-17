package CoreJava.abstraction.interfaces;
/*
 * Below we are seeing that the variables are automatically considered as public, static and final, 
 * We dont need to use the specific keywords to make them so.
 */
interface Demo2{

    int i = 100;
    String s = "Anudip";

}
public class InterfacesDemo2 {
    public static void main(String[] args) 
    {
        System.out.println("i= "+Demo2.i);
        //Proven that the variable i is static and final.

        /*
         * As seen below we will never be able to create the object of the interface.
         */
      //  Demo2 d = new Demo2();
    }
    
}
