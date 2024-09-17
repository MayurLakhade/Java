package CoreJava.fundamentals;

public class InstanceVariables {  
         /*
         * Instance variables are created directly in class. It is not inside any local scope.
         * Instance variables can be accessed in all methods.
         * 1) If we want to access instance variables in main method or any other static method
         * then always first create the object and then access instance variables from object.
         * 
         * 2) If we want to access instance variables from any other non-static method
         * then we can access it directly without making object.
         * 
         * 3) Instance variables are given default values by the constructor.
         */
        int num = 10;
        String institute = "Anudip";
        String course = "Java";
    public static void main(String[]args)
    {
      InstanceVariables iv = new InstanceVariables();
      System.out.println("Number: "+iv.num);
      System.out.println("Institute: "+iv.institute);
      System.out.println("Coure: "+iv.course);
      iv.display();
    }
    
    public void display()
    {
        System.out.println("Number: "+num);
        System.out.println("Institute: "+institute);
        System.out.println("Course: "+course);
    }
}
