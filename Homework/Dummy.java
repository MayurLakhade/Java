import java.util.Scanner;

public class Dummy{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        String r = "";
        
        for(int i = s.length()-1 ; i >=0 ; i-- )
        {
            r+= s.charAt(i);
        }

        StringBuffer d = new StringBuffer();
        d.append(r.substring(0, 1).toUpperCase());
        d.append(r.substring(1).toLowerCase());
        System.out.println(d);


    }

}
