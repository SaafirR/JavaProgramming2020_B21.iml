package day13_SwitchStatement;

public class SwitchStatement_Practice {

    public static void main(String[] args) {

        int n = 5;

        switch(n) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: // for the last block you do not need break b/c it's the end
                System.out.println("Invalid");



            }

        }



}
