package arraylist;//Write a Java program to clone an array list to another array list.

import java.util.ArrayList;

public class ArrayListDemo16 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //creating empty Array List of Integer
        ArrayList<Integer> copy_list=new ArrayList<>();


        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //copying array list in empty array list
        copy_list=(ArrayList)list.clone();

        //printing the copy Array list
        System.out.println(copy_list);
    }
}
