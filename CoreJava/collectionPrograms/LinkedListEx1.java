package CoreJava.collectionPrograms;
import java.util.*;
public class LinkedListEx1 {
    public static void main(String[] args) 
    {
        // LinkedList implements List and also Deque, due to which it has the 
        // properties of List, Deque and also Queue.

        /*Properties of LinkedList:-
         * 1) Insertion order is maintained.
         * 2) Members are not sorted.
         * 3) Null value is allowed.
         * 4) Duplicates are allowed.
         * 5) All members are allocated with indexes starting from 0 to size()-1.
         * 
         * Properties of LinkedList as a Queue:-
         * 1) Insertion order is maintained, meaning the new object added will be usually 
         *    added to the end fo the queue.
         * 2) It follows FIFO(First In First Out), meaning the object which was added first
         *    will be deleted first when we call poll();
         * 3) Members are not given indexes.
         * 4) Null values are allowed.
         * 5) Members are not sorted.
         */
        
        /*
         * Properties of LinkedList as a DeQue:-
         * 1) New members can be added at the beginning and also to the end of the queue.
         * 2) We can delete members from the start and also from the end of the queue.
         * 3) It follows both FIFO and LIFO()
         */

         List<String> list = new LinkedList<String>();
         list.add("mayur");
         list.add(null);
         list.add("roshan");
         list.add("danish");
         list.add("mayur");

         System.out.println(list);


         Queue<String> list2 = new LinkedList<String>();
         list2.add("manohar");
         list2.add("rakesh");
         list2.add("ashwin");

         System.out.println("Before: \n"+list2);

         list2.add("sohan");

         System.out.println("After: \n"+list2);

         list2.poll();

         System.out.println("After deleting: \n"+list2);

         Deque<String> list3 = new LinkedList<String>();
         list3.add("arush");
         list3.add("pankaj");
         list3.add("rohit");
         list3.add("prathm");
         list3.add("ganesh");

         System.out.println("Before:\n"+list3);

         list3.offer("kirti");

         System.out.println("After:\n"+list3);

         list3.offerFirst("sahil");

         System.out.println("After offerFirst:\n"+list3);

         list3.poll();
         System.out.println("After poll:\n"+list3);

         list3.pollLast();
         System.out.println("After pollLast:\n"+list3);

    }
    
}
