public class RemoveDuplicate {

    public static void main(String[] args) {

        System.out.println(removeDup("lovvve"));


    }


    public static String removeDup (String word){

        String result = "";

        for (int i = 0; i < word.length(); i++) {


            if (!result.contains("" + word.charAt(i))){

                result += "" + word.charAt(i);

            }

        }
        return result;


    }
}