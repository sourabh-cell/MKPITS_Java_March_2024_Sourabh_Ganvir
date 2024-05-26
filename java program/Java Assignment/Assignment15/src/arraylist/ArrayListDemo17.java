package arraylist;//Write a Java program to empty an array list.

import java.util.ArrayList;

public class ArrayListDemo17 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);



        //printing Arraylist
        System.out.println(list);

        //Emptying Arraylist
        list.clear();

        //printing Arraylist
        System.out.println(list);



    }
}
