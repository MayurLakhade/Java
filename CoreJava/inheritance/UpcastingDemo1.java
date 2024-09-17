package CoreJava.inheritance;

/*
 * Upcasting is done to make a child class object behave like a parent.
 * We do it by making a child class object and referring it with parent type variable.
 * By doing this now we will be able to call only those methods which the child has 
 * inherited from parent.
 * Any method that the child has of its own, will not be called.
 */
class LivingThings{
    public void movements()
    {
        System.out.println("This being is moving.");
    }

    public void growing()
    {
        System.out.println("This being is growing.");
    }

    public void excreting()
    {
        System.out.println("This being is excreting.");
    }
}

class Bird extends LivingThings{
    public void layingeggs()
    {
        System.out.println("The bird is laying eggs.");
    }

    public void movements()
    {
        System.out.println("This bird moves by flying.");
    }

    public void buildingNest()
    {
        System.out.println("This builds nest for living.");
    }

    public void hunting()
    {
        System.out.println("Bird is hunting.");
    }
}
public class UpcastingDemo1 {
    public static void main(String[] args) 
    {
        // b is the referance variable which is pointing to the memory location.
        // where the object of birds class is made.
        Bird b = new Bird();
        b.movements();
        b.layingeggs();

        LivingThings l = new LivingThings();
        l.movements();

        /*
         * Below we are seeing upcasting. Here we are making the object of child 
         * class and referring it with a variable of the parent type.
         */
        LivingThings ls = new Bird();
        ls.movements();
        ls.excreting();
        ls.growing();

    }
    
}
