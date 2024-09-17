package CoreJava.multithreadingExamples;

class Table extends Thread{

    int num;

    public Table(int num)
    {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(num+" X "+i+"= "+(num*i));

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

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException
    {
        Table t2 = new Table(2);
        Table t3 = new Table(3);
        Table t4 = new Table(4);

       
        t3.start();
        t3.join();

        t2.start();

        t4.start();
    }
    
}
