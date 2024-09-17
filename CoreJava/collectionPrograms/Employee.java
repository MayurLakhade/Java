package CoreJava.collectionPrograms;

public class Employee implements Comparable<Employee>{
    private String empn;
    private Double sal;
    private String desg;
    
    public Employee(String empn, Double sal, String desg) {
        this.empn = empn;
        this.sal = sal;
        this.desg = desg;
    }

    public Employee (){}
    
    public String getEmpn() {
        return empn;
    }
    public void setEmpn(String empn) {
        this.empn = empn;
    }
    public Double getSal() {
        return sal;
    }
    public void setSal(Double sal) {
        this.sal = sal;
    }
    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }

    @Override
    public String toString() {
        return "Employee [empn=" + empn + ", sal=" + sal + ", desg=" + desg + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.sal.compareTo(o.sal);
    }


    
}
