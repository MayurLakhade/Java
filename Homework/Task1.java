import java.util.Scanner;
//Area of circle.
public class Task1 {

    public double area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius: ");
        int r = sc.nextInt();
        double circlearea = 3.14*r*r;
        return circlearea;
    }
    public static void main(String[] args) 
    {
       Task1 ts = new Task1();
       double ans = ts.area();
       System.out.println("Area of circle is: "+ans);
    }
    
}
