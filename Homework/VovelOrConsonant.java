import java.util.Scanner;

public class VovelOrConsonant {

    public void vovelOrConsonant(char a)
    {
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'  )
        {
            System.out.println("This is vovel.");
        }
        else
        {
            System.out.println("This is consonant");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character: ");
    
        VovelOrConsonant v = new VovelOrConsonant();
        v.vovelOrConsonant( sc.next().charAt(0));

    }
    
}
