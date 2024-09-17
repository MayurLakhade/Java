package CoreJava.fundamentals;

public class LocalVariables {
    /*
     * local variables are those which are created in local scope. meaning they are created in a method, block, constructor
     */

     public void display()    // Method
     {
        int num = 10;
        System.out.println("Number: "+num);
     }
     {
        double percentile = 87.5;       //block
        System.out.println("Percentage: "+percentile);
     }
    public static void main(String[]args)  //main method
    {
        
        String college = "kdk college";
        System.out.println("College: "+college);
        LocalVariables lv = new LocalVariables(); // Object of LocalVariable class is created here.
        lv.display(); // Calling display method 
        
    }
    
}
