package CoreJava.collectionPrograms;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) 
    {
        PriorityQueue<Employee> es = new PriorityQueue<Employee>((e1 , e2)->
        {
            return e1.getEmpn().compareTo(e2.getEmpn());

        });

        es.add(new Employee("Sudhir", 2500.0, "designer"));
        es.add(new Employee("naresh", 5455.0, "Painter"));
        es.add(new Employee("rajesh", 9000.0, "service"));
        es.add(new Employee("kishor", 6221.0, "dev"));

        System.out.println(es);


    }
    
}
