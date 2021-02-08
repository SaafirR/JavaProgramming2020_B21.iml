package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUSACitizen == true && age >= 18 && hasCriminalBackground == false ;

        System.out.println(name+" is eligible to vote: "+isEligible);


        String name2 = "John";
        String c1 = "Canada";
        String c2 = "China";

        boolean eligible = c1 == "USA"    && c2== "USA";

        boolean eligible2 = c1 == "USA"  || c2 == "USA";



        System.out.println(name2+" is eligible to vote: "+eligible);








    }


}
