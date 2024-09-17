package CoreJava.arrayExamples;

import java.util.Arrays;

/*
 * Two dimensional arrays are arrays in which each member is also an array.
 * An array of arrays is known as two dimensional arrays.
 * 
 * int[]a =
 * {
 * 1--->0
 * 2--->1
 * 3--->2
 * }
 * 
 * int [][]a =
 * {
 * {1,2,3}--->0
 * {4,5,6}--->1
 * {7,8,9}--->2
 * }
 * 
 * int [] [] [] c=
 * {
 * { {},{} }-->0
 * { {},{} }-->1
 * }
 */
public class TwoDimensionalArray {
    public static void main(String[] args) 
    {
        String [] names = new String[3];
        names[0] = "kartik";
        names[1] = "mayur";
        names[2] = "akash";

        String color[][] = new String[3][2]; //Two dimensional array.
        String a1 [] = {"Red","Brown"};
        String a2 [] = {"Black","Pink"};
        String a3 [] = {"Green", "Yellow"};

        color [0] = a1; // Adding array at index 0 of color.
        color [1] = a2;
        color [2] = a3;


        int [][] numbers = { {1,2},{6,10,15},{900}}; // Another way of initializing two domensional array.
        // This will access the value stored in the index that is present on index 2 of array.
        //present on index 1 of the array numbers.
        System.out.println(numbers[1][2]);

        //Using enhanced for loop or foreach loop.
        System.out.println("\nUsing enhanced for loop...");
        for(int [] x : numbers)
        {
            System.out.println(Arrays.toString(x));
        }

        //Using for loop...
        System.out.println("\nUsing for loop...");
        for(int i = 0 ; i < numbers.length ; i++)
        {
            //numbers[i] will fetch the array at index i of numbers array.
            for(int j = 0 ; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
