package ArrayMiniProject.comMiniUi;

import java.util.Arrays;
import java.util.Scanner;

import ArrayMiniProject.comMiniDao.EmployeeDaoImpl;
import ArrayMiniProject.comMiniPojo.Employee;

public class EmployeeTest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int empId = 101;
        String empName;
        String designation;
        double salary;
        String user;
        String pass;

        Employee e = null;
        EmployeeDaoImpl eimpl = new EmployeeDaoImpl();

        System.out.println("*****Welcome to socialEmp*****");

        boolean exit = false;
        boolean flag;
       
        System.out.println("You are new user."+"\nPlease create your login credentials.");
        eimpl.credentialsCreate();
        
        boolean right = false;
        while(right == false)
        {
          System.out.println("Enter user name: ");
          user = sc.nextLine();
          System.out.println("Enter password: ");
          pass = sc.nextLine();

          if(eimpl.credentialsCheck(user, pass))
          {
            right = true;
            System.out.println("Welcome "+user+"!!!");
            while(exit == false)
            {
              System.out.println("Please Enter the number as given in option.");
              System.out.println("1--> Register employee");
              System.out.println("2--> Show all employees");
              System.out.println("3--> Search employee by id");
              System.out.println("4--> Update employee detail");
              System.out.println("5--> Delete employee profile");
              System.out.println("6--> Search employee by name");
              System.out.println("7--> Exit");
            
              int option = sc.nextInt();
              String choice;
              sc.nextLine();
            
              switch(option)
              {
                case 1:
                System.out.println("Enter your Name: ");
                empName = sc.nextLine();
              
                System.out.println("Enter your designation: ");
                designation = sc.nextLine();
              
                System.out.println("Enter your salary: ");
                salary = sc.nextDouble();
                sc.nextLine();
              
                empId+=1;
              
                e = new Employee(empId, empName, designation, salary);
              
                flag = eimpl.addEmployee(e);
                if(flag)
                {
                  System.out.println("Employee registered successfully.");
                  //System.out.println(Arrays.toString(eimpl.showAllEmployees()));
                  System.out.println(e);
                }
                else
                System.err.println("Error while adding employee.");
              
                break;
              
                case 2:
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
              
                case 3: 
                System.out.println("Enter the Id of employee to be searched: ");
                int id = sc.nextInt();
                sc.nextLine();
              
                e = eimpl.searchEmployeeById(id);
              
                if(e != null)
                {
                  System.out.println("The employee found with given Id: \n"+e);
                }
                else
                {
                  System.out.println("Sorry we could not find any employee with given id.");
                }
              
                break;
              
                case 4:
                System.out.println("Enter id of employee to be updated:");
                id = sc.nextInt();
                sc.nextLine();
              
                e = eimpl.searchEmployeeById(id);
              
                if(e != null)
                {
                  System.out.println("*****The profile*****");
                  System.out.println(e);
                
                  System.out.println("\nAre you sure you want to update this profile");
                  System.out.println("Answer in yes or no: ");
                  choice = sc.next();
                  sc.nextLine();
                
                  if(choice.equalsIgnoreCase("yes"))
                  {
                    System.out.println("Please select one option as given below: ");
                    System.out.println("1--->Update employee name");
                    System.out.println("2--->Update emplopyee designation");
                    System.out.println("3--->Update employee salary");
                    System.out.println("4--->Update all details");
                    System.out.println("5--->Update employee name and designation");
                    System.out.println("6--->Update employee designation and salary");
                    System.out.println("7--->Update employee name and salary");
                  
                    int selection = sc.nextInt();
                    sc.nextLine();
                  
                    switch(selection)
                    {
                      case 1: 
                      System.out.println("Enter your name: ");
                      e.setEmpName(sc.nextLine());
                      break;
                    
                      case 2:
                      System.out.println("Enter your designation:");
                      e.setDesignation(sc.nextLine());
                      break;
                    
                      case 3:
                      System.out.println("Enter your salary:");
                      e.setSalary(sc.nextDouble());
                      break;
                    
                      case 4:
                      System.out.println("Enter your name: ");
                      e.setEmpName(sc.nextLine());
                    
                      System.out.println("Enter your designation:");
                      e.setDesignation(sc.nextLine());
                    
                      System.out.println("Enter your salary:");
                      e.setSalary(sc.nextDouble());
                      break;
                    
                      case 5:
                      System.out.println("Enter your name: ");
                      e.setEmpName(sc.nextLine());
                    
                      System.out.println("Enter your designation:");
                      e.setDesignation(sc.nextLine());
                      break;
                    
                      case 6:
                      System.out.println("Enter your designation:");
                      e.setDesignation(sc.nextLine());
                    
                      System.out.println("Enter your salary:");
                      e.setSalary(sc.nextDouble());
                      break;
                    
                      case 7:
                      System.out.println("Enter your name: ");
                      e.setEmpName(sc.nextLine());
                    
                      System.out.println("Enter your salary:");
                      e.setSalary(sc.nextDouble());
                      break;
                    }
                  
                    flag = eimpl.updateEmployees(e);
                    if(flag)
                    {
                      System.out.println("Enployee updated successfully.");
                    }
                    else
                    {
                      System.out.println("Error while updating employee profile.");
                    }
                  }
                  else
                  {
                    System.out.println("No problem. PLease continue browsing.");
                  }

                }
                else
                {
                  System.out.println("No employee of this id found.");
                }
              
                break;
              
                case 5:
                System.out.println("Enter the Id of employee to be deleted: ");
                id = sc.nextInt();
                sc.nextLine();
              
                e = eimpl.searchEmployeeById(id);
                if(e != null)
                {
                  System.out.println("*****The profile*****");
                  System.out.println(e);
                
                
                  System.out.println("Are you sure you want to delete your profile."+"\nAnswer in yes or no.");
                  choice = sc.nextLine();
                
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
              
                case 6: 
                System.out.println("Enter the name of employee to be searched: ");
                String name = sc.nextLine();
                e = eimpl.searchEmployeeByName(name);
              
                if(e != null)
                {
                  System.out.println("The employee found with given name: \n"+e);
                }
                else
                {
                  System.out.println("Sorry we could not find any employee with given name.");
                }
              
                break;
              
                case 7:
                System.out.println("Are you sure you want to exit.");
                System.out.println("Answer in yes or no.");
                choice = sc.nextLine();
                if(choice.equalsIgnoreCase("Yes"))
                {
                  exit = true;
                  System.out.println("Thank you visit again!!!");
                }
                else
                {
                  System.out.println("No problem please continue browsing.");
                }
              
                break;
              }
            
            }
          }  
          else
          {
            System.out.println("Wrong user name and password combination"+"\nTry again.");
          }
        }  
        sc.close();
    }
    
}
