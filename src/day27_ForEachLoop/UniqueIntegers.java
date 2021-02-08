package day27_ForEachLoop;

public class UniqueIntegers {

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4};
        //            1 2 3 4 5 6

        for (int j = 0; j <= arr.length; j++){ // i: 0 1 2 3 4 5 6

        }

        int element = arr[0];
        int frequency = 0; // frequency of element

        for (int i = 0; i <= arr.length; i++){ // i: 0 1 2 3 4 5 6
            if (arr[i] == element){
                frequency++;
            }
        } // for finding the frequency of one element, by comparing it with each elements of array

        if (frequency == 1){
            System.out.println(element+" ");
        }





    }
}

/*

1. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4

 */