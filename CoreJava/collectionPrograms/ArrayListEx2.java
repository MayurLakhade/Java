package CoreJava.collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String[] args) 
    {
        /*
         * Iterator is an interface used to iterate the members of the collection.
         * It can be used to fetch data from any type of collection.
         * Iterator interface's implemented object is created with the method iterator().
         * 
         * ListIterator is also an interface used to iterate members of the collection.
         * It can be used to fetch data only from those collection classes that implement List interface.
         */

         ArrayList<Integer> rollNo = new ArrayList<>();
         rollNo.add(78);
         rollNo.add(102);
         rollNo.add(31);
         rollNo.add(88);
         rollNo.add(56);
         rollNo.add(22);

         // Upcasting. Object of Itr class is created when we call iterator() method.
         // Itr class implements Iterator interface. Hence we are doing upcasting over here.
         Iterator<Integer> it = rollNo.iterator(); 
         System.out.println("Using Iterator: ");
         while(it.hasNext())
         {
            System.out.println(it.next());
         }

         System.out.println("\nUsing ListIterator from start to end: ");
         ListIterator<Integer> li = rollNo.listIterator();
         while(li.hasNext())
         {
            System.out.println(li.next());
         }

         System.out.println("\nUsing ListIterator from end to start: ");
         ListIterator<Integer> rev = rollNo.listIterator(rollNo.size());
         while(rev.hasPrevious())
         {
            System.out.println(rev.previous());
         }

         
    }
    
}
