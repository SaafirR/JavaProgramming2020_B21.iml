package OfficeHours;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode = scan.nextInt();

        System.out.println("Enter your country name: ");
        String countryName = scan.next();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();

        System.out.println();
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Full name: "+fullName);
        System.out.println("Zipcode: "+zipcode);
        System.out.println("Country name: "+countryName);
        System.out.println("Salary: "+salary);
        System.out.println("Company name: "+companyName);
        System.out.println("Address: "+address);

        scan.close();






    }

}
