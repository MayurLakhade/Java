package CoreJava.abstraction;

abstract class Employee{
    int empId;
    String empName;

    public Employee()
    {
        System.out.println();
    }

    public Employee(int empId , String empName)
    {
        this.empId = empId;
        this.empName = empName;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    public int getEmpId()
    {
        return empId;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void attendance()
    {
        System.out.println("the attendance is marked...");
    }

    abstract public double salaryCal(String employeeType);

    public String toString()
    {
        return "empId: "+empId+"\nempName: "+empName;
    }
    
}

class Developer extends Employee{

    public Developer(int empId , String empName)
    {
        super(empId, empName);
    }
    public double salaryCal(String employeeType)
    {
        if(employeeType.equals("permanent"))
        {
            return 50000;
        }
        else
        {
            return 25000;
        }
    }
}
public class Example2 extends Employee{
    public Example2()
    {
        super(12, "nm");
    }

    public double salaryCal(String employeeType)
    {
        return 20;
    }
    
    public static void main(String[] args)
    {
        Developer d = new Developer(200, "Mayur");
        System.out.println(d);

        Example2 es = new Example2();
        System.out.println("\n"+es);

        
    }
    
}
