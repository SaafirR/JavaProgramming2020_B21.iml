package day39_StaticBlock;

import static library.Data.*;
import static library.Data.*;

import static library.Data.*;

import static library.ArraysUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlocks.company );
        System.out.println(StaticBlocks.employee1);
        System.out.println(StaticBlocks.b);
        System.out.println(StaticBlocks.isEmployeed);

        StaticBlocks.company = "Bank Of America";

        System.out.println(StaticBlocks.company );

        System.out.println("=====================================================");

        //System.out.println( data1 );
        //System.out.println( data2 );

        //method1();
       // method2();

        int[] arr = {1,2,3,4,5,6};
        int max = max(arr);
        int min = min(arr);



    }

}
