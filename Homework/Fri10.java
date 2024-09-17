public class Fri10 {
    int a;
    public void setA(int a) // here paremeter int a is local variable. its scope is limited to this setter only.
    {
        /*
         * Below we are storing the value of local variable into instance variable.
         */
        this.a = a; // This is how we store value in instance variable. 
        /*
         * Here this keyword represents the current class instance variable.
         */
    }
    public int getA()
    {
        return a;
    }
    public static void main(String[] args) 
    {
        Fri10 s = new Fri10();
        s.setA(5);//here we are passing int value to setter parameter.
        System.out.println(s.getA());
    }
    
}
