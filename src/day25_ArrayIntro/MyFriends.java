package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends?");
        int number = scan.nextInt();

        String [] firstName = new String[number];
        String [] lastName = new String [number];

        for (int i = 0; i < number; i++){
            System.out.println("Enter first name: ");
            String f = scan.next();
            firstName[i] = f;


            System.out.println("Enter your last name: ");
            String l = scan.next();
            lastName[i] = l;


        } // the loop is used for initializing the arrays

        scan.close();

        System.out.println("======================================");

        for (int i = 0; i < number; i++){
            System.out.println(firstName[i]+" "+lastName[i]);

        }









    }
}
