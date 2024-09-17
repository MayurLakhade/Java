package AnudipE_Commerce.comDbDao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import AnudipE_Commerce.comDbPojo.Product;
import AnudipE_Commerce.comDbUtil.DButility;

public class ProductDaoImpl implements ProductDao
{

    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;

    @Override
    public Boolean addProduct(Product p) 
    {
        con = DButility.makeConnection();
        try 
        {
            sql = "insert into Product_6201(productName, productType, price, quantityInStock, rating, description) values(?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductType());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantityInStock());
            ps.setDouble(5, p.getRating());
            ps.setString(6, p.getDescription());

            int i = ps.executeUpdate();
            if(i>0)
            return true;
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                ps.close();
                con.close();
            } catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Boolean deleteProduct(Integer productId) {
        
        return false;
    }

    @Override
    public List<Product> showAllProducts() 
    {
        con = DButility.makeConnection();
        sql = "select * from Product_6201";
        try 
        {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Product> plist = new ArrayList<Product>();

            while(rs.next())
            {
                Product p = new Product();
                
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try 
            {
                ps.close();
                rs.close();
                con.close();
            } 
            catch (Exception e) 
            {
                // TODO: handle exception
            }
        }
        return null;
    }

    @Override
    public Product searchProductById(Integer productId) {
        con = DButility.makeConnection();
        sql = "select * from Product_6201 where productId = ?";
        try 
        {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            if(rs.next())
            {
                Product p = new Product();
                p.setProductId(rs.getInt("productId"));
                p.setString(rs.getString(p));
                p.setString(2, p.getProductType());
                p.setDouble(3, p.getPrice());
                p.setInt(4, p.getQuantityInStock());
                p.setDouble(5, p.getRating());
                p.setString(6, p.getDescription());

                return p;
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> searchProductByName(String productName) {
        con = DButility.makeConnection();
        sql = "select * from Product_6201 where productName like ?";

        try 
        {
            ps= con.prepareStatement(sql);
            ps.setString(1, "%"+productName);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public Boolean updateProduct(Product p) 
    {
        con = DButility.makeConnection();
        sql = "update Product_6201 set productName = ?, productType=?, price=?, quantityInStock=?, rating=?, description=? where productId = ? ";

        try 
        {
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductType());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQuantityInStock());
            ps.setDouble(5, p.getRating());
            ps.setString(6, p.getDescription());
            ps.setInt(7, p.getProductId());

            int i = ps.executeUpdate();
            if(i>0)
            return true;
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
    
}
