//Swaping numbers
public class Task7 {
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 8;

        /*int total = a+b;
        a = total - a;
        b = total - b;*/
        
        a = a+b;
        b = a-b;
        a = a-b;
         

        System.out.println("a is: "+a+"\nb is: "+b);
    }
}
