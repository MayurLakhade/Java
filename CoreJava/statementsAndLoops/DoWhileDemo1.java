package CoreJava.statementsAndLoops;

public class DoWhileDemo1 {
    public static void main(String[] args) 
    {
        /*
         * do while loop is used when we want to execute the loop at least for the first time.
         * even if the condition is not satisfied.
         * 
         * Syntax:-
         * do{
         * }
         * while(condition)
         */

         int i = 1;
         do{
            System.out.println("Hello");
            i++;
         }
         while(i<=5);
         
        
    }
    
}
