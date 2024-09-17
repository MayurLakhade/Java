package patternProblem;

class Pyr{
    int s = 1;

    public void pyramid()
    {

        for(int i = 1 ; i <= 5 ; i++)
        {
            
            for(int j = 1 ; j <= 5-i ; j++)
            {
                System.out.print(" ");
            }

            if(i == 1)
            {
                System.out.print("*");
                System.out.println();
            }
            else
            {

            for(int k = 1 ; k <= i+s ; k++)
            {
                System.out.print("*");
            }
            s++;
            System.out.println();
            }   
        }

    }

}
public class Pattern13 {
    public static void main(String[] args) 
    {
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= 5-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i)-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        Pyr r = new Pyr();
        r.pyramid();
    }
    
}
