package CoreJava.stringPrograms;

public class IndexOf {
    public static void main(String[] args) 
    {
        String movie = "Jailer The Movie";
        System.out.println("total length: "+movie.length());

        int i = movie.indexOf('e');
        System.out.println("First index of character e: "+i);

        int k = movie.lastIndexOf('e');
        System.out.println("Last index of character e: "+k);

        int a = movie.indexOf("The"); // Overloaded indexOf method.
        System.out.println("Index of The: "+a);

        int b = movie.indexOf('e', 6); // overloaded
        System.out.println("b= "+b);

        int c = movie.indexOf("The" , 4); // overloaded
        System.out.println("c= "+c);

    }
    
}
