package day07_UnaryOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {

        short a = 3000;
        long b = a; // implicit casting, automatically done

        // = 3000L

        System.out.println();

        int c = (int) b; // casting MUST be done manually
        int d = a;

        double d1 = 200.5;
        int i1 = (int) d1; //200

        System.out.println(i1);

        System.out.println("========================================================");

        long l1 = 100;
        short s1 = (short) l1; // explicit casting

        double d2 = 300;
        float f1 = (float) d1; // option enter, enter




    }
}
