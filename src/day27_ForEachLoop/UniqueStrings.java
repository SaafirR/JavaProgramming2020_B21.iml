package day27_ForEachLoop;

public class UniqueStrings {

    public static void main(String[] args) {
        String [] arr = {"C#", "C#", "Java", "Python", "Python", "C++"};

        String element = arr [0]; // "c#"
        int frequency = 0;
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i].equals(element)){
                frequency++;
            }
        }

        if (frequency == 1){
            System.out.println(element+" ");
        }



    }
}
