

class Subjects{
    String s = "new sub";

    public void hindi()
    {
        System.out.println("The subject name is hindi.");
    }

    public Subjects()
    {
        System.out.println("This is non parameterised constructor of Subject");
    }

    public Subjects(String sub)
    {
        System.out.println("You have selected: "+sub);
    }
}

class Student extends Subjects{

    public void marathi()
    {
        System.out.println(super.s);
        super.hindi();
    }

    public Student()
    {
    
    }

    public Student(String sub)
    {
        super(sub);
    }
}

public class Fri8 {
    
    public static void main(String[] args) 
    {
        Student s = new Student("English");
        s.marathi();
        Student sa = new Student();
    }
    
}
