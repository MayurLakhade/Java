package CoreJava.collectionPrograms;

import java.util.Enumeration;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) 
    {
        /*
         * Stack class extends vector class hence we see similar properties
         * as vector.
         * We can use Enumeration with stack also.
         * Stack follows LIFO(last in first out).
         * push method is used to add members in the stack.
         * pop method will delete the last member that was added to the stack.
         */

         Stack<String> s = new Stack<String>();
         s.push("January");
         s.push("February");
         s.push("March");
         s.push("April");
         s.push("May");
         //s.push(null);

         System.out.println("Before: \n"+s);

         s.pop();

         System.out.println("After popping:\n"+s);
         Enumeration<String> e = s.elements();
         while(e.hasMoreElements())
         {
            System.out.println(e.nextElement());
         }
        
    }
    
}
