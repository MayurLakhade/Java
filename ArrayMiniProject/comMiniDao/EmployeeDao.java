package ArrayMiniProject.comMiniDao;

import ArrayMiniProject.comMiniPojo.Employee;

public interface EmployeeDao {

    public boolean addEmployee(Employee e);
    public Employee [] showAllEmployees();
    public boolean updateEmployees(Employee e);
    public Employee searchEmployeeById(int empId);
    public boolean deleteEmployee(int empId);
    
}
