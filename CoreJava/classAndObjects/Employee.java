package CoreJava.classAndObjects;

public class Employee { //Pojo class.
    private int empId;
    private String name;
    private String designation;
    private double salary;

    public Employee()
    {
        //we have created non parameterised constructor which we will use to create
        //empty Employee object.
    }

    /*
     * Below we have created parameterised constructor used to set all values of
     * the employee in its object at one go.
     */
    public Employee(int empId, String name, String designation, double salary )
    {
        this.empId = empId;
        this. name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    public int getEmpId()
    {
        return empId;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    public String getDesignation()
    {
        return designation;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }

    /*
     * toString method returns the String representation of the object.
     * 
     * Syntax:-
     * public String toString(){
     * return "";
     * }
     * 
     * As seen below toString method is used to fetch/get all the data in all variables together.
     * whenever we print the reference variable of an object, toString method is automatically
     * called and we will be able to see all the data stored in the object.
     * Example:-
     * Employee e2 = new Employee();
     * here e2 is the reference variable of the employee object. Now we will print e2.
     * System.out.println(e2);
     * 
     * Now automatically toString method will be called and we will be able to see all the details
     * on our class.
     */

     public String toString()
     {
        return "Id= "+empId+"\nName: "+name+"\nDesignation: "+designation+"\nSalary: "+salary;
     }

}
