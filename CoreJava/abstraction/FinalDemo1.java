package CoreJava.abstraction;
/*
 * Final keyword is used to make any member final meaning its value or 
 * behavior cannot be changed once it is declared final.
 */

 class Demo1{
    final int a = 15;
    int b = 20;

    public void dis()
    {
       // a = 100;  :- cannot change value.
        b = 200;

    }
 }
public class FinalDemo1 {
    public static void main(String[] args) 
    {
        Demo1 d = new Demo1();
        d.b = 300;
        // d.a = 600; :- cannot change value.
    }
    
}
