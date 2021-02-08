package day09_IfStatement;

import sun.lwawt.macosx.CSystemTray;

public class OddEven {

    public static void main(String[] args) {
        int number = 200;

        boolean even = number %2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is a even number");
        }


        if (!even) {
            System.out.println(number+" is a odd number");
        }
    }

}

