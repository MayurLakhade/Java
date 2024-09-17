package CoreJava.inheritance.polymorphism;

/*
 * Method overriding is the process of changing the behavior of the inherited method
 * in the child object.
 * Method overriding is a type of polymorphism.
 * 
 * Polymorphism is same name different behavior. poly meaning many, morph meaning form.
 * Types of polymorphism:-
 * 1) method overriding.
 * 2) method overloading
 * 
 * Steps for method overriding:-
 * 1) make exact same method in the child class as it was in parent class.
 * 2) Do not change the method name and the method parameter.
 * 3) Access specifier can be changed but you cannot reduce the visibility 
 * in the child class. 
 * 4) Private methods are never inherited by child class, hence we cannot override private method.
 * We can make same method in child also but it will be considered as new method belonging to child class.
 * This method will not be connected to the parent class method.
 * 
 */

class Parent{
    public void sendResume()
    {
        System.out.println("Sending resume by post.");
    }

    protected void dis() //
    {
        System.out.println("Hello everyone...");
    }

    private void show()
    {
        System.out.println("show method of parent class.");
    }
}

class Child extends Parent{
    public void sendResume()
    {
        System.out.println("Sending resume by Email.");
    }
    /*
     * in dis we are overriding the inherited dis method.
     * here we have changed the access specifier from protected to public.
     * this is allowed since we are increasing the visibility of dis method. 
     */

    public void dis()
    {
        System.out.println("Welcome everyone...");
    }

    /*
     * Below given show method will be considered as completely new method.
     * it will not get inherited by parent class, thus has no relation to it.
     */
    private void show()
    {
        System.out.println("this is show method of child class.");
    }

    /*public void sendResume(String a)
    {
        System.out.println("Sending resume by Email.");
    }*/
}
public class MethodOverriding {
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.sendResume();
    }
    
}
