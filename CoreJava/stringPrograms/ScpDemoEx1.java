package CoreJava.stringPrograms;

public class ScpDemoEx1 {
    public static void main(String[] args) 
    {
        /*
         * s and t created using literals. Hence both reference variable will point to the same
         * object of java in SCP memory.
         * For Strings if we use == operator then jvm checks if two strings are located at same
         * memory or not.
         * Hence when we do s == t we get true.
         * 
         * Whereas when we use new keyword then always a new object is created in heap memory.
         * Therefore a and b will point towards two different objects in heap memory.
         * Hence a == b will give false.
         */
        String s = "Java";
        String t = "Java";
        String x = new String("Java");

        String a = new String("Coding");
        String b = new String("Coding");

        System.out.println("Are s and t pointing to same object: "+(s==t));
        System.out.println("Are a nad b pointing to same object: "+(a==b));

        System.out.println(t == x);
        System.out.println(t.equals(x));
        System.out.println(t.compareTo(x)); // returns 0 if t == x ( if true)
    }
    
}
