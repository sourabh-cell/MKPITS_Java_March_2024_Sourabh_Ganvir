//Write a Java program that swaps two elements in a linked list.
package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo15 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print the list
        System.out.println("The Original linked list: " + l_list);

        // swap two element
        Collections.swap(l_list,0,2);

        // print the list
        System.out.println("The New linked list: " + l_list);
    }
}
