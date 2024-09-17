public class Food implements Comparable<Food> {
   
    private Integer foodId;
    private String foodName;
    private String type;
    private Integer price;
    private Double rating;
    
    public Food(Integer foodId, String foodName, String type, Integer price, Double rating) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }
    
    public Integer getFoodId() {
        return foodId;
    }
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Food [foodId=" + foodId + ", foodName=" + foodName + ", type=" + type + ", price=" + price + ", rating="
                + rating + "]";
    }

    public int compareTo(Food o) {
        return this.price.compareTo(o.price);
    }

    
}
