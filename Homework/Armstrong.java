import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NUmber: ");
        int a = sc.nextInt();
        int p = a;
        int s = 0;
        int b = 0;


        for (int i = a ; i>0 ; i/=10)
        {
            b++;
          
        }
        
        while (a > 0 )
        {
            int r = a % 10; 
            int n = 1 ;

            for(int j = b ; j>0 ; j--)
            {
                n *= r; 
            }

            s += n;
            a/=10;
        
        }
        
        if(s == p)
        {
            System.out.println("This number is armstrong number.");
        }
        else
        {
            System.out.println("This number is not armstrong number.");
        }
            
            
    }
    
}

/*public class Armstrong2 {
    static int a;
    static int p;
    static int s = 0;
    static int b = 0;

    public boolean result(int a)
    {
        for (int i = a ; i>0 ; i/=10)
        {
            b++;
        }
        
        while(a > 0 )
        {
            int r = a % 10; 
            int n = 1 ;

            for(int j = b ; j>0 ; j--)
            {
                n *= r; 
            }

            s += n;
            a/=10;
        
        }
        return s == p;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Armstrong2 as = new Armstrong2();
        System.out.println("Enter NUmber: ");
        a = sc.nextInt();
        p = a;
        
        if(as.result(a))
        {
            System.out.println("This number is armstrong number.");
        }
        else
        {
            System.out.println("This number is not armstrong number.");
        }
            
    }
    
}*/
