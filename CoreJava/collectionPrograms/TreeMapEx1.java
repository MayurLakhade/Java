package CoreJava.collectionPrograms;

import java.util.TreeMap;

//import java.util.;

public class TreeMapEx1 {
    public static void main(String[] args) 
    {
        TreeMap<String, Double> tr = new TreeMap<String, Double>();
        tr.put("Soni", 45.0);
        tr.put("Adarsh",99.2);
        tr.put("ram",85.2);
        tr.put("lakshman",55.2);
        tr.put("bharat",32.6);

        System.out.println(tr);

    }
    
}
