package AnudipE_Commerce.comDbDao;

import java.sql.*;
import java.util.*;

import AnudipE_Commerce.comDbPojo.Customer;
import AnudipE_Commerce.comDbUtil.DButility;

public class CustomerDaoImpl implements CustomerDao 
{
    Connection con=null;
	PreparedStatement ps=null;
	String sql=null;
	ResultSet rs=null;
	List<Customer> custlist=null;

    @Override
    public Boolean insertCust(Customer c) {
        con=DButility.makeConnection();
		try {
			
			sql="insert into Customer_6201(custName, email, permanentAddress, contact, password) values(?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, c.getCustName());
			ps.setString(2, c.getEmail() );
			ps.setString(3, c.getPermanentAddress());
			ps.setLong(4, c.getContact());
			ps.setString(5, c.getPassword() );
			
			int i=ps.executeUpdate();
			
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
			}
            catch(SQLException e) 
            {
				
				e.printStackTrace();
			}
		}
		return false;
  
    }

    @Override
    public Boolean updateCust(Customer c) 
    {
        con=DButility.makeConnection();
		sql="update Customer_6201 set custName=?, email=?, permanentAddress=?, contact=?, password=? where custId=?";
		
		try 
        {
			ps=con.prepareStatement(sql);
			
			ps.setString(1, c.getCustName());
			ps.setString(2, c.getEmail() );
			ps.setString(3, c.getPermanentAddress());
			ps.setLong(4, c.getContact());
			ps.setString(5, c.getPassword() );
			
			ps.setInt(6, c.getCustId());
			
			int i=ps.executeUpdate();
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
			} 
            catch (Exception e) 
            {
				
				e.printStackTrace();
			}
		}
		return false;
    }
    
    
}
