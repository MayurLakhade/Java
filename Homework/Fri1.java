import java.util.Scanner;

class Book{
    private int id;
    private String name;
    private String author;
    private String category;
    private int price;

    public Book()
    {

    }

    public Book(int id , String name , String author , String category, int price)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public Book(int id , String name , int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return author;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getCategory()
    {
        return category;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "\nBook id: "+id+"\nBook Name: "+name+"\nBook Author: "+author+"\nBook Category: "+category+"\nBook Price: "+price;
    }
}

public class Fri1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Book b = new Book(11, "Unicorn Success", "Sharma", "Startup", 500);
        System.out.println(b);

        Book bs = new Book();
        System.out.println("\nEnter Book Id: ");
        bs.setId(sc.nextInt());
        
        System.out.println("Enter Book Name: ");
        bs.setName(sc.next());

        System.out.println("Enter Book price: ");
        bs.setPrice(sc.nextInt());

        System.out.println(bs);

    }
    
}
