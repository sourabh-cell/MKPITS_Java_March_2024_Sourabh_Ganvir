package arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to reverse elements in an array list
public class ArrayListDemo11 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //printing the arraylist
        System.out.println("Before reverse");
        System.out.println(list);

        //Reversing list
        Collections.reverse(list);

        //printing the arraylist in reverse
        System.out.println("After reverse");
        System.out.println(list);


    }
}
