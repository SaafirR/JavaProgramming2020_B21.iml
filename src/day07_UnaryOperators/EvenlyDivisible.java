package day07_UnaryOperators;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        int remainderOf2 = number % 2;
        boolean evenlyDivisbleby2 = remainderOf2 < 1;


        System.out.println(remainderOf2);

        // when the number is or greater than 1, not evenly divisible
        // when the number is less than 1, evenly divisible

        System.out.println(number+" is evenly divisible by 2: "+evenlyDivisbleby2);

        int remainderOf3 = number % 3;
        boolean evenlyDivisbleby3 = remainderOf3 < 1;

        System.out.println(number+ " is evenly divisible by 3: "+evenlyDivisbleby3);

        int remaindeOf5 = number % 5;
        boolean evenlyDivisbleby5 = remaindeOf5 < 1;

        System.out.println(number+ " is evenly divisible by 5: "+evenlyDivisbleby5);

    }

}

/*
 2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
 */