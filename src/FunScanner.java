import java.util.Scanner;

public class FunScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.next();;

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Where are you from?");
        String location = scan.next();
        location += scan.nextLine();


        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Location answer is: " + location);




    }

}
