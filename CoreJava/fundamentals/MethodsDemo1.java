package CoreJava.fundamentals;
/*
 * Methods are a block of code which will execute only if it is called.
 * 
 * Syntax :-
 * accessSpecifier returnType methodName(parameters){ }
 * 
 * access specifier : It gives the scope of visibility for the method.
 * 
 * 1) public : It has the highest visibility. This type of method can be called from everywhere.
 *   even from another package.
 * 
 * 2) protected : It has less visibility than public. It can be accessed by all classes in same package.
 *   But if we want to access the method in other package then it has to be called from child class only.
 * 
 * 3) default : It has lesser visibility than protected. It can only be accessed by those class which 
 *   are present in same package only. we will never be able to access it from other package.
 * 
 * 4) private : It is giving least visibility. we can only access this method in same class only.
 *  
 */
public class MethodsDemo1 {
    int a = 10;
    
    public void display()  //public access specifier (method)
    {
        System.out.println("This is the method of MethodsDemo1 class");
    }

    protected void show()  //Protected access specifier (method)
    {
        System.out.println("I am the method which is protected");
    }

    void add()             //default access specifier (method)
    {
        System.out.println("We are adding...");
    }

    private void subtract() // private access specifier (method)
    {
        System.out.println("We are subtracting...");
    }

    public static void main(String[]args)
    {
        MethodsDemo1 md = new MethodsDemo1();
        md.display();
        md.show();
        md.add();
        md.subtract();
        
    }
    
}
