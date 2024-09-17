package CoreJava.inheritance;
/*
 * Create a class ClothingApp
 * it should have methods addToCart, addReview, placeOrder.
 * 
 * Make a class Myntra that is child class of ClothingApp.
 * Change the behavior of addToCart in Myntra app.
 * Myntra should have its own two methods.
 * 
 * demonstrate upcasting...
 */

 class ClothingApp{
    public void addToCart()
    {
        System.out.println("you are adding this item to cart.");
    }

    public void addReview()
    {
        System.out.println("you are writting review for this item.");
    }

    public void placeOrder()
    {
        System.out.println("You have placed the order.");
    }
 }

 class Myntra extends ClothingApp{
    public void addToCart()//Method overriding.
    {
        System.out.println("Adding item to cart in myntra.");
    }

    public void pay()
    {
        System.out.println("you are about to make payment.");
    }

    public void accessories()
    {
        System.out.println("this are accessories.");
    }

    public String addReview(String rew)
    {
        System.out.println(rew+" -this is your review");
        return rew+" This is your review";
    }
 }
public class UpcastingPractice1 {
    public static void main(String[] args) 
    {
        ClothingApp c = new Myntra();
        c.addToCart();

        Myntra m = new Myntra();
        m.addReview("Great product");
        
    }
    
}
