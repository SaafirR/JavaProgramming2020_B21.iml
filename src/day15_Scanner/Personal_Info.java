package day15_Scanner;

import java.util.Scanner;

public class Personal_Info {

    public static void main(String[] args) {


        Scanner info = new Scanner (System.in);

        System.out.println("Please enter your age");
        byte age = info.nextByte();

        System.out.println("Please enter you favorite number");
        long favNum = info.nextLong();

        System.out.println("Are you a student? Enter true or false");
        boolean isStudent = info.nextBoolean();

        System.out.println("Age: "+age);
        System.out.println("Favorite number: "+favNum);
        System.out.println("Is a student: "+isStudent);

        if(isStudent){
            System.out.println("Great, you are a student!");
        }else{
            System.out.println("Oh okay, you are not a student");
        }





    }

}
