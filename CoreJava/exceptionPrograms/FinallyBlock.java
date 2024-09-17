package CoreJava.exceptionPrograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * finally block is used to write all our closing statements.
 * In all cases whether exceptions occurs or not the finally block will be executed hence
 * making sure that all the open streams or files are closed properly before terminating
 * the program.
 * 
 * try{}
 * catch(){}
 * finally{}
 * 
 * try{}
 * finally{}
 */
public class FinallyBlock {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        /*FileInputStream fis = null;
        try {
            new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */

        try{
            int div = 6/0;
        }
        catch(Exception e)
        {
            System.out.println("Exception occured.");
        }
        finally{
            System.out.println("Scanner is closing.");
            sc.close();
        }

        System.out.println("Thank you.");

        
    }
    
}
