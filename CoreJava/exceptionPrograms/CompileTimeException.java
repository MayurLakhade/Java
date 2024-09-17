package CoreJava.exceptionPrograms;

public class CompileTimeException {
    public static void main(String[] args) 
    {
        /*
         * Below we are seeing an example of CompileTime exception / checked exception.
         * These types of exceptions are checked by compiler and it forces us to handle
         * the exception there itself. Program will not run until we handle the exception.
         */
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            
            System.out.println("Driver not found.");
        }

        System.out.println("We have reached the end of this program.");
    }
    
}
