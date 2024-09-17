package CoreJava.inheritance;

class Employee
{
    int empId;
    String company;

    public void markAttendance()
    {
        System.out.println("Your attendance has been marked.");
    }
}

class Programmer extends Employee
{
    String category;
    public void coding()
    {
        System.out.println("The programmer is coding at "+category+" Programmer");
    }
}

class JavaDeveloper extends Programmer
{
    String designation;
    String project;
    public void usingHibernate()
    {
        System.out.println("Java developer is using hibernate to create appliacation...");
    }
    public String toString()
    {
        return "Designation: "+designation+"\nProject: "+project+"\nCategory: "+category+"\nEmpId: "+empId+"\nCompany: "+company;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) 
    {
        JavaDeveloper j = new JavaDeveloper();
        j.empId = 5;
        j.company = "Accenture";
        j.category = "Junior";
        j.designation = "Intern";
        j.project = "Web Development";

        j.markAttendance();
        j.coding();
        j.usingHibernate();

        System.out.println("Printing details: ");
        System.out.println(j);
    }
    
}
