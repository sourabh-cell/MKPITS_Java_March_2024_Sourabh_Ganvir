package arraylist;//Write a Java program to search for an element in an array list

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //accessing specified Element from the list using for loop
        int element=51;
        for (Integer i:list)
        {
            if (i==element)
                System.out.println("Element found"+i);
        }


    }
}
