package CoreJava.arrayExamples;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) 
    {
        /*
         * Create an array of int type of size 5. Take user input to add data into this array.
         * Print only the even numbers of the array.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of array: ");
         int a [] = new int[sc.nextInt()];

         for(int i = 0 ; i < a.length ; i++)
         {
            System.out.print("Enter element "+(i+1)+":");
            a[i] = sc.nextInt();
         }

         System.out.print("Even numbers in array: ");

         for(int j = 0 ; j < a.length ; j++)
         {
            if((a[j] % 2) == 0 )
            {
                System.out.print(a[j]+" ");
            }
         }

        //  for(int d : a )
        //  {
        //     if(d % 2 ==0)
        //     {
        //         System.out.println(d+" ");
        //     }
        //  }

        sc.close();
    }
    
}
