package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {


        ArrayList <Item> items = new ArrayList<>();

        items.addAll(Arrays.asList(
                new Item ("sanitizer",15, 30),
                new Item("mask", 10, 225),
                new Item ("watermelon", 2, 2.24)
        ));


        System.out.println(items);

        double total = 0;

        for (Item eachItem : items ) {
           total += eachItem.calcCost();
        }


        System.out.println("total = " + total);


    }

}


