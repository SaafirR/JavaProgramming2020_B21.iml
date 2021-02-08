package Day17_Strings;

import java.util.Scanner;

public class TravelTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost = 0;

        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        if(validPassport.equalsIgnoreCase("yes")){
            cost = 1000;

            System.out.println("Which country do you to go t");
            String country = input.nextLine();

            System.out.println(country);

            System.out.println("How many bags do you have");
            byte bags = input.nextByte();


            cost += (bags * 50); // cost = cost * (bag * 50)


            System.out.println("How many people are you traveling with");

            short numOfPeople = input.nextShort();
            if(numOfPeople >= 3){
                cost -= 300;  // cost = cost - 300
            }else{
                cost -= 1000;
            }




        }else{
            System.out.println();
        }









    }

}


