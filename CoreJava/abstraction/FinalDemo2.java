package CoreJava.abstraction;

class Demo2{

    final public void show()
    {
        System.out.println("This is dshow method.");
    }
}

class SubDemo2 extends Demo2{

   /*  We are not able to override this method because show method is
      final and this child class has to use it as it has been inherited.
      Meaning final method behavior cannot be changed by method overriding.
   
   public void show()
    {
        for(int i = 1 ; i<=10 ; i++)
        {
            System.out.println(i);
        }
    }*/
}
public class FinalDemo2 {
    public static void main(String[] args) 
    {
        
    }
    
}
