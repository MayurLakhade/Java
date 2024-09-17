package patternProblem;

public class Pattern12 {
    public static void main(String[] args) 
    {
        for (int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j < i ; j++)
            {
                System.out.print(" ");
            }

                if(i == 1 || i == 5)
                {
                    for(int s = 1 ; s <= 5 ; s++)
                    {
                        System.out.print("*");
                    }  
                }
                else
                {
                    System.out.print("*   *");
                }
            
            System.out.println();
        }
    }
    
}
