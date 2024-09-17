package CoreJava.arrayExamples;

public class Exercise3 {
    public static void main(String[] args) 
    {
        int [] a ={1, 2, 3, 4, 5};
        /*
         * Create a new int type array b of size 5.
         * The member should be double of the number in array a.
         */

         int [] b = new int [5];
         
            for(int j = 0 ; j < b.length ; j++)
            {
                b[j] = (a[j]*2);
                System.out.println(b[j]);
            }
         
    }
    
}
