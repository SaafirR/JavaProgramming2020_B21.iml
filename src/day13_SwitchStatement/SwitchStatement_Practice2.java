package day13_SwitchStatement;

public class SwitchStatement_Practice2 {

    public static void main(String[] args) {

        int n = 5;
        String day ="";


        switch (n) {

            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default: // for the last block you do not need break b/c it's the end
                day = "Invalid";

        }

        System.out.println(day);


    }

}