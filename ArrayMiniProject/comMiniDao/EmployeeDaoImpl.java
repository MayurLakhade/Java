package ArrayMiniProject.comMiniDao;

import java.util.Scanner;

import ArrayMiniProject.comMiniPojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    Scanner sc = new Scanner(System.in);
    Employee es = new Employee();
    Employee [] empList = new Employee[50];
    int index = 0;

    public boolean addEmployee(Employee e)
    {
        if(index < 50)
        {
            empList[index] = e;
            index++;
            return true;
        }
        return false;
    }

    @Override
    public Employee[] showAllEmployees() 
    {
        int count = 0;
        for(Employee emp : empList)
        {
            if(emp != null)
            {
                count++;
            }
        }
        Employee [] newEmpList = new Employee[count];
        int j = 0;
        for(int i = 0 ; i < count ; i++)
        {
            
            if(empList[i] != null)
            {
                newEmpList[j] = empList[i];
                j++;
            }
        }
        //empList = newEmpList;
        return newEmpList;
        
    }

    @Override
    public boolean updateEmployees(Employee e) 
    {
        for(int i = 0 ; i < empList.length ; i++)
        {
            if(empList[i].getEmpId() == e.getEmpId())
            {
                empList[i] = e;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee searchEmployeeById(int empId) 
    {
        for(Employee emp : empList)
        {
            if(emp != null)
            {
                int id = emp.getEmpId(); // Getting the id of employee object from array.
                if(id == empId) // Checking if the object has the same id as user given id.
                {
                    return emp; // if matching returning the employee object.
                }
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int empId) 
    {
        for(int i = 0 ; i < empList.length ; i++)
        {
            if(empList[i] != null)
            {
                if(empList[i].getEmpId() == empId)
                {
                    for(int j = i ; j+1 < empList.length ; j++)
                    {
                        empList[j] = empList[j+1];
                    }
                    return true;
                } 
            }
        }
        return false;
    }

    public Employee searchEmployeeByName(String name)
    {
        for(Employee emp : empList)
        {
            if(emp != null)
            {
                if(emp.getEmpName().equalsIgnoreCase(name))
                {
                    return emp;
                }
            }
        }
        return null;
    }

    public void credentialsCreate()
    {
        boolean set = false;

        while(set == false)
        {
            System.out.println("Enter user name (Must be 6 to 20 characters): ");
            es.setUserName(sc.nextLine());

            System.out.println("Enter password: "+"\n(At least 8 characters, 1 upper case, 1 lower case, digits, special character): ");
            es.setPassword(sc.nextLine());

            if(isValidUserName(es.getUserName()) && isValidPassword(es.getPassword()))
            {
                System.out.println("Registration successful...");
                set = true;
            }
            else
            {
                System.out.println("Registration failed"+"\nTry again.");
            }
        }
    }

    public boolean credentialsCheck(String user , String pass)
    {
        if(es.getUserName().equals(user) && es.getPassword().equals(pass))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isValidUserName(String userName)
    {
        return userName.length() >= 6 && userName.length() <= 20;
    }

    public boolean isValidPassword(String password)
    {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialChar = false;

        if(password.length() >= 8)
        {
            for(char ch : password.toCharArray())
            {
                if(Character.isUpperCase(ch))
                {
                    upperCase = true;
                }
                else if(Character.isLowerCase(ch))
                {
                    lowerCase = true;
                }
                else if(Character.isDigit(ch))
                {
                    digit = true;
                }
                else
                {
                    String specialCharacter = "!@#$%&*-";
                    if(specialCharacter.contains(String.valueOf(ch)))
                    {
                        specialChar = true;
                    }
                }
            }
        }
        return upperCase && lowerCase && digit && specialChar;
    }

    
    
    
}
