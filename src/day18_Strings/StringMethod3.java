package day18_Strings;

public class StringMethod3 {

    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";

        sentence = sentence.replace("Java", "Python"); // "Python is fun, Python is cool"

        System.out.println(sentence);

        String email = "CybertekSchool@gmail.com";

        System.out.println(email);

        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 student are awesome";

        System.out.println(essay);

        String  s = "I like to learn C#, C# is very cool";

                s = s.replace("C#", "Java");

        System.out.println(s);


        System.out.println("========================================================");
        String r = "Cat is friendly, Cat is cute";

        r = r.replaceFirst("Cat", "Dog");

        System.out.println(r);

        String t = "I like to learn Java, because Java is cool, Java is perfect";

        t = t.replaceFirst("Java", "Python");

        // I like to learn Java, because python is, C#

        System.out.println(t);







    }
}
