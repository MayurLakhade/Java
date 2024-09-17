package CoreJava.stringPrograms;

public class UpperCaseLowerCase {
    public static void main(String[] args) 
    {
        String tree = "Mango tree";
        
        String tree2 = tree.toUpperCase();
        String tree3 = tree.toLowerCase();

        System.out.println("Original tree: "+tree);
        System.out.println("tree2: "+tree2);
        System.out.println("tree3: "+tree3);
    }
    
}
