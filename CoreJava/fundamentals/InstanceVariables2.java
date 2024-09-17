package CoreJava.fundamentals;
//Instance variables are given default values by the constructor
public class InstanceVariables2 {

    int roll;
    String name;
    boolean fresher;
    double marks;

    public InstanceVariables2()
    {

    }

    private InstanceVariables2(String s)
    {
        System.out.println("This is parameterized constructor.");
    }
    public void dis()
    {
        System.out.println("roll : "+roll);
        System.out.println("Name: "+name);
        System.out.println("Feasher Status: "+fresher);
        System.out.println("Marks: "+marks);
    }

    public void show()
    {
        int empId;
        String empName;

       // System.out.println("EmpId: "+empId); //:- Local variables cannot be given default values if not given any value by us.
    }
    public static void main(String[] args) 
    {
        InstanceVariables2 sa = new InstanceVariables2();
        sa.dis();
        InstanceVariables2 sd = new InstanceVariables2("Anudip");

       // Diff ds = new Diff(); //:- We can make constructor as private but we wont be able to access it from another class.
        Diff df = new Diff("Mohak");
        df.sh();
    }
    
}

class Diff{

    private Diff()
    {

    }

    public Diff(String g)
    {
        System.out.println("This is parameterized constructor of Diff.");
    }

    public void sh()
    {
        System.out.println("Static method");
    }
}
