package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

       String [] countryNames = {"Andorra","United Arab Emirates","Turkey"};

        ArrayList<String>countries= new ArrayList<>(Arrays.asList(countryNames));
        System.out.println(countries);

        countries.removeIf(p -> p.length() >= 10);

        System.out.println(countries);





    }

}


