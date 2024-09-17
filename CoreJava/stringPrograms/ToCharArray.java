package CoreJava.stringPrograms;

public class ToCharArray {
    public static void main(String[] args) 
    {
        String s = "India";

        char[] arr = s.toCharArray();

        for(char i : arr)
        {
            System.out.println(i);
        }
    }
    
}
