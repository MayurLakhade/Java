package CoreJava.collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
    public static void main(String[] args) 
    {
        ArrayList<Student> slist = new ArrayList<Student>();

        slist.add(new Student(11, "rahul", "rahulrr@gmail.com", 56, 22));
        slist.add(new Student(16, "mehul", "mehul@gmail.com", 59, 21));
        slist.add(new Student(13, "mohak", "mohak@gmail.com", 60, 25));
        slist.add(new Student(18, "prakash", "prakash@gmail.com", 52, 30));
        slist.add(new Student(15, "sanket", "sanket@gmail.com", 44, 27));

        System.out.println("Before sorting: \n"+slist);

        Collections.sort(slist, new CompareStudentName());
        System.out.println("\nAfter sorting name wise: \n"+slist);

        Collections.sort(slist, new CompareStudentId());
        System.out.println("\nAfter sorting id wise: \n"+slist);

        Collections.sort(slist, new CompareStudentMarks());
        System.out.println("\nAfter sorting marks wise: \n"+slist);


    }
    
}
