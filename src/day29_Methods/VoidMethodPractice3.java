package day29_Methods;

public class VoidMethodPractice3 {

    public static void main(String[] args) {

        eligibleToVote("John", "USA", 45,true);

        eligibleToVote("Daniel","Japan",9,true);
    }

    public static void eligibleToVote (String name, String citizenShip, int age, boolean isAlive){
        if (citizenShip.equalsIgnoreCase("USA")){
            if (age >=18){
                System.out.println("You are eligible to vote!");
            }else{
                System.err.println("You must be at at least 18 years old in order to vote");
            }

        }else{
            System.err.println("You must come back to life in order to vote!");
        }
    }

}
