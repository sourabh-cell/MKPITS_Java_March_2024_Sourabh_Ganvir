package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to shuffle elements in an array list.
public class ArrayListDemo10 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //Shuffling list
        Collections.shuffle(list);

        //printing the arraylist
        System.out.println(list);

    }

}
