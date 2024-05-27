//Write a Java program to insert some elements at the specified position into a linked list.

package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo9 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color between red and green & violet color between green and black: " + l_list);
        l_list.add(1,"Yellow");
        l_list.add(3,"violate");
        // print the list
        System.out.println("The linked list:" + l_list);
    }
    }

