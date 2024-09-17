package CoreJava.collectionPrograms;
import java.util.*;
public class LinkedHashMapEx1 {
    /*
     * LinkedHashMap is similar to HashMap, only difference is that insertion order is 
     * maintained in LinkedHashMap.
     */
    public static void main(String[] args) 
    {
        LinkedHashMap<String, String> sh = new LinkedHashMap<String, String>();

        sh.put("Maharashtra", "Mumbai");
        sh.put("Gujrat", "Gandhinagar");
        sh.put("Kerala", "Trivandrum");
        sh.put("Up", "Patana");
        sh.put("Tamil Nadu", "Chennai");

        System.out.println(sh);
    }
    
}
