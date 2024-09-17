package CoreJava.statementsAndLoops;

public class NestedForLoop {
    public static void main(String[] args) 
    {
        /*
         * for loop is used to execute repetitive task.
         * in below given code the inner for loop is printing 1 to 5 in a line.
         * the blank println is used to get the cursor to next line.
         * 
         * now to do the same task for 5 more times
         * we need to put for loop that prints 1 to 5 into another for loop
         * to run that inner for loop 5 times.
         */
        for(int i = 1 ; i<=5 ; i++)
        {
            for(int a = 1 ; a<=5 ; a++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
    
}
