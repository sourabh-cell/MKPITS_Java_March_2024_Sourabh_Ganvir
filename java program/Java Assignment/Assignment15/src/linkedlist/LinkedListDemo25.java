//Write a Java program to check if a linked list is empty or not
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo25 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        //checking if linklist empty or not
        if (l_list.isEmpty())
            System.out.println(" list is Empty");
        else
            System.out.println(" list is Not Empty");
    }
}
