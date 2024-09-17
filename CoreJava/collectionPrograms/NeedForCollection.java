package CoreJava.collectionPrograms;

import java.util.ArrayList;

/*
 * Points to remember in collection :-
 * 1) Null allowed or not.
 * 2) Duplicates are allowed or not.
 * 3) Insertion order is maintained or not.
 * 4) Members are sorted implicitly or not.
 *
 */
public class NeedForCollection {
    public static void main(String[] args) 
    {
        /*
         * Dissadvantages of arrays:-
         * 1) Size is fixed.
         * 2) Only homogeneous type of data can be stored in an array.
         * 3) Array does not provide much variations or predefined methods in it.
         *    Searching and other manipulations in an array is difficult.
         * 
         * Framework :-
         * It is a group of predefined classes and interfaces having many predefined methods 
         * which can be used and modified according to our requirement.
         * 
         * Collection is a framework of many interfaces and classes.
         * Collection is used to store a group of objects.
         * 
         * Advantages:-
         * 1) Its size is not fixed.
         * 2) We get many predefined classes due to which we can have different collections 
         *    having their own unique properties.
         * 3) We can create homogeneous or heterogeneous collections.
         */


         /*
          * Below we have created a heterogeneous or non-generic collection.
          * Meaning we can add any type of data in it.
          * Note:-
          * In java this is not preferred. We should usually never make such non-generic collection,
          * because it not give type safety.
          */
         ArrayList myObj = new ArrayList();
         myObj.add("Anudip");
         myObj.add(10);
         myObj.add(9.6);
         myObj.add(true);
         myObj.add('#');

         System.out.println(myObj);
    }
    
}
