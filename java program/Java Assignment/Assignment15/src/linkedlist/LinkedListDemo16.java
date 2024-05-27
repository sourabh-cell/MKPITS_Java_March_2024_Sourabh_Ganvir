//Write a Java program to shuffle elements in a linked list.
package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo16 {
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

        // shuffle the element of list
         Collections.shuffle(l_list);

        // print the list
        System.out.println("The New linked list: " + l_list);
    }
}
