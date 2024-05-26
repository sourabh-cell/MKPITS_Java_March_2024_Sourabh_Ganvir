package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to extract a portion of an array list.
public class ArrayListDemo12 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();



        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);



        List<Integer> sublist=list.subList(0,3);


        //printing the sublist of arraylist

        System.out.println(sublist);


    }
}
