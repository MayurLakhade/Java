package AnudipE_Commerce.comDbTest;

import java.util.List;
import java.util.Scanner;

import AnudipE_Commerce.comDbDao.ProductDaoImpl;
import AnudipE_Commerce.comDbPojo.Product;

public class ProductUI {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Integer productId;
        String productName;
        String productType;
        Double price;
        Integer quantityInStock;
        Double rating;
        String description;
        String choice;

        Product p = null;
        ProductDaoImpl pimple = new ProductDaoImpl();
        List<Product> plist = null;
        Boolean flag;

        boolean exit = false;
        int option;
        System.out.println("______________Welcome to Anudip ___________");
        while(exit == false)
        {
            System.out.println("Enter the options as given below:-");
            System.out.println("1-----> Add product");
            System.out.println("2-----> Show all products");
            System.out.println("3----->Update product");
            System.out.println("4-----> Delete a product");
            System.out.println("5-----> Search product by name");

            option = sc.nextInt();
            sc.nextLine();

            switch(option)
            {
                case 1 :
                System.out.println("Enter name of product: ");
                productName = sc.nextLine();

                System.out.println("Enter type of product: ");
                productType = sc.nextLine();

                System.out.println("Enter price of product: ");
                price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter number of product in stock: ");
                quantityInStock = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter rating for the product, number between 1 to 5:  ");
                rating = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter short description of the product: ");
                description = sc.nextLine();

                p = new Product(productName, productType, price, quantityInStock, rating, description);

                flag = pimple.addProduct(p);
                if(flag)
                System.out.println("Product added to database successfully!");
                else
                System.out.println("Error while adding the product.");

                break;

                case 2:
                plist = pimple.showAllProducts();
                if(plist != null && plist.isEmpty() != true)
                {
                    for(Product product : plist)
                    {
                        System.out.println(product);
                        System.out.println("______________________________________________");

                    }
                }
                else
                System.out.println("Unable to show products at this moment!!! please try again");

                break;

                case 3:
                plist = pimple.showAllProducts();
                if(plist != null && plist.isEmpty() != true)
                {
                    for(Product product : plist)
                    {
                        System.out.println(product.getProductName()+" : "+product.getProductId());
                        System.out.println("______________________________________________");

                    }
                    System.out.println("Please enter the id of the product to be updated : ");
                    productId = sc.nextInt();
                    sc.nextLine();

                    p = pimple.searchProductById(productId);
                    if(p != null)
                    {
                        System.out.println(p);
                        System.out.println("Enter yes or no based on if you want to update this product.");
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("yes"))
                        {
                            System.out.println("Enter name of product: ");
                            productName = sc.nextLine();

                            System.out.println("Enter type of product: ");
                            productType = sc.nextLine();

                            System.out.println("Enter price of product: ");
                            price = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Enter number of product in stock: ");
                            quantityInStock = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter rating for the product, number between 1 to 5:  ");
                            rating = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Enter short description of the product: ");
                            description = sc.nextLine();

                            p.setProductName(productName);
                            p.setProductType(productType);
                            p.setPrice(price);
                            p.setRating(rating);
                            p.setDescription(description);
                            p.setQuantityInStock(quantityInStock);

                            flag = pimple.updateProduct(p);
                            if(flag)
                            {
                                System.out.println("Product updated successfully.");
                            }
                            else
                            System.out.println("Error while updating product.");

                        }
                        else if(choice.equalsIgnoreCase("no"))
                        {
                            System.out.println("No problem!!! continue browsing.");
                        }
                        else
                        System.out.println("Please enter yes or no only.");
                    }
                    else
                    System.out.println("No product found by this id.");
                }
                else
                System.out.println("Unable to show products at this moment!!! please try again");
                break;

                case 5:
                System.out.println("Enter the name of product you want to search: ");
                productName = sc.nextLine();

                plist = pimple.searchProductByName(productName);
                if(plist != null && plist.isEmpty() != true)
                {
                    for(Product product : plist)
                    {
                        System.out.println(product);
                        System.out.println("_____________________________________________");
                    }
                }
                else
                System.out.println("Unable to show products at this moment.");

                break;
            }

        }
    }
    
}
