// Changing of AccessSpecifiers in overriden methods.

class Senpai{
    protected void dis()
    {
        System.out.println("Lower classmen...");
    }

    void show()
    {
        System.out.println("Highschool...");
    }

    private void sen()
    {
        System.out.println("middleSchool...");
    }
}

public class OverridenMethod extends Senpai{
/*
 * Here we have changed the accessSpecifier of overriden method from protected to public.
 * Meaning here we have increased the visibility of dis() method.
 * We can change the accessSpecifier of overriden method provided that we are increasing the method 
 * visibility instead of decreasing. 
 * 
 * We cannot override private methods. Because we can only access this method in same class only.
 */
    public void dis()
    {
        System.out.println("Upper classmen...");
    }

    public void show()
    {
        System.out.println("College...");
    }


    
    public static void main(String[] args) 
    {
        OverridenMethod o = new OverridenMethod();
        o.dis();
        o.show();
        //o.sen();  :- Here we are unable to access sen() method with OverridenMethod class object.
        //             Because this method has private accessSpecifier.
    }
}
