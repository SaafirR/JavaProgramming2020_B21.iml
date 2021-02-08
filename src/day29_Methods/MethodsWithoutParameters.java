package day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Saafir");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();


    }


    public static void printHello5Times() {

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello");
        }
    }
}