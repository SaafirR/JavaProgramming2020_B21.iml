package day07_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 100;
        boolean isPositive = a > 0; // verify to see if it is positive
        boolean isNegative = a < 0; // verify to see if it is negative

        System.out.println(a+ " is a positive number: "+isPositive);
        System.out.println(a+ " is a negative number: "+isNegative);

        int b = -100 - 20; // -120
        System.out.println(b);

        int c = 10 - -20; // 30
        System.out.println(c);

        System.out.println("==================================");

        int x = 100;
        ++x; //increases the value by 1, 100 + 1 = 101

        System.out.println(x);

        int y = 100;
        --y; // decreses the value by 1, 100 - 1 = 99

        System.out.println(--y);

        int z = 100;
        System.out.println(--z);







    }


}
