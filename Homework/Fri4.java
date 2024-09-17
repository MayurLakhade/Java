import java.util.Scanner;

public class Fri4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        String month = sc.nextLine();

        switch(month)
        {
            case "January": System.out.println("Festivals in January are: \nMakarsankranti, Lohri, Pongal, Republic day");
            break;

            case "February": System.out.println("Festivals in February are: \nMahashivratri, Basant panchami");
            break;

            case "March": System.out.println("Festivals in March are: \nHoli, Arattu");
            break;

            case "April": System.out.println("Festivals in April are: \nBaisakhi, Bihu, Chithirai");
            break;

            case "May" : System.out.println("Festivals in May are: \nNarsimha Jayanti, Buddha Purnima, Mothers day");
            break;

            case "June" : System.out.println("Festivals in June are: \nRath Yatra, Ramadan, Ganga Dussehra");
            break;

            case "July" : System.out.println("Festivals in July are: \nGuru Purnima, Amarnath Yatra, Shravana Somwar");
            break;

            case "August": System.out.println("Festivals in August are: \nRaksha Bandhan, Independence Day");
            break;

            case "September": System.out.println("Festivals in September are: \nKrishna Janmashtami, Ganesh Chaturthi");
            break;

            case "October": System.out.println("Festivals in October are: \nNavratri, Dussehra, Dhanteras");
            break;

            case "November": System.out.println("Festivals in November are: \nDiwali");
            break;

            case "December": System.out.println("Festivals in December are: \nChristmas");
            break;

            default : System.out.println("Please write in Sentence case.");
        }

    }
    
}
