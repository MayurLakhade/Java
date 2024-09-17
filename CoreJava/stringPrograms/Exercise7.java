package CoreJava.stringPrograms;
/*
 * Write a program to print all the indexed at which l occurs.
 */
public class Exercise7 {
    public static void main(String[] args) 
    {
        String s = "lallantop";
        System.out.println("All the indexes where l has occured: ");

        for(int i = 0 ; i<s.length() ; i++)
        {
            if(s.charAt(i) == 'l')
            {
                System.out.print(i+" ");
            }

        }
    }
    
}
