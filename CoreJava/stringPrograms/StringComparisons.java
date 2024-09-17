package CoreJava.stringPrograms;

public class StringComparisons {
    public static void main(String[] args) 
    {
        String s1 = "Mohak";
        String s2 = "Mohak";
        String s3 = "Mohak Samarth";

        System.out.println("s1 Equals s2? : "+s1.equals(s2));
        System.out.println("s1 equals s2? : "+s1.equals(s3));

        int i = s1.compareTo(s2);
        int j = s1.compareTo(s3);

        System.out.println("i = "+i);
        System.out.println("j = "+j);

        if(i == 0)
        {
            System.out.println("s1 is exactly same as s2.");
        }
        else
        {
            System.out.println("s1 and s2 are different.");
        }

        if(j == 0)
        {
            System.out.println("s1 and s3 are same.");
        }
        else
        {
            System.out.println("s1 and s3 are different.");
        }
    }
    
}
