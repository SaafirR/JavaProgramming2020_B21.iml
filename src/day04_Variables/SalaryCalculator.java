package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // salary: 100000, taxRate: 0.28

        int salary = 100000; // whole number
        double taxRate = 0.28; // decimal number


        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your total tax will be: ");
        System.out.println(totalTax);

        System.out.println("Your salary after tax will be");
        System.out.println(salaryAfterTax);



    }


}
