//Write a Java program to replace an element in a linked list.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo26 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        //printing Linkedlist
        System.out.println("Orignal list :-"+l_list);


        //replacing element from list
        l_list.add(1,"violate");

        //printing Linkedlist
        System.out.println("After replacement :-"+l_list);

    }
}
