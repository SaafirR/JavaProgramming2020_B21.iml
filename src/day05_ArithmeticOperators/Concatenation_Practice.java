package day05_ArithmeticOperators;

public class Concatenation_Practice {
    public static void main(String[] args) {

        int houseNumber = 3813;
        String streetName = "Gwynn Oak Ave";
        String cityName = "Baltimore";
        String state = "MD";
        int zipcode = 21207;

        String fullAddress = houseNumber+" "+ streetName+" "+ cityName+", "+ state+", "+ zipcode;

        System.out.println(fullAddress);



        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "red";

        String carInfo = year+" "+ brand+" "+ model+", "+ mileage+" miles, "+ color+","+" $"+ price;
        System.out.println(carInfo);







    }

}
