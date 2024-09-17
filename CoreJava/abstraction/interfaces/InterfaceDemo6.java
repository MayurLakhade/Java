package CoreJava.abstraction.interfaces;

interface MyInter{
    public void display();
    public void show();
}
/*
 * In below given MyClass we have not given body/implementation to the show method.
 * Meaning the show method inherited from MyInter is being kept as it is and would be abstract.
 * 
 * We already know that any class having abstract method has to be declared as anstract, Therefore we will have to make
 * MyClass also abstract. 
 */
abstract class MyClass implements MyInter{
    public void display()
    {

    }

}
public class InterfaceDemo6 {
    public static void main(String[] args) {
        
    }
    
}
