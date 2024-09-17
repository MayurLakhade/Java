package CoreJava.collectionPrograms;

import java.util.Comparator;

public class CompareStudentMarks implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
        return o1.getTotalMarks().compareTo(o2.getTotalMarks());
    }
    
    
}
