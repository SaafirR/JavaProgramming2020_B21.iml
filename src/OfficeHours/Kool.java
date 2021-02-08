package OfficeHours;

import java.util.Scanner;

public class Kool {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = scan.next();

        scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your gender: ");
        String gender = scan.nextLine();

        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);

        scan.close();








    }

}
