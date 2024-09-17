package CoreJava.stringPrograms;
/*
 * If we want to create mutable object of character sequence then we should use
 * StringBuffer or StringBuilder.
 * 
 * These are also classes that create mutable objects.
 * 
 * Concatination :- It is the process of adding words or characters to an existing String
 * 
 * StirngBuffer and StringBuilder classes are both used to create mutable String objects.
 * The only difference between the two is that StringBuffer is tread safe, whereas StringBuilder 
 * is not thread safe.
 */
public class StringBufferEx1 {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Anudip");
        String s = "Anudip";

        System.out.println("Before: ");
        System.out.println("s = "+s+"\nsb = "+sb);

        s.concat("Foundation");
        sb.append("Foundation");

        System.out.println("\nAfter: ");
        System.out.println("s = "+s+"\nsb = "+sb);
    }
    
}
