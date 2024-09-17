import java.util.Scanner;

public class CostOfIceCream {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Select your desired flavour: "+"\nChocklet, Butterscoch, Almond, Mango, Cashew"+"\nEnter: ");
        String flavour = sc.nextLine();

        switch(flavour)
        {
            case "Chocklet" : System.out.println("Please pay 30 Rs.");
            break;

            case "Butterscoch" : System.out.println("Please pay 40 Rs.");
            break;

            case "Almond" : System.out.println("Please pay 50 Rs.");
            break;

            case "Mango" : System.out.println("PLease pay 45 Rs.");
            break;

            case "Cashew" : System.out.println("Please pay 60 Rs.");
            break;

            default : System.out.println("Requested flavour is not available"+"\nPlease select from menu above.");
        }
    }
    
}
