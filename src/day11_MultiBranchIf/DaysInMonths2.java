package day11_MultiBranchIf;

public class DaysInMonths2 {

    public static void main(String[] args) {
        int month = 4;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        int days = 0;

        if(has28Days) {
            days = 28;

        }else if(has30Days) {
            days = 30;


        }else{
            days = 31;


    }

    }

}
