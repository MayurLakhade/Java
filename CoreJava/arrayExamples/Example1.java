package CoreJava.arrayExamples;

public class Example1 {
    public static void main(String[] args) 
    {
        /*
         * Array is an object of fixed size used to store a group of objects or values of the
         * same data type.
         */
        /*
         * Points to remember:-
         * 1) Size is fixed. We cannot add more than size at runtime.
         * 2) Array accept all data of the same datatype.
         * 3) All members have indexes starting from 0 to length-1.
         * 4) We add and retrive members by using indexes.
         */
        int [] allRollNo = new int [5];

        allRollNo[0] = 11;
        allRollNo[1] = 12;
        allRollNo[2] = 13;
        allRollNo[3] = 14;
        allRollNo[4] = 15;

        for(int i = 0 ; i < allRollNo.length ; i++)
        {
            System.out.println(allRollNo[i]);
        }

      /*   for(int j : allRollNo)
        {
            System.out.println(j);
        }*/

    }
    
}
