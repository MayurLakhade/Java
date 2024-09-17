package CoreJava.exceptionPrograms;
/*
 * When an exception occurs we have to handle it so that our program does not get terminated in between.
 * If an exception occurs in our method but we do not want to handle it there then we can use 
 * 'throws' keyword to declare the exception so that anyone who calls our method has the 
 * responsibility to handle the exception.
 * 
 * Note:-
 * With throws keyword we are not handling our exception, we are simply declaring the exception.
 * If the caller method does not handle the exception while calling our method then the program will
 * terminate suddenly without reaching its last line.
 */
class Demo{
    public void databaseConnectivity() throws ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        try {
            d.databaseConnectivity();
        } 
        catch (Exception e) {
            System.out.println("An exception occured.");
        }
    }
    
}
