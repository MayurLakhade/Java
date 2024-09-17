import java.util.Scanner;

class Trainer{
    int trainerId;
    String trainerName;
    String subject;
    String officeLocation;

    public void setTrainerId(int trainerId)
    {
        this.trainerId = trainerId;
    }

    public int getTrainerId()
    {
        return trainerId;
    }

    public void setTrainerName(String trainerName)
    {
        this.trainerName = trainerName;
    }

    public String getTrainerName()
    {
        return trainerName;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setOfficeLocation(String officeLocation)
    {
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation()
    {
        return officeLocation;
    }

    public String toString()
    {
        return "\nTrainerId: "+trainerId+"\nTrainerName: "+trainerName+"\nSubject: "+subject+"\nOfficeLocation: "+officeLocation;
    }
}

public class Que1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Trainer t = new Trainer();
        System.out.println("Enter trainer Id: ");
        t.setTrainerId(sc.nextInt());

        System.out.println("Enter trainer name: ");
        t.setTrainerName(sc.next());

        System.out.println("Enter Subject: ");
        t.setSubject(sc.next());
         
        System.out.println("Enter Office Location: : ");
        t.setOfficeLocation(sc.next());

        System.out.println(t);
    }
    
}
