package arraylist;//Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class ArratListDemo1 {
    public static void main(String[] args) {

        //creating Array List
        ArrayList<String> colors=new ArrayList<>();

        //Adding color in list
        colors.add("violate");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("yellow");
        colors.add("Orange");
        colors.add("Red");

        //printing The ArrayList
        System.out.println(colors);
    }
}
