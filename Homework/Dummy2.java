import java.util.Scanner;

public class Dummy2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d [] = s.split(" ");

        for(int i = d.length-1 ; i >= 0 ; i--)
        {
            for(int j = i ; j >= 0 ; j--)
            {
                System.out.print(d[j]+" ");
            }
            System.out.println();
        }

    }
    
}
