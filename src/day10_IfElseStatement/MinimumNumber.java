package day10_IfElseStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 100;
        int n3 = 300;

        boolean n1IsMin = n1 < n2 && n1 < n3; // if n1 is less than n2 and n3, it means that n1 is the min number
        boolean n2IsMin = n2 < n1 && n2 < n3; // if n2 is less than n1 and n3, it means that n2 is the min number

        //!n3IsMin && n2 < n1; // if n3 is not min number nd n2 is less than n1

        boolean n3IsMin = n3 < n1 && n3 < n2; //if n3 is less than n1 and n2, it means that n3 is the min number

        String str = " is the minimum number";


        if(n1IsMin){
            System.out.println(n1+str);
        }

        if(n2IsMin){
            System.out.println(n2+str);
        }

        if(n3IsMin){
            System.out.println(n3+str);
        }



    }
}
