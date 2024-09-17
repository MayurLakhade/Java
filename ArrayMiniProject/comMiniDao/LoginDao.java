package ArrayMiniProject.comMiniDao;

public interface LoginDao {

    public boolean employeeLogin(String userName, String password);
    public boolean adminLogin(String userName , String password);
    
}
