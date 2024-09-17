class Operation implements Runnable{
    int n;

    public Operation(int n)
    {
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= n ; i ++)
        {
            for(int j = 1 ; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}

public class JoinDemoProg {
    public static void main(String[] args) throws InterruptedException 
    {
        Operation o1 = new Operation(5);
        Operation o2 = new Operation(6);
        Operation o3 = new Operation(7);

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

    }
    
}
