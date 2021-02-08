package day09_IfStatement;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 1000;

        boolean even = number % 2 == 8;
        boolean odd = !even;

        System.out.println(number+" is a even number: "+even);

        System.out.println(number+" is a odd number: "+odd);

        System.out.println("===================================");

        int n = 200;

        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n+" is positive: "+isPositive);
        System.out.println(n+" is negative: "+isNegative);
        System.out.println(n+" is zero: "+isZero);

        /*

        !no ==> yes
        !yes ==> no
        !funny ==> not funny
        !notFunny ==> funny

         */


    }
}
