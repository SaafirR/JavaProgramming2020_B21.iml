package day21_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {

    Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {

        int num = 3;
        int result = 1;
        // 3: 3 * 2 * 1
        // 4: 4 * 3 * 2 * 1
        // 5: 5 * 4 * 3 * 2 * 1

        for (int i = num;  i>= 1 ;){
            result *= i;
        }











    }
}
