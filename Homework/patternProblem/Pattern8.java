package patternProblem;

public class Pattern8 {
    public void ds()
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= 5 ; j++)
            {
                if(i%2 != 0)
                {
                    if(j % 2 != 0)
                    {
                        System.out.print("1");
                    }
                    else if(j % 2 == 0)
                    {
                        System.out.print("0");
                    }
                }
                else if(i%2 == 0)
                {
                    if(j % 2 == 0)
                    {
                        System.out.print("1");
                    }
                    else if(j % 2 != 0)
                    {
                        System.out.print("0");
                    }

                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            if(i%2 != 0)
            {
               System.out.println("10101");
            }
            else if(i%2 == 0)
            {
                System.out.println("01010");
            }
        }

        Pattern8 p = new Pattern8();
        System.out.println();
        p.ds();
            
        
    }
    
}
