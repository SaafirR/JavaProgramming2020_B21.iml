package day05_ArithmeticOperators;

public class EmployeeInfo_Concatenation {
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

        System.out.println("Employee full name is: "+fullName);
        System.out.println(fullName+ "'s gender is: "+gender );
        System.out.println(fullName+ "'s age is: "+age+" years old");
        System.out.println(fullName+ " works at: "+companyName);
        System.out.println(fullName+ "'s job title is: "+jobTitle);
        System.out.println(fullName+ "'s salary is: $ "+salary);




    }




}

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
