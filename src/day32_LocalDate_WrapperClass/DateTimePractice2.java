package day32_LocalDate_WrapperClass;


import java.util.Scanner;

public class DateTimePractice2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE HERE:

        String result = "";

        switch (monthNum) {

            case 1 :
                result = "January";
                break;
            case 2 :
                result = "February";
                break;

            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;


            default: result = "Invalid";


        }

        System.out.println(result);

        System.out.println();

    }

}
