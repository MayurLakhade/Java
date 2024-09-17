package CoreJava.collectionPrograms;

import java.util.HashMap;
/*
 * Properties:-
 * 1) Insertion order is not maintained.
 * 2) Members are not sorted.
 * 3) Keys cannot be duplicate, but values can be duplicates.
 * 4) only one null key is allowed, multiple null values are allowed.
 */
public class HashMapsEx1 {
    public static void main(String[] args) 
    {
        HashMap<String, Long> contacts = new HashMap<String, Long>();
        contacts.put("John", 4444444444l);
        contacts.put(null,null);
        contacts.put("Bhavesh", 456875412l);
        contacts.put("Neha", 45896313365l);
        contacts.put("manish",null);
        contacts.put("Bhavesh",4444444444l);

        System.out.println(contacts);
        System.out.println("Contact number of bhavesh: "+contacts.get("Bhavesh"));

        HashMap<Integer, Person> personDetails = new HashMap<Integer, Person>();
        personDetails.put(1, new Person(101, "manthan", false, 22, "Indian"));

        System.out.println(personDetails.get(1));
        
    }
    
}
