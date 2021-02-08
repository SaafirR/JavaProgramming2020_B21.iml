package day30_ReturnMethods;

public class WarmUpTasks {
    public static void main(String[] args) {

        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-10);

        System.out.println("===================================");
        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};

        for (int i = 0; i <= numbers.length - 1; i++) {
            positiveNegativeZero(numbers[i]);
        }

        System.out.println("======================================");

        gradeCalculator(85);

        //positiveNegativeZero(-120);
        gradeCalculator(-120);


    }

    //task1:
    public static void positiveNegativeZero(int number) {
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(number + " is " + result);
    }

    //task2:
    public static void gradeCalculator(int score) {

        if (score >= 0 && score <= 100) {
            /*
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
             */
            System.out.println( (score>= 90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)?'D':'F' );

        } else {
            System.err.println("Invalid Score");
        }

    }

    // task3:




}
/*
1. create a function that can check if the given integer is positive, negative or zero
2. create a function that can calculate the grade of the student
3. create a function that can print out the combination of two integer arrays
4. create a function that can print a string without the duplicated characters
5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
               	output:
               		"Cybertek School"
 */

