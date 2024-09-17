package CoreJava.wrapperClasses;

public class Employee {

    private Integer empId;
    private String empName;
    private String designation;
    private Double salary;
    
    public Integer getEmpId() {
        return empId;
    }


    public void setEmpId(Integer empId) {
        this.empId = empId;
    }


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Employee(String empName, String designation, Double salary) {
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }
    

    public Employee()
    {
        super();
    }
    
    public static void main(String[] args) {
        
    }
    
}
