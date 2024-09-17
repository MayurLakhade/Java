package CoreJava.abstraction.interfaces;

interface Hotel{
    public void dining();
    public void buffet();
    /*
     * Below we are seeing the nested interface. Meaning interface which is inside of another interface.
     * 
     * We do this to group a few methods together. Any class who wants these methods will have to implement 
     * Banquet interface separately.
     */
    interface Banquet{
        public void weddingDecoration();
        public void partyDecoration();
    }
}
/*
 * In the below given class we are implementing only outer interface, hence have to give method body to only
 * those methods that are present in outer interface Hotel.
 */
class Aanandam implements Hotel{

    @Override
    public void dining() {
        // TODO Auto-generated method stub
    }

    @Override
    public void buffet() {
        // TODO Auto-generated method stub
    }



}
/*
 * In below given class Haldiram we are implementing both the outer interface and inner interface.
 * hence we need to give method body to all the methods present in both outer and inner interface.
 */

class Haldiram implements Hotel, Hotel.Banquet{

    @Override
    public void weddingDecoration() {
        // TODO Auto-generated method stub
    }

    @Override
    public void partyDecoration() {
        // TODO Auto-generated method stub
    }

    @Override
    public void dining() {
        // TODO Auto-generated method stub
    }

    @Override
    public void buffet() {
        // TODO Auto-generated method stub
    }

}
public class InterfacesDemo5 {
    public static void main(String[] args) 
    {
        
    }
    
}
