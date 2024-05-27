//Write a Java program to check if a particular element exists in a linked list.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo22 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");



        // checking list contain
        System.out.println("Checking The Red color available in list ");
        if (l_list.contains("Red"))
            System.out.println("Color available in list ");


    }
}
