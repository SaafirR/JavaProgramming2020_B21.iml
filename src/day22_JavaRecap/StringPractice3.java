package day22_JavaRecap;

public class StringPractice3 {

    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

        sentence = sentence.replace("Canada", "United States");

        System.out.println(sentence);


        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";

        s = s.replace("Cybertek", "MIT");

        System.out.println(s);

        String r = "cava is a cool programming language, I like to learn cava at cybertek school";

        r = r.replace("ca", "Ja");

        System.out.println(r);

        System.out.println("=======================================================================================");

        String s2 = "I like to learn";

        System.out.println("Contains c#: " + s2.toLowerCase().contains("java") );
        System.out.println(s2.equalsIgnoreCase("java") ); // false

        System.out.println("=======================================================================================");
        String s3 = "Cybertek School is the best";

        System.out.println(s3.contains("cybertek"));
        System.out.println(s3.toLowerCase().contains("cybertek")); // ignore case sensitivity


        System.out.println(s3.equals("cybertek"));
        System.out.println(s3.equalsIgnoreCase("cybertek"));

        System.out.println("Java".isEmpty());
        System.out.println("".isEmpty());

        System.out.println("==========================================================================================");


        String URL = "https://www.amazon.com"; // .com, .gov, .edu

        boolean isValid = URL.startsWith("http") && (URL.endsWith("com") || URL.endsWith (".edu") || URL.endsWith(".com"));

   if (isValid){
       System.out.println("URL is valid");
   }else{
       System.out.println("Invalid");
   }

   /*

   valid emails: gmail, hotmail, yahoo, outlook

    */


    }
}
