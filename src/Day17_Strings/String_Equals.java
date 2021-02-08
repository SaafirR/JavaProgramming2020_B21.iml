package Day17_Strings;

public class String_Equals {

    public static void main(String_Char[] args) {

        String str = "jira";
        String str2 = new String("java");

        System.out.println(str == str2); // false
        System.out.println(str.equals(str2)); // true
             //  this compares the values

        System.out.println(str.equals("jira"));
    }

}
