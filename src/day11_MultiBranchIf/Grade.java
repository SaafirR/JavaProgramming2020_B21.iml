package day11_MultiBranchIf;

public class Grade {

    public static void main(String[] args) {
        double score = 50.5;

        String grade = " ";

        if (score >= 90) { // becomes false when score < 90
            grade = "A";
        } else if (score >= 80 && score < 90) { // becomes false when score < 80
            grade = "B";
        } else if (score >= 70 && score < 80) { // becomes false when score < 70
            grade = "C";
        } else if (score >= 60 && score < 70) {// becomes false when score <60

        } else {
            grade = "D";


            System.out.println("Your grade is: " + grade);


            System.out.println("==============================================");


            char grade2 = ' ';

            if (score >= 90) { // becomes false when score < 90
                grade2 = 'A';

            } else if (score >= 80){
                grade2 = 'B'; // becomes false when score is < 80

            }else if (score >= 70) {  // becomes false score is < 70
                grade2 = 'C';

            }else if(score <= 60) { // becomes false when score < 60
                grade2 = 'D';

            }else if(score <= 50) { // becomes false when score < 50
                grade2 = 'F';









            }
        }
    }}