import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFood {

    public static void main(String[] args) 
    {
        ArrayList<Food> food = new ArrayList<Food>();
        food.add(new Food(42, "Khichadi", "Veg", 80, 5.0));
        food.add(new Food(45, "Dabeli", "Veg", 60, 4.0));
        food.add(new Food(34, "Vadapav", "Veg", 55, 4.5));
        food.add(new Food(21, "Dosa", "Veg", 70, 4.2));
        food.add(new Food(37, "Idli Sambhar", "Veg", 50, 4.7));

        System.out.println("Before sorting: \n"+food);
        Collections.sort(food);
        System.out.println("After sorting: \n"+food);

    }
    
}
