/*
 * Below demonstrate why we prefer using toString method over separattely 
 * printing the values which are being set.
 * 
 * Note:- I have also answered the question below in main method.
 */
class Car{

    int carId;
    String engineType;
    String color;
    String brand;


    public void setCarId(int carId) 
    {
        this.carId = carId;
    }
    public int getCarId() 
    {
        return carId;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() 
    {
        return engineType;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    public String getColor() 
    {
        return color;
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }
    public String getBrand() 
    {
        return brand;
    }

    public String toString()
    {
        return "\nCarId: "+carId+"\nEngineType: "+engineType+"\nColor: "+color+"\nBrand: "+brand;
    }   
    
}

public class Que4 {
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.setCarId(45);
        c.setEngineType("Petrol");
        c.setColor("Red");
        c.setBrand("Audi");

        /*
         * Q)Need and use of toString method? 
         * Ans :-
         *
         * Here we can see that if we want to see the values which are being set in instance variables,
         * then using getters we need to store that value in new variable and print that variable each time
         * separately for 'n' number of instance variables. 
         * it is not pleasing to look at such long code and it also takes a lot of time to write it as well.
         */
        String s = c.getBrand();
        System.out.println("Brand name: "+s);

        /*
         * Instead, simply by printing the object we are able to see all the instances that are returned in a String by toString
         * method at one go.
         * Hence toString method is advantageous over separately calling teh getters. 
         */
        System.out.println(c);

    }
    
}
