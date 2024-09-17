public class Fri9 {

    public double area(double r)
    {
        System.out.println("Area of circle is: ");
        return 3.142*r*r;
    }

    public double area(double b , double h)
    {
        System.out.println("Area of triangle is: ");
        return 0.5*b*h;
    }

    public double area(int w , int l)
    {
        System.out.println("Area of Rectangle is: ");
        return w*l;
    }

    public double area(int a)
    {
        System.out.println("Area of square is: ");
        return a*a;
    }

    public double area(double h , double a , double b)
    {
        System.out.println("Area of trapezium: ");
        return 0.5*h*(a+b);
    }
    public static void main(String[] args) 
    {
        Fri9 f = new Fri9();
        System.out.println(f.area(5));
        System.out.println(f.area(12, 2.3, 6));
    }
    
}
