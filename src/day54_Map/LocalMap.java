package day54_Map;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.util.*;

public class LocalMap {


    public static void main(String[] args) {

        String[] familyMember = {"Saafir"};
        LocalDate[] DOBFamilyMembers = {LocalDate.of(2002, 06, 05)};

        String[] classMates = {"Daniel", "Sobir"};
        LocalDate[] DOBClassMates = {LocalDate.of(1980, 9, 02), LocalDate.of(1974, 05, 12)};


        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        listOfMap.addAll(Arrays.asList(

                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()

        ));


        for (int i = 0; i < familyMember.length; i++) {
            listOfMap.get(0).put(familyMember [i] , DOBFamilyMembers [i]);
        }


        for (int i = 0; i < classMates.length; i++) {
            listOfMap.get(1).put(classMates [i] , DOBClassMates [i]);
        }


        System.out.println(listOfMap);


        System.out.println("======================");

        listOfMap.get(0);

    }

    }
