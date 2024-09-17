//static variable calling in another class.
class Sta{
  static int f = 9;
}
public class Task3 {
    public static void main(String[] args) 
    {
      System.out.println("Static variable is: "+Task2.b);  
      System.out.println("Static variable: "+Sta.f);
    }
    
}
