package day08_ShortHand_Relational;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number  = -100;

        boolean isPositive = number > 0; //if number is greater than zero, then it is positive
        boolean isNegative = number < 0; //if number is less than zero, then it is negative
        boolean isZero = number == 0; //if number is equal to zero, the it's zero

        System.out.println(number+" is a positive number: "+isPositive);
        System.out.println(number+" is a negative number: "+isNegative);
        System.out.println(number+" is zero: "+isZero);
        
        
        
        
        
        
    }
    
    
    
}

/*
     number = 100

     output:
         100 is positive number: true
         100 is negative number: false 
         100 is zero: false

 */