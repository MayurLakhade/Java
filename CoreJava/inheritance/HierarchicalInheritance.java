package CoreJava.inheritance;

/*
 * Hierarchical inheritance is another type of inheritance where one class has many child class.
 * As seen below honda class has two child class Activa and City.
 * 
 * Both the child classes will inherit the logo from honda, but there is no relation between 
 * Activa and City.
 */

class Honda{
    String logo = "Honda";
}

class Activa extends Honda{
    public void kickStart()
    {
        System.out.println("Starting activa");
    }
}

class City extends Honda
{
    public void reverse()
    {
        System.out.println("car is reversing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) 
    {
        City c = new City();
        System.out.println("Logo of city: "+c.logo);

        Activa a = new Activa();
        a.kickStart();
        System.out.println("logo of Activa: "+a.logo);
    }
    
}
