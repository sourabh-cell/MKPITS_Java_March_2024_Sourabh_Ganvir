package arraylist;

import java.util.ArrayList;

//Write a Java program to print all the elements of an ArrayList using the elements' position.
public class ArrayListDemo22 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>(20);

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //printing list according to location
        for (int i = 0; i < list.size(); i++) {
            System.out.println("location :-"+i+" Value"+list.get(i));
        }


    }

}
