import java.util.HashSet;
import java.util.Iterator;
// For sorting HashSet in alphabetical orer.
public class HashSetAlphabetical {
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("papaya");
        hs.add("Mango");
        hs.add("Apple");
        hs.add("Kivi");
        hs.add("Banana");
        hs.add("Grape");
        hs.add("Berries");
        hs.add("Avocado");

        String [] s = new String[hs.size()];
        Iterator<String> nt = hs.iterator();
        int n = 0;
        while(nt.hasNext())
        {
            s[n] = nt.next();
            n++;
        }

        for(int i = 0 ; i < s.length-1 ; i++)
        {
            for(int j = i+1 ; j <s.length ; j++)
            {
                if(s[i].compareTo(s[j]) > 0)
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }

        }

        HashSet<String> newHs = new HashSet<String>();

        for(String st : s)
        {
            newHs.add(st);
        }

        System.out.println("Sorted alphabeticaly: \n"+newHs); // Here String type HashSet is sorted in alphabetical order
                                                              // But insertion order is not maintained in HastSet, hence it will not show in sorted manner.

        /*
         * We can also do it by creating ArrayList:-
         * 
         * ArrayList<String> ar = new ArrayList<String>(hs);
         * Collections.sort(ar);
         * System.out.println("Sorted HashSet: "+ar);
         * 
         */
    }
    
}
