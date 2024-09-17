package CoreJava.multithreadingExamples;
/*
 * It is much better implement runnable interface rather than extending Thread class for making threads (multitreading).
 */
class MyThread1 implements Runnable{

    @Override
    public void run() 
    {
        for(int i = 0 ; i <= 10 ; i++)
        {
            System.out.println("Boy is walking...");
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

class MyThread2 implements Runnable{

    @Override
    public void run() 
    {
        for(int i = 0 ; i <= 10 ; i++)
        {
            System.out.println("Birds are flying..");
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

public class RunnableDemo {
    public static void main(String[] args) 
    {
        /*
         * When we implement runnable interface then we will inherit only the run method.
         * Since start method is a thread class method our class will not inherit this method.
         * So we make thread class object and pass our class reference in its constructor.
         * Hence the start method of Thread class will call the run method of our class.
         * 
         * While making threads it is said that implementing runnable interface is much better
         * than extending thread class.
         * Reasons:-
         * 1) We do not make our class unnecessarily bulky when we implement runnable interface.
         * 2) Since multiple inheritance is not allowed in java in case we extend thread class
         *    then we will not be able to extend any other class. Hence implementing Runnable would be better.
         */
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
    
}
