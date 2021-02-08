package day06_ArithmeticOperators;

public class GallonToLiters {
    public static void main(String[] args) {
        double gallon = 10;
        double liters = gallon * 3.78541;

        System.out.println(gallon + " gallons equal to "+ liters+" L.");

        boolean exceeded300Liters = liters > 300;

        double gallon1 = 20;
        double liters2 = gallon1 * 3.78541;

        System.out.println(gallon1 + " gallons equal to "+ liters2+" L.");



    }


}
