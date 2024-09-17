package CoreJava.fundamentals;

public class Typecasting {
    public static void main(String[] args) 
    {
        double marks = 80.25;
        System.out.println("Marks as double type: "+marks);
        /*
         * Below we are narrowing our type from double to int
         * this is known as downcasting or narrowing.
         */
        int n = (int)marks;
        System.out.println("marks as int type: "+n);

        /*
         * Below we are storing int type value into double type variables.
         * this is known as upcasting or widening type casting.
         * this is done automatically we dont need to write extra code for it.
         */

         int num = 45;
         double num1 = num;
         System.out.println("num: "+num);
         System.out.println("num1: "+num1);

    }
    
}
