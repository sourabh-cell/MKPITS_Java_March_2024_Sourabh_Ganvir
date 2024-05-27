//Write a Java program to insert the specified element at the front of a linked list.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo7 {
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
        System.out.println("Let add the Yellow color first position: " + l_list);
        l_list.addFirst("Yellow");
        // print the list
        System.out.println("The linked list:" + l_list);
    }
}
