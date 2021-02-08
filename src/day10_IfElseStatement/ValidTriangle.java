package day10_IfElseStatement;

public class ValidTriangle {

    public static void main(String[] args) {
        double angle1 = 60;
        double angle2 = 30;
        double angle3 = 90;

        boolean isValid = (angle1+angle2+angle3) == 100;
                         // if sum of three angles equal tp 180, then its a valid triangle ==> true
                         // otherwise ==> false

        if(isValid){
            System.out.println(" Its a valid triangle: ");
        }

        if(!isValid){
            System.out.println(" It's not a valid triangle: ");
        }
    }
}
