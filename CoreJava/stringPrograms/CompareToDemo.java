package CoreJava.stringPrograms;

public class CompareToDemo {
    public static void main(String[] args) 
    {
        /*
         * compareTo method will subtract the ascii value of each letters one at a time.
         * As soon as it finds that the result is any value other than 0 it stops comparing
         * and returns the result of substraction.
         */
        String s1 = "Mom";
        String s2 = "Tom";

        int i = s1.compareTo(s2); // 77-84 ascii values.

        System.out.println("i = "+i);

        String t1 = "Jinny";
        String t2 = "Jonny";

        int j = t1.compareTo(t2);
        System.out.println("j = "+j);
    }
    
}
