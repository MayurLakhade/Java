package CoreJava.stringPrograms;

public class StartsWithDemo {
    public static void main(String[] args) 
    {
        String institute = "Anudip Foundation";
        boolean a = institute.startsWith("An");
        boolean b = institute.startsWith("Ta");

        System.out.println("Does the institute starts with An? : "+a);
        System.out.println("Does the institute starts with Ta? : "+b);

        boolean c = institute.endsWith("on");
        boolean d = institute.endsWith("abc");

        System.out.println("Does the institute ends with on? : "+c);
        System.out.println("Does the institute ends with abc? : "+d);

    }
    
}
