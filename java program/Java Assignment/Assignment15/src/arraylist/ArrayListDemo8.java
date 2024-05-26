package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a Java program to sort a given array list.
public class ArrayListDemo8 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //Sorting list
        Collections.sort(list);

        //printing the arraylist
        System.out.println(list);

    }
}
