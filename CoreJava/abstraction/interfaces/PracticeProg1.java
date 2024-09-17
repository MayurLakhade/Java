package CoreJava.abstraction.interfaces;
/*
 * Create an interface for any app that you want.
 * Show its implementation in your class.
 * Also Demonstrate the use of multiple inheritance in this example
 */

import java.util.Scanner;

interface CoverPage{

    String NameOfApp = "Anime heaven";
    int noOfEpisodes = 545;
    int noOfSeasons = 8;

    public void connect();

} 

interface Selection{
    public String genre(String genre);

    public String animeName(String animeName);
}

class User implements CoverPage, Selection{
    private String userName;
    private String password;

    public User()
    {

    }

    public User(String userName , String Password)
    {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public String genre(String genre)
    {
        return "Your selected genre is: "+genre;
    }

    public String animeName(String animeName)
    {
        return "Your selected anime is: "+animeName;
    }

    public void connect()
    {
        System.out.println( "\nYou can connect with us on our instagram and telegram"+"\nYou may request any anime...");
    }

    public String toString()
    {
        return "Number of Episodes: "+noOfEpisodes+"\nNumber of Seasons: "+noOfSeasons;
    }

}
public class PracticeProg1 {
    public static void main(String[] args) 
    {
        User us = new User();
        Scanner sc = new Scanner (System.in);
        //User u = new User("Mok", "year");
        
        System.out.println("Enter User Name: ");
        us.setUserName(sc.nextLine());
        System.out.println("Enter Password: ");
        us.setPassword(sc.nextLine());

        if(us.getUserName().equals("Mohak") && us.getPassword().equals("Myself"))
        {
            System.out.println("Enter Genre:  ");
            System.out.println(us.genre(sc.nextLine()));
            System.out.println("Enter Anime: ");
            System.out.println(us.animeName(sc.nextLine()));
            System.out.println(us);

            us.connect();
        }
        else
        {
            System.out.println("Invalid credentials...");
        }
        
        sc.close();
    }
    
}
