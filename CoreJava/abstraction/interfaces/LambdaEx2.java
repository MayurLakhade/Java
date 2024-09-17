package CoreJava.abstraction.interfaces;

interface SchoolTemplate1{
    public void attendance(String className , Integer studentCount);
}

interface Ts{
    public void ab();
}
class Py implements Ts{
public void ab()
{
    System.out.println("ok");
}
}
public class LambdaEx2 {
    public static void main(String[] args) 
    {
        /*
         * Below seen lambda expression is written in a different way.
         * While declaring parameters in lambda expression we do not have to give datatypes
         * of the variables. It is automatically understood which variable is of what type
         * corresponding to the method in the interface.
         * 
         */
        SchoolTemplate1 st = (c , s)->{
            System.out.println("The class namer is: "+c);
            System.out.println("No. of students: "+s);
        };

        st.attendance("VA", 25);

        
    }
    
}
