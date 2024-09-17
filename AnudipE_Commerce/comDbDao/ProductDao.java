package AnudipE_Commerce.comDbDao;

import java.util.List;

import AnudipE_Commerce.comDbPojo.Product;

public interface ProductDao 
{
    public Boolean addProduct(Product p);
    public Boolean updateProduct(Product p);
    public Boolean deleteProduct(Integer productId);

    public List<Product> showAllProducts();
    public Product searchProductById(Integer productId);
    public List<Product> searchProductByName(String productName);
    
}
