package day18_Strings;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cybertek";

        
        String str2 = "Cybetek";
        
        str2 = str2 + "School";

        System.out.println(str2);

        System.out.println("bank of america");
        
        String name = "bank of America";
        
        name = name.toUpperCase(); // "BANK OF AMERICA"

        System.out.println("name = " + name);
        
        name = name.toLowerCase(); // "bank of america"

        System.out.println("name = " + name);


        System.out.println("=============================================");


        String t1 = "            Hello";
               t1 = t1. trim(); // "Hello"

        System.out.println(t1);

        String t2 = "Hello         Everyone";
               t2 = t2.trim();

        System.out.println(t2);

        System.out.println("=============================================");
        Scanner scan = new Scanner (System.in);
        String firstName =  scan.next();
              firstName = firstName.trim();

        String lastName = scan.nextLine();
              lastName = lastName.trim();

        System.out.println("First name is: "+firstName);

        System.out.println("Last name is: "+lastName);








        

        
    }
}
