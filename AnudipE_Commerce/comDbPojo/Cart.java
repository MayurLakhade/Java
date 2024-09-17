package AnudipE_Commerce.comDbPojo;

public class Cart {
    private Integer cartId;
    private String email;
    private Integer productId; // foreign key references product_6201(ProductId)
    private Integer quantity;
    //Product object will be able to give all details about product
    private Product product; // No need to create column for this.
    
}
