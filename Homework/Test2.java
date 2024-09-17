import java.util.*;

public class Test2 {

    public static void main(String[] args) 
    {
         HashSet<String> hashSet = new HashSet<>();
        hashSet.add("orange");
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("grape");
        hashSet.add("kiwi");

        // Convert HashSet to array
        String[] array = new String[hashSet.size()];
        Iterator<String> iterator = hashSet.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            array[index] = iterator.next();
            index++;
        }

        // Sort the array in alphabetical order (using bubble sort for simplicity)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    // Swap elements if they are in the wrong order
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Convert array back to HashSet
        HashSet<String> sortedHashSet = new HashSet<>();
        for (String element : array) {
            sortedHashSet.add(element);
        }

        // Print the sorted HashSet
        System.out.println("Sorted HashSet: " + sortedHashSet);
    }
}

