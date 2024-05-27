//Write a Java program to join two linked lists.
package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo17 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list1 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list1.add("Red");
        l_list1.add("Green");
        l_list1.add("Black");
        l_list1.add("Pink");
        l_list1.add("orange");

        LinkedList<String> l_list2 = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list2.add("Red");
        l_list2.add("Green");
        l_list2.add("Black");
        l_list2.add("Pink");
        l_list2.add("orange");

        LinkedList<String> l_list3 = new LinkedList<String>();

        //joining list1 and list2 in list3
        l_list3.addAll(l_list1);
        l_list3.addAll(l_list2);

        // print the list
        System.out.println("The New linked list: " + l_list3);

    }
}
