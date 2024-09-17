package patternProblem;
public class Pattern6 
{
    public static void main(String[] args) 
    {
        for(int i = 1 ; i<=5 ; i++)
        {
            if(i%2 != 0)
            {
                for(int j = 1 ; j <= 5 ; j++)
                {
                    System.out.print("* ");
                }
            }
            else if(i%2 == 0 )
            {
                for(int x = 1 ; x <= 5 ; x++)
                {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
