package arraylist;// Write a Java program to update an array element by the given element

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //Updating Element At specified Location
        list.add(1,55);

        //printing the arraylist
        System.out.println(list);
    }
}
