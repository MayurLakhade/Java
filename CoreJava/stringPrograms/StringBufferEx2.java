package CoreJava.stringPrograms;

public class StringBufferEx2 {
    public static void main(String[] args) 
    {
        String s = "Anudip";
        StringBuffer sb = new StringBuffer(s);

        sb.reverse();
        System.out.println("Reversed String: "+sb);

        /*String rev = "";

        for(int i = s.length()-1 ; i >=0 ; i-- )
        {
            rev += s.charAt(i);
        }
        System.out.println(rev);

        
        System.out.println(sb.reverse()); */

        StringBuffer sb2 = new StringBuffer("Indian Cricket Team");
        System.out.println("Before: "+sb2);
        /*
         * In the StringBuffer/StringBuilder class the replace method is used to replace the
         * character from start index upto the end index are replaced by new String.
         */
        sb2.replace(7, 14, "Hockey");
        System.out.println("After: "+sb2);

        sb2.delete(0, 6);
        System.out.println("After deleting: "+sb2);

    
    }
    
}
