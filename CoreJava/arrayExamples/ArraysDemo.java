package CoreJava.arrayExamples;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args)
    {
        /*
         * Arrays is a predefined class used to manipulate the members of an array.
         * In this class all methods are static.
         */

         

         int a[] = {80,2,61,12,100};

         //Sort is a static method so we can call it with just class name.

         Arrays.sort(a);

         System.out.println("Printing members of a: ");
         for(int m : a)
         {
            System.out.print(m+" ");
         }

         /*
          * Binary search will return the index of the member if present in the array.
          */
         System.out.println("\nNumber 12 is at index: "+Arrays.binarySearch(a, 12));
         /*
          * toString is an easy way of printing the members of an array without using loops.
          */
         System.out.println("Members of a: "+Arrays.toString(a));

    }
    
}
