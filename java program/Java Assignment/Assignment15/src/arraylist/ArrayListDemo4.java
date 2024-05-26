package arraylist;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class ArrayListDemo4 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //accessing Element at specified location
        int element=list.get(2);
        System.out.println(element);
    }
}
