package CoreJava.fundamentals;

public class LogicalOperators {

    public void eligibility(double marks , int experience)
    {
        System.out.println("Eligibility for techmahendra: "+((marks>60)&&(experience>2)));
        System.out.println("Eligibility for Tcs: "+((marks>60)||(experience>2)));
    }
    public static void main(String[] args) 
    {
        double rameshMarks = 61;
        int rameshExp = 3;

        double sureshMarks = 90;
        int sureshExp = 0;

        LogicalOperators lo = new LogicalOperators();

        System.out.println("Eligibility for ramesh: ");
        lo.eligibility(rameshMarks, rameshExp);

        System.out.println("Eligibility for suresh: ");
        lo.eligibility(sureshMarks, sureshExp);
    }
    
}
