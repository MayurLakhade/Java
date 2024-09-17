import java.util.Scanner;

public class AreaTriangle {
  /* public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base is: ");
        int b = sc.nextInt();
        System.out.println("Height is: ");
        int h = sc.nextInt();

        double area = 0.5*b*h;

        System.out.println("Area of triangle: "+area);

    }*/

   /* public double area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth: ");
        double b = sc.nextDouble();

        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        double a = 0.5*b*h;
        return a;
    }
    
    public static void main(String[] args)
    {
        AreaTriangle as = new AreaTriangle();
        double area = as.area();
        System.out.println("Area of triangle: "+area);
    }*/

    public double area(double b, double h)
    {
        double a = 0.5*b*h;
        return a;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter breadth: ");
        double b = sc.nextDouble();

        System.out.println("enter height: ");
        double h = sc.nextDouble();

        AreaTriangle as = new AreaTriangle();
        double area = as.area(b, h);
        System.out.println("Ara of triangle is: "+area);
    }
}
