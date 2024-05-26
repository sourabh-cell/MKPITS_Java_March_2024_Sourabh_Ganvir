package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to increase an array list size
public class ArrayListDemo20 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>(20);

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //printing list size
        System.out.println("list Size before :-"+list.size());

        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //printing list size
        System.out.println("list Size after :-"+list.size());

    }
}
