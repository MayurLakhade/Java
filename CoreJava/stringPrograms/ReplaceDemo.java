package CoreJava.stringPrograms;

public class ReplaceDemo {

    public void dis(char a , char b)
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }

    public static void main(String[] args) 
    {
        String word = "Cook Book";

        String word2 = word.replace('o','e');
        System.out.println("word: "+word);
        System.out.println("word2: "+word2);

        ReplaceDemo r = new ReplaceDemo();
        r.dis('c', 'k');

        String word3 = word.replace("Cook" , "Computer"); // Ex. of method overloading, same name different behaviour.
        System.out.println("Word3: "+word3);

        String message = "the boy is playing cricket. The dog is seating near the boy.";
        String message2 = message.replace("boy" , "girl");
        String message3 = message.replaceFirst("boy" , "girl");

        System.out.println("Original message: "+message);
        System.out.println("Message2: "+message2);
        System.out.println("message3: "+message3);
    }
    
}
