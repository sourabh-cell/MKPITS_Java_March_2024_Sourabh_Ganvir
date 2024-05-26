package arraylist;//Write a Java program for trimming the capacity of an array list

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo19 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>(20);

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);



        //Emptying Arraylist
        System.out.println("list size :-"+list.size());
        list.trimToSize();

        //printing Arraylist
        System.out.println(list+" Size Of List "+list.size());


    }
}
