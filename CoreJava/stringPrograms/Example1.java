package CoreJava.stringPrograms;

public class Example1 {
    public static void main(String[] args) 
    {
        String a = "Anudip"; // Using String literals.
        /*
         * Making String objects with new keyword.
         * We have called the empty constructor to make this object.
         */
        String s1 = new String(); 

        System.out.println("s= "+a);
        System.out.println("s1="+s1);

        /*
         * Below we are calling the parameterised constructor, passing String value.
         */
        String s2 = new String("Java");
        System.out.println("s2= "+s2);
        /*
         * Again calling parameterised constructor which accepts String type data.
         */

        String s3 = new String(a);
        System.out.println("s3= "+s3);

        char symbols[] = {'*', '&', '%', '$'};
        /*
         * Below we are making the object of String class by calling the constructor
         * which accepts a String character type array.
         * When we print s4 we can see that all the characters of the array
         * has been added as one single String in s4.
         */
        String s4 = new String(symbols);

        System.out.println("s4= "+s4);
        
    }
    
}
