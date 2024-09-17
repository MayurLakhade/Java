package CoreJava.abstraction.interfaces;

interface JavaSession{
    public void dis();
}

abstract class PythonSession{
    abstract public void show();
}

class Anudip implements JavaSession{
    public void dis()
    {

    }
}

class Unique extends PythonSession{
    public void show()
    {

    }
}
public class UpcastingDemo {
    public static void main(String[] args)
    {
        JavaSession js = new Anudip();// upcasting where parent interface javasession
                                      // type variable refers to child anudip object.
        
        PythonSession py = new Unique();//parent class Pythonsession type variable refers
                                        //to child object of unique.
    }
    
}
