//Write a Java program to remove the first and last elements from a linked list.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo13 {
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

        // Remove the first element
        l_list.removeFirst();


        // Remove the last element
         l_list.removeLast();

        // print the list
        System.out.println("The New linked list: " + l_list);
    }
}
