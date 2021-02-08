package day11_MultiBranchIf;

public class TernaryPractice {

    public static void main(String[] args) {
        int n = 100;
        String result1 = "";

        if (n % 2 == 0) {
            result1 = "Even";
        } else {
            result1 = "Odd";
        }

        System.out.println(result1);

        System.out.println("==============================================");

        String result2 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result2);

        System.out.println("===============================================");

        int age = 25;
        String citizenship = "USA";


        System.out.println("===============================================");

        //Task #1:

        int n1 = 100;
        int n2 = 300;


        if (n1 > n2) {
            System.out.println("n1 is the maximum number");
        } else if (n2 > n1) {
            System.out.println("n2 is the maximum number");


        //Tsk #2:

        int n3 = 700;
        int n4 = 1000;

        if(n3 < n4){
            System.out.println("n3 is the minimum number");
        }else if (n4 < n3)
            System.out.println("n4 is the minimum number");




        int max2 = (n1 > n2) ? n1 : n2;
            System.out.println("Max number in Tenary: "+max2);








        }

    }
}
