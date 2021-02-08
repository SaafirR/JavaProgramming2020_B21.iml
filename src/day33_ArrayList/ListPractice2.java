package day33_ArrayList;

import java.util.Scanner;

public class ListPractice2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();

        if (coupons >= 10 && coupons <= 20){
            System.out.println("Number of Candies: 1");
            System.out.println("Number of Gumballs: 1");
        }else if(coupons >= 20 && coupons <= 30){
            System.out.println("Number of Candies: 2");
            System.out.println("Number of Gumballs: 1");
        }else if (coupons >= 30 && coupons <= 40){
            System.out.println("Number of Candies: 3");
            System.out.println("Number of Gumballs: 1");
        }else{
            System.out.println("Not enough coupons");
        }



    }


}
