package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println(" " + f + l);

        String r1 = "Batch "+ 2 + 1;

        System.out.println("==================================================");

        System.out.println("Enter building number: ");
        String buildingNumber = scan.nextLine();

        System.out.println("Enter Street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter Apartment number: ");
        String apartmentNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter a city: ");
        String cityName = scan.nextLine();

        System.out.println("Enter a state: ");
        String stateName = scan.nextLine();

        System.out.println("Enter a zipcode: ");
        int zipcode = scan.nextInt();



        scan.close();


        // String buildingNumber ( next () )
        // String street ( nextLine() )
        // String apartmentNumber; ( next () )
        // String city ( nextLine () )
        // String state ( nextLine () )
        // int Zipcode

















    }


}
