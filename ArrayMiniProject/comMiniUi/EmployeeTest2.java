package ArrayMiniProject.comMiniUi;

import java.util.Arrays;
import java.util.Scanner;

import ArrayMiniProject.comMiniDao.EmployeeDaoImpl;
import ArrayMiniProject.comMiniDao.LoginDaoImpl;
import ArrayMiniProject.comMiniPojo.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int empId = 101, id;
        String empName;
        String designation;
        double salary;
        String user;
        String pass;

        Employee e = null;
        EmployeeDaoImpl eimpl = new EmployeeDaoImpl();
        Employee empList = null;
        LoginDaoImpl limpl = new LoginDaoImpl();

        boolean exit = false, logout = true , flag;

        while(logout)
        {
            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to register");
            int i = sc.nextInt();
            sc.nextLine();

            if(i == 1)
            {
                System.out.println("Enter user name: ");
                String userName = sc.nextLine();

                System.out.println("Enter password: ");
                String password = sc.nextLine();

                if(limpl.adminLogin(userName, password))
                {
                    System.out.println("You have logged in as admin.");
                    while(exit == false)
                    {
                        System.out.println("1--->Show all employees");
                        System.out.println("2--->Delete an employee profile");
                        System.out.println("3--->Logout");

                        int option = sc.nextInt();
                        sc.nextLine();

                        switch(option)
                        {
                            case 1:
                            int count = 0;
                            for(Employee e1 : eimpl.showAllEmployees())
                            {
                              if(e1 != null)
                              {
                                count++;
                                break;
                              }
                            }
                            if(count != 0)
                            {
                              System.out.println(Arrays.toString(eimpl.showAllEmployees()));
                            }
                            else
                            {
                              System.out.println("No employee registered yet!!!");
                            }
              
                            break;

                            case 2:
                            System.out.println("Enter the Id of employee to be deleted: ");
                            id = sc.nextInt();
                            sc.nextLine();

                            e = eimpl.searchEmployeeById(id);
                            if(e != null)
                            {
                              System.out.println("*****The profile*****");
                              System.out.println(e);
                            
                            
                              System.out.println("Are you sure you want to delete your profile."+"\nAnswer in yes or no.");
                              String choice = sc.nextLine();
                            
                              if(choice.equalsIgnoreCase("yes"))
                              {
                                flag = eimpl.deleteEmployee(id);
                                if(flag)
                                {
                                  System.out.println("Employee deleted successfully.");
                                }
                                else
                                {
                                  System.out.println("Error while deleting employee.");
                                }
                              }
                              else
                              {
                                System.out.println("No problem continue browsing.");
                              }
                            }
                            else
                            {
                              System.out.println("No employee of this id found.");
                            }
                            break;

                            case 3:
                            exit = true;
                            System.out.println("You have logged out successfully!!!");

                            break;
                        }
                    }
                }
                else if(limpl.employeeLogin(userName, password))
                {

                }
                else
                System.out.println("Credentials do not match, Please try again.");
            }
            else if(i == 2)
            {

            }
            else
            System.out.println("Please enter 1 or 2 only.");
        }
    }
    
}
