package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C";

    // default and private are impossible to reach outside of class

    // public : always reachable
    // default : reachable within the same package, outside the package impossible to reach
    // private : ONLY reachable within the same class, outside the class impossible to reach

    Data (){

    }

}
