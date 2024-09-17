package CoreJava.collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
    public static void main(String[] args) 
    {
        ArrayList<Person> plist = new ArrayList<Person>();

        Person p1 = new Person(101, "Atul", false, 6, "Indian");
        plist.add(p1);

        plist.add(new Person(102, "Charly", true, 24, "british"));
        plist.add(new Person(103, "django", true, 27, "spanish"));
        plist.add(new Person(105, "Adam", true, 21, "portugise"));
        plist.add(new Person(55, "Li", true, 25, "chinese"));

        System.out.println(plist);

        System.out.println("\nAfter sorting:\n ");
        Collections.sort(plist);
        System.out.println(plist);

        
    }
    
}
