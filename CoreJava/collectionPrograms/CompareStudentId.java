package CoreJava.collectionPrograms;

import java.util.Comparator;

public class CompareStudentId implements Comparator<Student>{
    public int compare(Student o1, Student o2) {
        return o1.getSid().compareTo(o2.getSid());
    }
    
}
