package Day17_Strings;

import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three letter word");
        String word = input.next();

        if(word.length() == 3 ){
            if(word.charAt(1) == 'a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Not a cool word");
            }
        }else{

            if(word.length() < 3 ){
                System.out.println("Word is too short");
            }else{
                System.out.println("Word is too long");
            }
        }



    }


}
