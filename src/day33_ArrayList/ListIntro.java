package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(100);
        scores.add(200);
        scores.add(300);

        scores.add(3, 400);

        System.out.println( scores );

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");



    }

}
