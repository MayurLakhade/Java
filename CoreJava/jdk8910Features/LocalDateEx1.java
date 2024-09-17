package CoreJava.jdk8910Features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

/*
 * Local date is a predefined class introduced in jdk8. 
 * This class is used to manipulate dates in a much simpler way.
 */
public class LocalDateEx1 {
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        System.out.println("Todays date: "+today);

        System.out.println("Day of week: "+today.getDayOfWeek());

        System.out.println("Day of month: "+today.getDayOfMonth());

        System.out.println("Day of year: "+today.getDayOfYear());

        LocalDate todayUS = LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println("Date: "+todayUS);

        LocalTime timeUS = LocalTime.now(ZoneId.of("America/Chicago"));
        System.out.println("Time in us: "+timeUS);

        LocalTime timeIN = LocalTime.now();
        System.out.println("Time in India: "+timeIN);

        LocalDate birthdate = LocalDate.of(2001, 05,29);

        Period age = Period.between(birthdate , today);

        System.out.println("age: "+age);
        System.out.println("day of born: "+birthdate.getDayOfWeek());

        Duration timeDiff = Duration.between(timeUS, timeIN);
        System.out.println("Time difference: "+timeDiff);
    }
    
}
