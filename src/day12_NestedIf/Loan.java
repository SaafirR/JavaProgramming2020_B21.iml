package day12_NestedIf;

public class Loan {

    public static void main(String[] args) {

        double minimumSalary = 50000;
        int jobHistory = 1;
        int creditScore = 550;

        if(minimumSalary >= 30000){

            if(jobHistory >= 2){

                if(creditScore >= 680){
                    System.out.println("You are qualified for the loan");
                }else{
                    System.out.println("You must have at least a 680 credit score");
                }

                }else{
                    System.out.println("You must be on the job for at least 2 years");
                }


           }else {
            System.out.println("You mst have a minimum of 30k salary first");
        }





    }


}
