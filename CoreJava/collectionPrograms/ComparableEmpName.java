package CoreJava.collectionPrograms;

import java.util.Comparator;

public class ComparableEmpName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpn().compareTo(o2.getEmpn());
    }
    
}
