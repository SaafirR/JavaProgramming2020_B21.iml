package day14_Switch_Recap;

import javax.jws.soap.SOAPBinding;

public class If_Practice {

    public static void main(String[] args) {

        // int if & else: 2 options
        int n = 10000;

        if (n % 2 != 0) {
            System.out.println(n + " is odd number");
        } else {
            System.out.println(n + " is even number");
        }

        int age = 14;
        if (age >= 18) {
            System.out.println("You are eligible to get license");
        } else {
            System.out.println("you are not eligible to get license");
        }

        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You passed the class");
        } else {
            System.out.println("You did not pass the class");
        }

        // else if: 3 or more options


        System.out.println("============================================================");


        int n1 = 100;
        int n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + " is grater than n2 " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than " + n1);
        } else {
            System.out.println(n1 + " is equal to " + n2);
        }

        int num = 1; // 1 ~ 7

        if (num == 1) {
            System.out.println("Today is Monday");
        } else if (num == 2){
            System.out.println("Today is Tuesday");
        }else if(num == 3){
            System.out.println("Today is Wednesday");
        }else if(num == 4) {
            System.out.println("Today is Thursday");
        }else if(num == 5){
            System.out.println("Today is Fun day");
        }else if(num == 6){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is Sunday");
        }

        // without curly braces, the block can contain one statement ONLY

        System.out.println("============================================================");


        int Age = 35;
        if(Age < 21){
            System.out.println("Teenager");
        }else if(Age >= 21 && Age <= 55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }


        System.out.println("============================================================");

        int AGE = -2;
        if(AGE >= 1 && AGE <= 100) {

            if(AGE < 21){
                System.out.println("Teenager");
            }else if(AGE <= 21 && AGE <= 55){
                System.out.println("Senior");
            }

        }else{
            System.out.println("Invalid Age");
        }








        }

}
