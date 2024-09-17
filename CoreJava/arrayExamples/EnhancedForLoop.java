package CoreJava.arrayExamples;

public class EnhancedForLoop {
    public static void main(String[] args) 
    {
        /*
         * Enhanced for loop is also known as for each loop.
         * This type of loop is used to fetch the data from arrays or collections.
         * 
         * Syntax:-
         * for(arrayDataType var: arrayName){}
         */

         double [] marks = {90.54, 50.25, 85.25, 63.35, 87.22};

         System.out.println("Using normal for loop...");

         for(int i = 0 ; i <marks.length ; i++)
         {
            System.out.println(marks[i]);
         }

         System.out.println("\nUsing enhanced for loop...");

         for(double m : marks)
        {
            System.out.println(m);
        }
    }
}
