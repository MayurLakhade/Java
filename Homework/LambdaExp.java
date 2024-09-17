public class LambdaExp {
    public static void main(String[] args) 
    {
        Runnable s1 = ()->{
            for(int i = 0 ; i <= 5 ; i++)
            {
                for(int j = 5 ; j >= i ; j--)
                {
                    System.out.print("*");
                    
                }
                System.out.println();
                try 
                {
                    Thread.sleep(500);
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }

        };

        Thread th1 = new Thread(s1);
        th1.start();
    }
    
}
