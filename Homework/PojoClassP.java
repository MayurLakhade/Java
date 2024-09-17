public class PojoClassP {
    public static void main(String[] args) 
    {
        Data m = new Data("Mayur", "lakhademayur@gmail.com", 8180849272L, true, "29 May 2001", "B.E", 3);
        System.out.println("Printing details for mayur:- ");
        m.dis();
        
        Data p = new Data("Prathm", "prathmeshlakhade@gmail.com", 9579198478L, false,"21 sep 2001", "B.E", 3);
        System.out.println("\nPrinting details for prathmesh:-"); 
        p.dis();

        Data s = new Data("Smita", "smitalakhade@gmail.com", 454578785L, false, "4 dec 1998", "MCA", 1);
        System.out.println("\nPrinting details for Smita:-");
        s.dis();
    }
    
}

class Data
{
    private String name;
    private String email;
    private long mobile;
    private boolean fresher;
    private String dob;
    private String education;
    private int noticePeriod;

    public Data(String name, String email, long mobile, boolean fresher, String dob, String education, int noticePeriod)
    {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.fresher = fresher;
        this.dob = dob;
        this.education = education;
        this.noticePeriod = noticePeriod;
    }

    public void dis()
    {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Mobile: "+mobile);
        System.out.println("Fresher: "+fresher);
        System.out.println("dob: "+dob);
        System.out.println("Education: "+education);
        System.out.println("Notice Period: "+noticePeriod);
    }
}
