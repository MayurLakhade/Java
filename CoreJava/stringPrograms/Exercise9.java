package CoreJava.stringPrograms;

public class Exercise9 {
    public static void main(String[] args) 
    {
        /*
         * Write a program to remove all the duplicate letter of this words happy birthday.
         */
         int count = 1;
         String s = "happy birthday";
         //char[] a = s.toCharArray();
         StringBuffer b = new StringBuffer();

         for(int i = 0 ; i < s.length() ; i++)
         {
            count = 1;
                for(int j = i+1 ; j < s.length() ; j++)
                {
                    if(s.charAt(j) == s.charAt(i))
                    {
                        count++;
                    }
                }
            if(count == 1)
            {
                b.append(s.charAt(i));
            }
         }


         System.out.println(b);
    }
    
}
