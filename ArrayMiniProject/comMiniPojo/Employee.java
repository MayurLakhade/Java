package ArrayMiniProject.comMiniPojo;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private double salary;
    private String userName;
    private String password;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public Employee()
    {
        
    }

    public Employee(int empId, String empName, String designation, double salary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public String toString() {
		return "Emloyee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
    }

    

    


    
    
}
