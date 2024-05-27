// Write a Java program to compare two linked lists.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo24 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // create an empty linked list
        LinkedList<String> l_list1 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list1.add("Red");
        l_list1.add("Green");
        l_list1.add("Black");
        l_list1.add("Pink");
        l_list1.add("orange");

        //Comparint to linklist
        if (l_list.equals(l_list1))
            System.out.println("List 1 and List 2 are equal");

    }
}
