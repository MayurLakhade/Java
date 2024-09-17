import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        RecursiveFactorial rs = new RecursiveFactorial();

        long factorial = 0;
        int num;

        while (true) {
            
            System.out.println("Enter a non_negative number:-");
             num = sc.nextInt();
            sc.nextLine();
        if(rs.nonNegativeNumber(num))
        {
             factorial = rs.calculateFactorial(num);
        }

        System.out.println("The factorial of the number "+num+ " is:- " + factorial);

        System.out.println("Do you want to calculate the factorial of another number (answer in yes or no):-");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("No"))
        {
            break;
        }



        }
        sc.close();
        
    }
    

    public boolean nonNegativeNumber(int num)
    {

        boolean s;
        

        while(true)
        {
            try {
                
                if(num > 0)
                {
                    s = true;
                    break;
                }
                else
                {
                    System.out.println("Please enter non-negative number.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input...");
            }

        }
        return s;
    }
    
    public long calculateFactorial(int num)
    {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}

/*
 * import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int number = getNonNegativeInteger(scanner);

            long factorial = calculateFactorial(number);

            System.out.println("The factorial of " + number + " is: " + factorial);

            System.out.print("Do you want to calculate the factorial for another number? (yes/no): ");
            String choice = scanner.next().toLowerCase();

            if (!choice.equals("yes") && !choice.equals("y")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

        } while (true);

        scanner.close();
    }

    private static int getNonNegativeInteger(Scanner scanner) {
        int number;
        while (true) {
            try {
                System.out.print("Enter a non-negative integer: ");
                number = Integer.parseInt(scanner.next());

                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return number;
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
 */
