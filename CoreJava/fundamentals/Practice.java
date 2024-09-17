package CoreJava.fundamentals;

public class Practice {
    public static void main(String[]args)
    {
        MethodsDemo1 md = new MethodsDemo1(); //Object of class MethodsDemo1
        md.display();
        md.show();
        md.add();
        //md.subtract(); :- We cannot call private method in same or any other package.
        Practice ps = new Practice();
        ps.sis();

    }
    public void sis()
    {
        MethodsDemo1 md = new MethodsDemo1();
        md.show();
    }
    
}
