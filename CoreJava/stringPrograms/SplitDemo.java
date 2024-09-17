package CoreJava.stringPrograms;

public class SplitDemo {
    public static void main(String[] args) 
    {
        String team = "Indian Hockey Team";

        String [] s = team.split("o");

     /*  for(int i = 0 ; i < s.length ; i++)
        {
            System.out.println(s[i]);
        } */

        for(String i : s)
        {
            System.out.println(i+" ");
        }

        System.out.println("Original team: "+team);


    }
    
}
