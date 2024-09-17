package CoreJava.inheritance;

class Parent2{
    public void display()
    {
        System.out.println("this is display method of Parent2");
    }

    public void show()
    {
        System.out.println("This is show method of parent2.");
    }

}

class Child2 extends Parent2{
    public void drawing()
    {
        System.out.println("this is drwwing method of Child2.");
    }

    public void display()
    {
        System.out.println("Hello Fellows...");
    }
}
public class DowncastingDemo1 {
    public static void main(String[] args) 
    {
        /*
         * Below we are seeing downcasting, where the object of parent class is reffered by 
         * a child type variable.
         * Here we are trying to make parent behave like a child.
         * this is not allowed in java.
         */
        //Child2 c = new Parent2();
    }
    
}
