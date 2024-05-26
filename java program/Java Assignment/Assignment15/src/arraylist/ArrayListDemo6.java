package arraylist;//Write a Java program to remove the third element from an array list

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //accessing Element at third Location
        list.get(3);

        //printing the arraylist
        System.out.println(list);
    }

}
