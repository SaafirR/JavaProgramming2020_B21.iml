package day13_SwitchStatement;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        int month = 11; // 1 ~ 12

        boolean has28Or29Days = month == 2; // February (2nd month in the year)
        boolean has30Days = month == 4 | month == 6 | month == 9 | month == 11;

        String result = "";

        if (month > 0 && month < 13) { // 1 ~ 12, if the months is valid

            if (has28Or29Days) { // leap year
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }

            } else if (has30Days) { // for April, June, September, November
                result = "30 days";
            } else { // for January, March, May, July, August, October, December
                result = "31 days";
            }


        } else { //if the months are invalid
            result = "Invalid Month";
        }

        System.out.println(result);


    }

}
/*
1. write a program that can find the number of days in a month
                    Note: MUST USE NESTED IF

 */