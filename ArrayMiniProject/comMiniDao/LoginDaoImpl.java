package ArrayMiniProject.comMiniDao;

import ArrayMiniProject.comMiniPojo.Employee;

public class LoginDaoImpl implements LoginDao{

    @Override
    public boolean employeeLogin(String userName, String password) 
    {
        Employee [] empList = new EmployeeDaoImpl().showAllEmployees();
        for(Employee e : empList)
        {
            if(e != null && e.getUserName().equals(userName) && e.getPassword().equals(password))
            {
                return true;
            }
           
        }
         return false;

        
    }

    @Override
    public boolean adminLogin(String userName, String password) {
        if(userName.equals("admin") && password.equals("Admin@123"))
        {
            return true;
        }
        return false;
        
    }
    
}
