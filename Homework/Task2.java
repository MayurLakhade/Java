//Local variable call.
public class Task2 {
    static int b = 5; 

    public void local()
    {
        int a = 5;
        System.out.println("Local variable is: "+a);
    }
    public static void main(String[] args) 
    {
        Task2 ts = new Task2();
        ts.local();

    }
    
}
