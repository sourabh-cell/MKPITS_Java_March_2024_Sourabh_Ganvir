package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to join two array list
public class ArrayListDemo15 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);


        //creating Array List of Integer
        ArrayList<Integer> list1=new ArrayList<>();

        //Adding Element in list
        list1.add(33);
        list1.add(44);
        list1.add(55);
        list1.add(41);
        list1.add(99);

        //joining to list
        list.addAll(list1);

        //printing list
        System.out.println(list);
    }
}
