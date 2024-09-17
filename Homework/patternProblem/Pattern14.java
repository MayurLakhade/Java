package patternProblem;

public class Pattern14 {
    public static void main(String[] args) 
    {
        for(int i = 1 ; i <= 9 ; i++)
        {
            for(int j = 1 ; j<=9 ; j++)
            {
                if(j == 5)
                {
                    for(int s = 0 ; s <= 9 ; s++)
                    {
                        System.out.print(j+" ");
                    }
                }
            
            }
            System.out.println();
        }
    }
    
}
