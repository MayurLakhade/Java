import java.util.Scanner;

public class Fri14 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter any phrase");
		String s=sc.nextLine();
		
		char []c=s.toCharArray();
		int count=0;
		
		for(int i=0; i<c.length; i++) {
			count=0;
			
			char ch=c[i];
			
			if(ch!=' ') {
				
				count++;
			}
			
			for(int j=i+1; j<c.length; j++) {
				
				char ch1=c[j];
				
				if(ch==ch1) {
					
					count++;
					c[j]=' ';
				}
			}
			if(c[i]!=' ')
			System.out.println("No. of "+c[i]+"= "+count);
		}
    }
    
}
