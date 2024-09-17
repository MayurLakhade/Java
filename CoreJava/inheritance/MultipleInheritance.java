package CoreJava.inheritance;

/*
 * The reason for not allowing multiple inheritance in java is because of ambiguity error.
 * Ambiguity error is when a class has two methods of the same signature. if this happens 
 * then jvm will get confused as to which method has to be called.
 * 
 * If a class is allowed to have multiple parents then there is possibility that the parents have the same
 * exact methods and consequently these same methods will be inherited by the child.
 * This will again lead to ambiguity error.
 * Hence multiple inheritance is not allowed in java.
 */

 class C{
    public void display()
    {
        System.out.println("12345...");
    }

    public void display(int a)
    {
        System.out.println("*****");
    }

    public void display(int a , String b)
    {
        System.out.println("$$$$$");
    }
 }

 class S extends C{
    public void display()
    {
        System.out.println("no");
    }
 }

 class D extends S{
    public void display()
    {
        System.out.println("yes");
    }
 }

public class MultipleInheritance {
    public static void main(String[] args) 
    {
        S s = new S();
        s.display();
        s.display(45, "valid");
    }
    
}
