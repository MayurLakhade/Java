package CoreJava.classAndObjects;

public class EmployeeTest {
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.setName("mohak");
        e1.setDesignation("SDE");
        //String name = e1.getName();
        //System.out.println("Name of employee: "+name);
        System.out.println("\nPrinting all details of employee e1: ");
        System.out.println(e1);

        Employee e2 = new Employee(55, "Mayur", "team leader", 1.5);
        //String designation = e2.getDesignation();
        //System.out.println("Designation of employee: "+designation);
        System.out.println("\nPrinting all the details of the employee e2: ");
        System.out.println(e2);

    }
    
}
