import java.net.ServerSocket;

public class MaximumNum {

    public static void main(String[] args) {


        System.out.println(maxNum(new int[]{1,2,3,4,7,5}));


    }


    public static int maxNum (int [] numbers){

        int max = Integer.MIN_VALUE;

        for (int each : numbers){

            if (each > max){

                max = each;

            }

        }





        return max;



 }

}











