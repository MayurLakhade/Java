import java.util.ArrayList;
import java.util.Scanner;

class Bean{
    public char present_state;
    public char next_state;
    public int input;
    public int output;

    public Bean()
    {

    }

    public Bean(char present_state, char next_state, int input, int output) {
        this.present_state = present_state;
        this.next_state = next_state;
        this.input = input;
        this.output = output;
    }
    public char getPresent_state() {
        return present_state;
    }
    public void setPresent_state(char present_state) {
        this.present_state = present_state;
    }
    public char getNext_state() {
        return next_state;
    }
    public void setNext_state(char next_state) {
        this.next_state = next_state;
    }
    public int getInput() {
        return input;
    }
    public void setInput(int input) {
        this.input = input;
    }
    public int getOutput() {
        return output;
    }
    public void setOutput(int output) {
        this.output = output;
    }
}

public class Codevita1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char present;
        char next;
        String s = "";
        int a = 0;
        ArrayList<Bean> statBeans = new ArrayList<Bean>();
        Bean bean = new Bean();

        while(sc.hasNext())
        {
           /*  bean.setPresent_state(sc.next().charAt(0));
            bean.setNext_state(sc.next().charAt(0));
            bean.setInput(sc.nextInt());
            bean.setOutput(sc.nextInt());

            statBeans.add(bean);*/

            statBeans.add(new Bean(sc.next().charAt(0), sc.next().charAt(0), sc.nextInt(), sc.nextInt()));
             
        }

        for(Bean b : statBeans)
        {
            present = b.getPresent_state();
            next = b.getNext_state();

            if(present < next)
            {
                s.concat(Integer.toString(b.getInput()));
            }
            else if(next<present && b.getOutput() == 1 && next == 'a' )
            {
                a++;
                s.concat(Integer.toString(b.getInput()));
            }
        }

        System.out.println(s);

        if(a != 0)
        {
            System.out.println("Non Overlapping Sequence Detector");
        }
        else
        System.out.println("Overlapping Sequence Detector");
        
             
        
             
           

       
    }
    

    
    
}
