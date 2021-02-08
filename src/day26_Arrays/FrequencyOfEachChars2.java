package day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {

        String str = "aaabbc";

        String expectedResult = "";

        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++){
            char eachChar = str.charAt(i);
            if (eachChar == ch){
                count++;
            }
        }




    }
}
