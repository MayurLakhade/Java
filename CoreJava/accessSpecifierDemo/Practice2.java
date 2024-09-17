package CoreJava.accessSpecifierDemo;

import CoreJava.fundamentals.MethodsDemo1;

public class Practice2 extends MethodsDemo1  {
    public static void main(String[]args)
    {
        MethodsDemo1 md = new MethodsDemo1();
        md.display();
        //md.add(); :- We cannot call default method from any other package. We can call it only in same package.
        //md.show(); :- We cannot call protected method directly like this.
        /*
         * Below we are trying to call the protected show method of MethodsDemo1 class.
         * Since it is protected, we will not be able call it here directly.
         * first we need to make Practice2 class as the child class
         * by using extends keyword.
         * Because of this the show method will be inherited into Practice2 class
         * Now we can make the object of Practice2 and call the show method from this object.
         */
        Practice2 p = new Practice2();
        p.show();

    }
    
}
