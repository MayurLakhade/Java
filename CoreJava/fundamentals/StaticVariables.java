package CoreJava.fundamentals;
/*
 * static variables are created in class with static word.
 * static variables are allocated with memory at the class loading stage itself.
 * we do not need to make the object of the class to access these type of variables.
 */
public class StaticVariables {
    int num1 = 15;
    static int num2 = 20;
    public static void main(String[]args)
    {
        StaticVariables sv = new StaticVariables(); 
        System.out.println("Num2: "+num2);
        sv.display();

    }

    public void display()
    {
        System.out.println("Num2: "+num2);
    
    }
    
}
