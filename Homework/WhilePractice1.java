//Program to find the total of the first 10 whole numbers.


public class WhilePractice1 {
    public static void main(String[] args) 
    {
        /*int a = 10;
        int count = 0;
        while(a>0)
        {
            count+= a;
            a--;
        }
        System.out.println("Total is: "+count);*/

        //Fibonacci series starting with 1 and 2.

        int a = 1;
        int b = 2;
        int c = 10;
        int x = 0;
        System.out.print(a+" "+b);
        while(c>2)
        {
            x = a+b;
            a = b;
            b = x;
            System.out.print(" "+x); 
            c--;
        }

    }
    
}
