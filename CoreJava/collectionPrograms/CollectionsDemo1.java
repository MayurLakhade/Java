package CoreJava.collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) 
    {
        /*
         * Collections is a predefined class used to rearrange and manipulate the members 
         * of our list.
         * By default list implemented classes such as ArrayList, LinkedList etc does not 
         * sort our members, hence in order to achieve sorting we use this collections class.
         * 
         * Collections is a singleton class meaning we will not be able to create its object.
         * All methods in collections class are static.
         */
        ArrayList<String> names = new ArrayList<String>();
        names.add("mohak");
        names.add("chintan");
        names.add("saru");
        names.add("kali");
        names.add("yashu");
        names.add("mohak");

        System.out.println("Before sorting:\n"+names);

        //Collections.sort(names); :- Will sort the members in natural order. 

        //Collections.shuffle(names);  :- will randomly shuffle the members.
        //Collections.reverse(names);  :- Will give the mirror image of the list
        Collections.sort(names, Collections.reverseOrder()); // Will sort in reverse of natural order.

        System.out.println("\nAfter sorting:\n"+names);
    }
    
}
