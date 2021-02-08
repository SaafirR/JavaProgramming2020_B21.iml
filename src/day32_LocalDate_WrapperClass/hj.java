package day32_LocalDate_WrapperClass;

import java.util.Scanner;

public class hj {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);

        System.out.println("Enter Item1 and its price:");
        String Item1 = scan.nextLine();
        Double Item1price = scan.nextDouble();

        System.out.println("Enter Item2 and its price");
        scan.nextLine();
        String Item2 = scan.nextLine();
        Double Item2price = scan.nextDouble();

        System.out.println("Enter Item3 and its price");
        scan.nextLine();
        String Item3 = scan.nextLine();
        Double Item3price = scan.nextDouble();


        String item1 = Item1;
        String item2 = Item2;
        String item3 = Item3;

        Double price1 = Item1price;
        Double price2 = Item2price;
        Double  price3 = Item3price ;
        Double totalPrice = Item1price + Item2price + Item3price;

        System.out.println();

        System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item2: "  + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3 + ", Total Price: " + totalPrice);





    }
}
