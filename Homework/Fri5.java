
class Employee{
    public void attendance()
    {
        System.out.println("Employee is attending offline.");
    }
}

class JavaDeveloper extends Employee{
    public void attendance()
    {
        System.out.println("Employee is attending online.");
    }
}

public class Fri5 {
    public static void main(String[] args) 
    {
        Employee j = new JavaDeveloper();
        j.attendance();
    }
    
}
