package day15_Scanner;

import  java.util.Scanner;
//import day14_Switch_Recap.SalaryCalculator;
//If we wanted to use the SalaryCalculator class in this class

public class Scanner_Int {

    public static void main(String[] args) {

      Scanner scanner = new Scanner (System.in);

        System.out.println("Enter number one:");
        int num1 = scanner.nextInt();
        System.out.println("Enter number two:");
        long num2 = scanner.nextLong();

        System.out.println("Number one: "+num1);
        System.out.println("Number two: "+num2);
        System.out.println("The Sum is: " + (num1 * num2));

        // All the objects are print statements

    }


}
