package patternProblem;

public class Pattern15 {
    public static void main(String[] args) 
    {
        int s = 0;
        for(int i = 1 ; i <= 7 ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                s++;
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    
}
