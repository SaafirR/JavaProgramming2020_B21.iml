package day29_Methods;

public class AddElements {

    public static void addElements (int[] arr, int num){
        int [] result = new int [arr.length+1];

        for (int i = 0; i <= arr.length-1;i++){
            result [i] = arr [i];
        }

        result[result.length-1] = num;



    }
}
