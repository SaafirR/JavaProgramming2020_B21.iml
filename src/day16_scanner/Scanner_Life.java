package day16_scanner;

import java.util.Scanner;

public class Scanner_Life {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you full name");
        String fullName = input.next();

        input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Are you employed? True or false");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){

            System.out.println("What is your salary");
            salary = input.nextDouble();
        }

        System.out.println("Your full name: " + fullName + " " + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary " + salary);
    }

}
