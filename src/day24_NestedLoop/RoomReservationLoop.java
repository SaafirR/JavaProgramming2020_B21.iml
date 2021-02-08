package day24_NestedLoop;

import java.util.Scanner;

public class RoomReservationLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("So you want to reserve a room?");
        String yesOrNo = scan.next();

        while (yesOrNo.equalsIgnoreCase("yes")) {

            System.out.println("Which bed type do you want?");
            String bedType = scan.next().toLowerCase();

            switch (bedType) {
                case "king":
                    totalPrice += 120;
                    break;
                case "queen":
                    totalPrice += 100;
                    break;
                case "singe":
                    totalPrice += 80;
                    break;
                default:

                    System.out.println("Invalid room type");

            }

            System.out.println("Do you want to reserve another room?");
            yesOrNo = scan.next();




        }
    }
}
