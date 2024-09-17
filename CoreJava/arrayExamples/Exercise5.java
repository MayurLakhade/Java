package CoreJava.arrayExamples;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) 
    {
        /*
         * Create an array of int type size 5. 
         * Take user input to add data in the array.
         * Now sort the array in ascending order.
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter length of array: ");
         int [] a = new int[sc.nextInt()];

         for(int i = 0 ; i < a.length ; i++)
         {
            System.out.println("Enter element"+(i+1)+":");
            a[i] = sc.nextInt();
         }

         for(int i = 0 ; i < a.length ; i++)
         {
            for(int j = i+1 ; j < a.length ; j++)
            {
               if(a[i] > a[j])
               {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
               }
               
            }
            
         }

         System.out.println("Sorted array in ascending order: ");

         for(int j : a)
         {
            System.out.print(j+" ");
         }

         Exercise5 es = new Exercise5();
         es.ascending();

         sc.close();


    }

    public void ascending()
    {
      //int count = 0;
      Scanner sc = new Scanner(System.in);


      System.out.println("\nEnter length of array:=");
      int a[] = new int [sc.nextInt()];

      boolean swapped;
      int n = a.length;
      
      for(int i = 0 ; i < a.length ; i++)
      {
         System.out.println("Enter element"+(i+1)+":");
         a[i] = sc.nextInt();
      }

      do
      {
         swapped= false;
         for(int i = 1 ; i < n ; i++)
         {
            if(a[i-1] > a[i])
            {
               int temp = a[i];
               a[i] = a[i-1];
               a[i-1] = temp;
               // count++;
               // System.out.println(count);
               swapped= true;
            }
         }
         n--;
      }
      while(swapped);

      for(int g : a )
      {
         System.out.print(g+" ");
      }

      sc.close();
    }
    
}
