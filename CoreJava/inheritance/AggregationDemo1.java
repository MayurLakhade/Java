package CoreJava.inheritance;


class Food{

    int foodId = 11;
    String foodName = "Samosa";
    double foodPrice = 30.00;
    public void addSalt()
    {
        System.out.println("Adding salt.");
    }

    public void addChutney()
    {
        System.out.println("Adding chutney.");
    }

}

class Cart{
    Food f = new Food();

    public void changeFood()
    {
        f.addSalt();
    }
}
public class AggregationDemo1 {
    public static void main(String[] args) 
    {
        /*
         * Inheritance shows IS-A relationship.
         * Here child is a type of parent.
         * 
         * Aggregation shows HAS-A relationship.
         * In this one class has a object of another class.
         */

         Cart c = new Cart();
         c.f.addSalt();
         c.f.addChutney();
         c.changeFood();

    }
    
}
