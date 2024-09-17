package CoreJava.stringPrograms;

public class Exercise8 {
    public static void main(String[] args) 
    {
        /*
         * Write a program to count the number of words in the given String.
         */
        //int count = 0;
        String message = "Hi everyone!! Weekend is here!!";

        String [] s = message.split(" ");

        System.out.println("Number of words: "+s.length);


       /*  for(String i : s)
        {
            count++;
        }
        System.out.println("Number of Words: "+count);*/


    }
    
}
