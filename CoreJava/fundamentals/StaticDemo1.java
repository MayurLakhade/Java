package CoreJava.fundamentals;
/*
 * Static members belong to the class and not object.
 * Static members have same copy for all objects. Whereas instance variables have separate 
 * copy in separate objects.
 * Any changes made in the value of static member will be seen by all objects.
 * But if we change the value of instance variable in one object then it will be changed for that object only.
 * It will not affect the value of instance variable in other objects.
 */

 class Student{

    static String college = "kdk";
    String s1 = "Mohak";
    String s2 = "Chintan";

    static public void show()
    {
        System.out.println("This is Static method.");
    }

 }

public class StaticDemo1 {
    public static void main(String[] args) 
    {
        System.out.println("College Name: "+Student.college);
        
        Student st = new Student();
        Student t = new Student();

        System.out.println("\n************Before**********");
        System.out.println("Values in the object st: ");
        System.out.println("College Name: "+Student.college);
        System.out.println("Student1 = "+st.s1);
        System.out.println("Student2 = "+st.s2);

        System.out.println("Values in the object t: ");
        System.out.println("College Name: "+Student.college);
        System.out.println("Student1 = "+t.s1);
        System.out.println("Student2 = "+t.s2);

        //Student.college = "YCC";
        t.s1 = "Sarveshwar";
        t.s2 = "kalyani";

        System.out.println("\n*********After changing name in student object t**************");
        System.out.println("Values in the object st: ");
        System.out.println("College Name: "+Student.college);
        System.out.println("Student1 = "+st.s1);
        System.out.println("Student2 = "+st.s2);

        System.out.println("Values in the object t: ");
        System.out.println("College Name: "+Student.college);
        System.out.println("Student1 = "+t.s1);
        System.out.println("Student2 = "+t.s2);

        System.out.println();
        Student.show();

    }

       

    
    
}
