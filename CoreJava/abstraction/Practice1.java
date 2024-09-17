package CoreJava.abstraction;
/*
 * Write a program to make an app MovieTicketApp
 * This class should have two instance methods and two abstract methods.
 * Give implementation to abstract methods in child class BookMyShow.
 * 
 */

 abstract class MovieTicketApp{
    public void movieGenre()
    {
        System.out.println("Select the movie genre.");
    }

    public int movieReleaseDate(int d)
    {
        System.out.println("movie release date is: "+d);
        return d;
    }

    public abstract void anime();

    public abstract void animeRelease();
 }

 class BookMyShow extends MovieTicketApp{
    public void anime()
    {
        System.out.println("Select the name of anime.");
    }

    public void animeRelease()
    {
        System.out.println("Select the anime release date.");
    }
 }
public class Practice1 {
    public static void main(String[] args)
    {
        BookMyShow b = new BookMyShow();
        System.out.println("Below is the implementation of abstract methods of MovieTicketApp class in child class BookMyShow:- ");
        b.anime();
        b.animeRelease();
        System.out.println();
        b.movieReleaseDate(25);
    }
    
}
