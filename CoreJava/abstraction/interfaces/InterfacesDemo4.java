package CoreJava.abstraction.interfaces;

interface Camera{
    public void clickpic();

}

interface PhoneCalls{
    public void calling();
    
}

class Landline implements PhoneCalls{
    public void calling()
    {
        System.out.println("only phone calls.");
    }

}

class Game{
    public void increasePoints()
    {
        System.out.println("points increased on three match...");
    }

    public void backgroundMusic()
    {
        System.out.println("Background music is playing...");
    }

    public void graphics()
    {
        System.out.println("Graphics are changing constantly...");
    }
}
/*
 * Below we have implemented two different interface with the class Mobile.
 * Meaning we have made two interfaces as the parents of Mobile class.
 * Hence multiple inheritance in java is allowed with interfaces.
 * But we cannot do multiple inheritance with classes. Meaning we cannot make more than one class 
 * as our parent.
 * 
 * We are also seeing that we can extend one class and implement many interfaces at the same time.
 * Remember we should always extend first and implement later. 
 */
class Mobile extends Game implements Camera, PhoneCalls{

    public void clickpic()
    {
        System.out.println("Can click pics.");
    }

    public void calling()
    {
        System.out.println("Can call also.");
    }
}

public class InterfacesDemo4 {
    public static void main(String[] args) 
    {
        Mobile m = new Mobile();
        m.clickpic();
        m.calling();
    }
    
}
