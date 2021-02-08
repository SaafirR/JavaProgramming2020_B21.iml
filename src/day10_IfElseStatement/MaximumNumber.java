package day10_IfElseStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        boolean n1IsMax = n1 > n2 && n1 < n3; // if n1 is greater than  n2 & n3 , it means n1 is max number
        boolean n2IsMax = !n1IsMax && n2 > n3; // if n1 is not max, and n2 is greater than n3, n2 is max number
        boolean n3IsMax = n3 > n2 && n3 > n1;

        String str = " is the maximum number";

        if(n1IsMax){
            System.out.println(n1+" is the maximum number");
        }

        if(n2IsMax){
            System.out.println(n2+" is the maximum number");
        }

        if(n3IsMax){
            System.out.println(n3+" is the maximum number");
        }



    }
}

/*
Task02: MaximumNumber
         write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */