package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to compare two array lists.
public class ArrayListDemo13 {
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
        list1.add(11);
        list1.add(21);
        list1.add(31);
        list1.add(41);
        list1.add(51);

        //Comparing to array
        if(list1.equals(list))
         System.out.println("Equals");
    }
}
