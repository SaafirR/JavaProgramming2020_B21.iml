package day16_scanner;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

      Scanner input = new Scanner (System.in);

        System.out.println("Enter the browser type");
        String browser = input.nextLine();

       input.close();

       switch (browser){

           case "CHROME":
           case "chrome" :
               System.out.println("chrome is opening");
               break;

           case "FIREFOX":
           case "firefox" :
               System.out.println("firefox is opening");
               break;

           case "OPERA":
           case "opera" :
               System.out.println("opera is opening");
               break;

           case "SAFARI" :
           case "safari" :
               System.out.println("safari is opening");
               break;

           case "INTERNET EXPLORER" :
           case "internet explorer" :
               System.out.println("internet explorer is opening");
               break;

           default:
               System.out.println(browser + " is not valid");


       }







    }


}
