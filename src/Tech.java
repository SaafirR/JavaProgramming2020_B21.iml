import java.util.Scanner;

public class Tech {

    public static void main(String[] args) {

        System.out.println("               Hi my name is Tech!               ");

        System.out.println("       I can assist you with a lot of things! ");
        System.out.println("   Lets start by you telling me what your name is...");
        System.out.println();


        Scanner info = new Scanner (System.in);
        System.out.print("What's your name? :");
        String name = info.next();
        info.nextLine();


        System.out.print("Your name is: " + name + ", Right? Please enter true or false: ");
        boolean b = info.nextBoolean();
        info.nextLine();

        if (b == false){
            System.out.println("Oh I apologize, what is your name?");

            System.out.println("That's awesome, nice to meet you " + info.nextLine());

            System.out.println("Do you have any plans for today?");

            info.nextLine();

            System.out.println("Well, I hope that you have a great day today!!!");
            System.out.println();
            System.out.println("                       List                       ");
            System.out.println("                      ~~~~~~                      ");
            System.out.println();
            System.out.println("1. What are the top 5 suggested restaurants near me?");
            System.out.println();
            System.out.println("2. What is the address to the White House?");
            System.out.println();
            System.out.print("Is there anything else from this list above that I assist you with? Please ENTER a number:");



            switch (info.nextInt()) {

                case 1:
                    System.out.println("The top 5 suggestions are: ");
                    System.out.print("Local Fry, Shareef's Grille, Ruth's Chris, Taco Fiesta, and Georgia Peach !");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("The address to the White House is 1600 Pennsylvania Ave NW !");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;

            }

        }else{
            System.out.println("That's great, nice to meet you " + name + ".");

            System.out.println("Do you have any plans for today?");

            info.nextLine();

            System.out.println("Well, I hope that you have a great day today!!!");
            System.out.println();
            System.out.println("                       List                       ");
            System.out.println("                      ~~~~~~                      ");
            System.out.println();
            System.out.println("1. What are the top 5 suggested restaurants near me?");
            System.out.println();
            System.out.println("2. What is the address to the White House?");
            System.out.println();
            System.out.print("Is there anything else from this list above that I assist you with? Please ENTER a number:");


        }


        switch (info.nextInt()){

            case 1:
                System.out.println("The top 5 suggestions are: ");
                System.out.print("Local Fry, Shareef's Grille, Ruth's Chris, Taco Fiesta, and Georgia Peach !");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;
            case 2:
                System.out.println("The address to the White House is 1600 Pennsylvania Ave NW !");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                break;
        }


        info.close();


    }
}





