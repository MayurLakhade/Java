package CoreJava.classAndObjects;
/*
 * POJO:- Plain old java object.
 * 
 * It is a compilable class and contains only private variable, constructors, getter setters and toString.
 * Pojo class object is also known as java Bean.
 * 
 * ---> "this" keyword represents the current class object. Meaning we are representing the object of the class
 *      in which we are writing "this" keyword.
 * 
 * Since variables are private we will not be able to access them directly from other class.
 * We can set values in the variables by using:-
 * 1) Parameterized constructors:-
 *  we used "this" keyword to declare the instance variables, and then we stored the data of local variable 
 *  into instance variable.
 * 
 * 2) Setters:-
 *   Setters are public methods specifically used to set values to private variables.
 * 
 * Syntax of Setter:-
 * public void setVariable(Datatype variable){
 * this.variable = variable;
 * }
 * 
 * public void setEmail(String email){
 * this.email = email;
 * }
 * If we do not have all the details to be stored in the object. 
 * Then we can call setters of only those variables whose data we have.
 * 
 * The values of the private variables can be fetched in other class by using
 * getters and toString.
 * 1) Getters
 *  this are public methods specifically used to get the value that was stored in 
 *  instance variable.
 * 
 * Syntax of Getter:-
 * public variableDatatype getVariable(){
 * return variable;
 * }
 *
 * public String getName(){
 * return name;
 * }
 * 
 * public int getVariable(){
 * return variable;
 * }
 * 
 * Class:- they are of two types.
 * 1) Predefined class ; 2) Userdefined class:- this are of two types
 *                                              1) Compilable Class ; 2) Executable class
 * 
 */


class Customer{ //this is pojo class.
    private String email;
    private long mobile;
    private boolean fresher;
    private String dob;
    private String name;
    private String education;
    private int noticePeriod;

    public Customer()
    {
        System.out.println("no data is available.");
    }

     public Customer(String name, String email, long mobile, boolean fresher, String dob, String education, int noticePeriod )
    {
    
        /*
         * Below we are giving same variable identifier/name to the instance variable
         * and local variables.
         * so jvm could get confused between the two, hence we declare the instance variable names
         * by using this keyword.
         * Now jvm will understand that the data in local variable is to be stored inside the instance variable.
         */
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.fresher = fresher;
        this.dob = dob;
        this.education = education;
        this.noticePeriod = noticePeriod;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public long getMobile()
    {
        return mobile;
    }
    public void setMobile(long mobile)
    {
        this.mobile = mobile;
    }

    public boolean getFresher()
    {
        return fresher;
    }
    public void setFresher(boolean fresher)
    {
        this.fresher = fresher;
    }

    public String getDob()
    {
        return dob;
    }
    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public String getEducation()
    {
        return education;
    }
    public void setEducation(String education)
    {
        this.education = education;
    }

    public int getNoticeperiod()
    {
        return noticePeriod;
    }
    public void setNoticeperiod(int noticePeriod)
    {
        this.noticePeriod = noticePeriod;
    }


    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Mobile: "+mobile);
        System.out.println("Fresher: "+fresher);
        System.out.println("dob: "+dob);
        System.out.println("Education: "+education);
        System.out.println("Notice Period: "+noticePeriod);
    }
    
 }
public class PojoClassDemo {
    public static void main(String[] args) 
    {
        /*CompilableClassDemo cm = new CompilableClassDemo();
        cm.display();
        System.out.println("i : "+cm.i);
        System.out.println("s ="+cm.s);*/

        Customer cs = new Customer("Mayur", "lakhademayur@gmail.com", 8180849272L, true, "29 May 2001", "B.E", 3);
        System.out.println("Printing details of Mayur...");
        //cs.display();
        String n = cs.getName();
        String e = cs.getEmail();
        long mo = cs.getMobile();
        boolean f = cs.getFresher();
        String d = cs.getDob();
        String edu = cs.getEducation();
        int np = cs.getNoticeperiod();

        System.out.println("Name: "+n);

        System.out.println("\nPrinting the details in c object...");
        Customer c = new Customer();
        c.setName("Mohak");
        //String name = c.getName();
        //System.out.println(name);
        //c.display();


    }
    
}
