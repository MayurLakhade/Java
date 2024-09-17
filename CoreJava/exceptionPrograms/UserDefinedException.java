package CoreJava.exceptionPrograms;

import java.util.Scanner;

/*
 * We can make our own exceptions wuth the following Steps:-
 * 1) our class should be part of the Exception hierarchy. 
 * So we should extend our class with either exception class:-
 * This will make our exception a compiletime exception or extend with RuntimeException class:-
 * This will make our exception a runtime exception.
 * 
 * 2) Make constructors and basic methods in the exception class.
 * 
 * 3) We use throw keyword to specify on which error code our exception should occur.
 * 
 */
class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException()
    {
        System.out.println("Balance is not sufficient enough.");
    }
/*
 * getMessage() method always returns the reason for the exception to occur.
 */
    public String getMessage()
    {
        return "Balance too low";
    }
/*
 * In toString method we return the fully qualified name of the class and the reason for the
 * exception to occur as seen below.
 */
    public String toString()
    {
        return "exceptionsPrograms.InsufficientBalanceException: Balance too low";
    }

}

class Account{
    int balance = 10000;

    public void withdraw(double withdrawAmount) throws InsufficientBalanceException
    {
        if(balance < withdrawAmount)
        {
            throw new InsufficientBalanceException();
        }
        else
        {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount+"Has been withdrawn from your account."); 
            System.out.println("Current balance: "+balance);
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) 
    {
        Account a = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to be withdrawn:");
        double withdrawAmount = sc.nextDouble();

        try {
            a.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            
            e.printStackTrace();
        }
        sc.close();
    }
    
    
}
