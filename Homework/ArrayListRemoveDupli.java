// For removing duplicates in ArrayList.
import java.util.*;

public class ArrayListRemoveDupli {
    public static void main(String[] args) 
    {
        ArrayList<String> st = new ArrayList<String>();
        st.add("Apple");
        st.add("Grape");
        st.add("Banana");
        st.add("Apple");
        st.add("Orange");
        st.add("Banana");

        System.out.println("Before removing duplicates: \n"+st);
        
        for(int i = 0 ; i < st.size() ; i++)
        {
            boolean isDuplicate = false;
            for(int j = i+1 ; j < st.size() ; j++)
            {
                if(st.get(i).equals(st.get(j)))
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate)
            {
                st.remove(st.get(i));
            }
        }

        System.out.println("After removing duplicates: \n"+st);

        /*
         * We can also do it by creating HashSet as well:-
         * HashSet<String> d = new HashSet<String>(st);
         * System.out.println(d);
         */
        

        

    }
    
}
