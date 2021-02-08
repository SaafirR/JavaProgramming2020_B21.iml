package day25_ArrayIntro;

public class RemoveUniqueCharacters {

    public static void main(String[] args) {

        String str = "abcabd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);
                if ((eachCharacter) == ch) {
                    count++;
                }
            }

            if (count > 1) { // count > 1 && !result.contains (""+ch)
                result += ch;
            }

            System.out.println();



        }
    }
}
