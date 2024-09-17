
class Soundcore{
    String logo = "Soundcore by Anchor";

    public void brand()
    {
        System.out.println("This brand is very well recognized by many singers.");
    }

}

class Earbuds extends Soundcore{
    public void priceRange()
    {
        System.out.println("Generally priced in between 2500 to 7000");
    }

    public void audioQuality()
    {
        System.out.println("Overall rating of 4.5 out of 5 stars.");
    }
}

class Headphones extends Soundcore{
    public void priceRange()
    {
        System.out.println("Generally priced in between 5000 to 12000");
    }

    public void audioQuality()
    {
        System.out.println("Overall rating of 4.7 out of 5 stars.");
    }

}

public class Fri2 {
    public static void main(String[] args) 
    {
        Earbuds e = new Earbuds();
        System.out.println("Brand name is: "+e.logo);
        e.brand();
        e.audioQuality();

        Headphones h = new Headphones();
        System.out.println("\nBrand name is: "+h.logo);
        h.priceRange();
    }
    
}
