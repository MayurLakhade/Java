package CoreJava.jdk8910Features;
/*
 * var keyword is used to create local variables. We can store any type of data 
 * in var type variables, as shown below.
 * 
 * Rules:-
 * 1) We cannot make instance variables using var keyword.
 * 2) we can use it only within a local scope.
 * 3) We cannot use var to declare return type or parameters of a method.
 * 4) if we want to change the value of the var variable then we should change with same type.
 * 5) Variables with type var have to be initialized while creating.
 * 6) var datatypes can be used for making reference variables of any class object also.
 */
public class VarKeywordDemo {
    public void dis()
    {
        System.out.println("This is dis method.");
    }
    public static void main(String[] args) 
    {
        var num = 55;
        var name = "Mok";
        var marks = 55.22;
        var fresh = true;
        var ch = '#';

        //num = "HEllo"; :- we cannot change type of the data.
        num = 44; // We can change the value of data.
        var a = 445;

        var obj = new VarKeywordDemo();
        obj.dis();

    }
    
}
