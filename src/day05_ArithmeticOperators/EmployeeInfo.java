package day05_ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Saafir"; //" " for texts
        String lastName = "Rabb";
        String fullName = firstName+" "+lastName;
        char gender = 'M'; //'' for single characters
        int age = 18;
        String companyName = "Capital One";
        String jobTitle = "SDET";
        double salary = 120000.0;
        boolean isFullTime = true;
        boolean isMarried = false;


        System.out.print("Employee full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print(" gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print(" age is: ");
        System.out.print(age);
        System.out.println(" Years Old");

        System.out.print(fullName);
        System.out.print(" works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print(" Job Title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print(" Salary is: $ ");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print(" is full time employeed: ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print(" is married: ");
        System.out.println(isMarried);


        /*
        declare the following variables
         write a program that can display the full info of the employee
                    ex:
                             firstName = Saafir
                             lastName = Rabb
                             gender = M
                             age = 18
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.0

                 output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false





         */

    }



}
