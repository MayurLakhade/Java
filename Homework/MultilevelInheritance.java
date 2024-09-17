// Program to demonstrate multilevel inheritance.
class University{   // Super class
    public void nameofUni()
    {
        System.out.println("RTMNU");
    }
}

class College extends University{   // class College extends class University
    // class College inherited all members of class University
    public void nameofCollege()
    {
        System.out.println("KDK");
    }
}

class Branch extends College{   // Class Branch extends class College
    /*  class Branch inherited all members of class College.
     * now class branch contains all the members which are present in both the classes College and University.
     * We will be able to access 'nameofCollege' method and 'nameofUni' from the object of class Branch. 
     *As it has inherited all the methods of class College and University.
     */
    public void nameofBranch()
    {
        System.out.println("Electrical Engineering...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) 
    {
        Branch b = new Branch();
        /*
         * As you can can see here we are able to call 'nameofUni' method and 'nameofCollege' method 
         * from the object of class Branch (Subclass).
         */
        b.nameofUni(); 
        b.nameofCollege();
        b.nameofBranch();
    }
    
}
