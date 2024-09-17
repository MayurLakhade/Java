package CoreJava.arrayExamples;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) 
    {
        /*
         * Write a program to store all the names of the students in an array.
         * Print all the members of this array.
         * 
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Size of array: ");
         //int n = sc.nextInt();
         String arr[] = new String[sc.nextInt()];

         System.out.println("Enter names of students: ");
         for(int i = 0 ; i < arr.length ; i++)
         {
            System.out.println("Enter name "+(i+1)+": ");
            arr[i] = sc.next();
         }

         System.out.println("Printing all the names: ");
          for(String j : arr)
         {
            System.out.print(j+" ");
         }
    }
    
}
