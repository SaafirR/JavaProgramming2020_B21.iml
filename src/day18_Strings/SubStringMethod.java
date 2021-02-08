package day18_Strings;

import java.util.Scanner;

public class SubStringMethod {

    public static void main(String[] args) {

        String str = "Today is Monday";
        //            012346789

        String day = str.substring(9, 14+1);

        System.out.println(day);

        String email = "saafir615@gamil.com";
        //              0123456789


        String domain = email.substring(9, 13 );

        System.out.println("Domain of the email = "+email +" is" + domain);

        String s1 = "I like movies and books";
        //          01234567

        String word1 = s1.substring(7, 13);

        System.out.println(word1);

        System.out.println("=========================================================");

        String firstName = "cYBERtek"; //Marwan

        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length() ).toLowerCase();


        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;
        System.out.println(firstName);


        System.out.println("=======================================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0, 1).toUpperCase()   +f.substring(1, f.length()-1+1).toLowerCase();

        System.out.println("First name is: " + f);

        System.out.println("Enter you last name: ");
        String lastName = scan.nextLine();

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1,  lastName.length()-1+1);

        System.out.println("Last name is: " + lastName);

        String fullName = firstName + " " +lastName;

        System.out.println("Full name is: " + fullName);







    }
}
