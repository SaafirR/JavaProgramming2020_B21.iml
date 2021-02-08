package day18_Strings;

import java.util.Scanner;

public class StringPractices2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();
        product = product.replace(" ", " ").toLowerCase();

        switch (product){

            case "macbook":
                System.out.println("Which model macbook would you like?");
                String model = scan.nextLine();


        }





    }

}
