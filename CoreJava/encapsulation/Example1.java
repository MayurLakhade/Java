package CoreJava.encapsulation;
/*
 * Encapsulation is one of the pillars of OOPS concept.
 * We achieve encapsulation using access specifiers such as private.
 * 
 * private members cannot be accessed directly from outside the class.
 * 
 * Setters are used to store values to private variables.
 * getters are used to get values that are stored in private variables.
 */

 class Employee{
    private int empId;
    private String empName;
    private double salary;

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

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public Employee()
    {

    }

    public Employee(int empId, String empName, double salary)
    {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString()
    {
        return "EmpId: "+empId+"\nEmpName: "+empName+"\nSalary: "+salary;
    }
 }
public class Example1 {
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        //e.empId = 11;
        e1.setEmpId(500);
        e1.setEmpName("mayur");

       // double sal = e1.getSalary();
        //System.out.println("Salary: "+sal);

        System.out.println("details of e1 employee...");
        System.out.println(e1);

        Employee e2 = new Employee(51, "prathm", 50000);
        System.out.println("\ndetails of employee e2...");
        System.out.println(e2);

    }
    
}
