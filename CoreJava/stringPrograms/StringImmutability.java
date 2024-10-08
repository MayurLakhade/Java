package CoreJava.stringPrograms;
/*
 * String immutability is the ability of Strings to not change the original object.
 * Once the String object is created in SCP memory then we will not be able to change this object.
 * If we try to concat or make any other change then a new String object is created.
 * 
 * We can refer this new String object by a new variable or use the same old reference
 * to now point to new object.
 * 
 */
public class StringImmutability {
    public static void main(String[] args) 
    {
        
        String name1 = "Akash";
        String name2 = "Akash";

        System.out.println("Are name1 and name2 reffering to same object? :"+(name1 == name2));
        System.out.println("Before:\nname1: "+name1+"\nname2: "+name2);

        name1 = name1.toUpperCase(); // Same name1 variable will now reffer to new object.
        //String s = name1.toUpperCase(); :-We have created new variable s to refer to the new object.

        System.out.println("Are name1 and name2 reffering to same object? :"+(name1 == name2));
        System.out.println("\nAfter:\nname1: "+name1+"\nname2: "+name2);
        //System.out.println("The new object created s = "+s);
    }
    
}
