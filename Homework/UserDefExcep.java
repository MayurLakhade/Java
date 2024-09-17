import java.util.Scanner;

class AgeInvalidToVoteException extends Exception{
    public AgeInvalidToVoteException()
    {
        System.out.println("You are not eligible to vote.");
    }

    public String getMessage() {
        return "Not eligible";
    }

    public String toString() {
        return "AgeInvalidToVoteException: Not eligible";
    }
}

public class UserDefExcep {

    public void Eligibility(int age) throws AgeInvalidToVoteException
    {
        if(age < 18)
        {
            throw new AgeInvalidToVoteException();
        }
        else
        System.out.println("You are eligible to vote.");
    }
    public static void main(String[] args) 
    {
        UserDefExcep u = new UserDefExcep();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        try 
        {
            u.Eligibility(age);
        } 
        catch (AgeInvalidToVoteException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            sc.close();
        }
    }
    
}
