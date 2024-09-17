package CoreJava.fundamentals;

public class ParametersDemo2 {
    
    public void display(String a , int b)
    {
        System.out.println("String is: "+a);
        System.out.println("Int is: "+b);
    }
    public static void main(String[] args) 
    {
        ParametersDemo2 ps = new ParametersDemo2();
        ps.display("java",18);
    }
    
}
