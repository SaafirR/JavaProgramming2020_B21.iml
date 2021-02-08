package Day17_Strings;

import java.util.Scanner;

public class Scanner_Review2 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String product = input.nextLine();

        System.out.println("Enter the product name");
        double price = input.nextDouble();

        System.out.println("Enter the ");
        int quantity = input.nextInt();

        input.nextLine(); // the enter from the above will be absorbed

        System.out.println("Enter their full name");
        String fullName = input.nextLine();

        System.out.println(product);
        System.out.println(price);
        System.out.println();

        System.out.println(fullName + " your order for " + quantity + " " + product + " has been placed. Your total is " );






    }

}



