package day31_MethodOverLoading;

import java.util.Scanner;

public class MethodOverLoading3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        //WRITE YOUR CODE HERE:

        int x = 9;

        String result;

        x = (num1 > num2) ? num1 : num2;

        x  = (num1 < num2) ? num2 : num1;

        System.out.println();

    }

}
