package CoreJava.collectionPrograms;

import java.util.ArrayDeque;

public class ArrayDequeEx1 {
    public static void main(String[] args) 
    {
        /*
         * ArrayDeque class implements Deque interface.
         * 
         * Properties:-
         * 1) NUll value not allowed.
         * 2) Insertion order maintained.
         * 3) Members are not stored.
         * 4) Duplicates are allowed.
         * 5) We can add and remove members from both end of the ArrayDeque 
         *    because it is a doubly ended queue.
         */

         ArrayDeque<String> colors = new ArrayDeque<String>();
         colors.offer("Red");
         colors.add("Orange");
         colors.add("Yellow");
         colors.add("Green");
         colors.add("Blue");

         System.out.println(colors);

         //colors.poll();
         colors.pollLast();
         System.out.println(colors);

         colors.offerFirst("Violet");
         System.out.println(colors);
    }
    
}
