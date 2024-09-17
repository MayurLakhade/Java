package CoreJava.inheritance;
/*
 * write a program where oppo is the parent class and realme is the child class.
 * Both oppo and realme should have same instance method sale.
 * try calling both method from realme object.
 */

 /*
  * Super keyword can also be used to call the method of the parent class.
  */

 class Oppo{
    public void sale()
    {
        System.out.println("Sales of oppo this year...");
    }
 }

 class Realme extends Oppo{
    public void sale()
    {
        System.out.println("Sales of Realme this year...");
        //super.sale();
    }

    public void dis()
    {
        sale();
        super.sale();
    }

 }
public class SuperDemo2 {
    
    public static void main(String[] args) 
    {
        Realme r = new Realme();
        r.dis();

    }
    
}
