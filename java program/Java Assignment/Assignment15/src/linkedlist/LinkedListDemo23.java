//Write a Java program to convert a linked list to an array list
package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo23 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        //creaing ArrayList
        ArrayList<String> a_list =new ArrayList<>(l_list);

        //printing Arraylist
        System.out.println(a_list);
    }
}
