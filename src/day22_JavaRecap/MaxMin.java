package day22_JavaRecap;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 21478367;
        int max = -21478367;

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if( n < min){
                min = n;

            }

            if(n > max){
                max = n;
            }



        }




    }

}
