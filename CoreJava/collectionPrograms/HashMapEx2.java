package CoreJava.collectionPrograms;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) 
    {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Maharashtra", "Mumbai");
        hm.put("Gujrat", "Gandhinagar");
        hm.put("Kerala", "Trivandrum");
        hm.put("Up", "Patana");
        hm.put("Tamil Nadu", "Chennai");

        System.out.println("Getting all keys of the HashMap...");
        Set<String> states = hm.keySet();
        System.out.println("States: "+states);

        System.out.println("\nGetting all values of the HashMap...");
        Collection<String> cities = hm.values();
        System.out.println("Cities: "+cities);

        System.out.println("\nGetting each pair separetely in a set: ");
        Set<Map.Entry<String, String>> pairs = hm.entrySet();
        Iterator<Map.Entry<String, String>> it = pairs.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
    
}
