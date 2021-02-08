package day09_IfStatement;

import javax.jws.soap.SOAPBinding;

public class IfStatementPractice {

    public static void main(String[] args) {

        boolean isPandemic = false;

        if (isPandemic) {
            System.out.println("wear mask");
            System.out.println("buy more toilet paper");
            System.out.println("stay at home");
        }


        if (!isPandemic) {
            System.out.println("be free");

        }

        System.out.println("================================");

        String name = "David";
        int age = 20;
        boolean isUSCitizen = false;

        boolean eligible = isUSCitizen && age >= 18;

        if (eligible) {
            System.out.println(name + " is eligible to vote");

            if (eligible) {
                System.out.println(name + " is eligible to vote");
            }
            if (eligible) {
                System.out.println(name + " is not eligible to vote");

            }

        }

    }
}
