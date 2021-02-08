package Day17_Strings;

import java.util.Scanner;

public class Scanner_Review {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a umber from 1 - 10");
        byte num = input.nextByte();

        if (num > 0 && num < 11) {

            System.out.println("Can you enter that number");
            String word = input.next(); // Accept one word


            boolean areMatching = false;


            switch (word) {

                case "one":
                    areMatching = (num == 1);
                    break;

                case "two":
                    areMatching = (num == 2);
                    break;

                case "three":
                    areMatching = (num == 3);
                    break;


            }


            if (areMatching) {
                System.out.println("Number: " + num);
                System.out.println("Word: " + word);
            }

        } else {
            System.out.println(num + " was not between 1 - 10");
        }

    }
}

















