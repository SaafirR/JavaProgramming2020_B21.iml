package day16_scanner;

import java.util.Scanner;

public class Scanner_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter number one");
        double numberOne = input.nextDouble();

        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();

        input.close(); // Closing the scanner because we have all the inputs

        double result = 0;

        switch (operator){

            case "plus":
            case "+":
                result = numberOne + numberTwo;
                break;

            case "minus":
            case "-":
                result = numberOne - numberTwo;
                break;

            case "multiplication":
            case "*":
                result = numberOne * numberTwo;
                break;

            case "division":
            case "/":
                result = numberOne / numberTwo;
                break;

            case "remainder":
            case "%":
                result = numberOne % numberTwo;
                break;

            default:
                System.out.println(operator + " is an invalid operator");


        }

        System.out.println(numberOne + operator + numberTwo + " = " + result);




    }


}
