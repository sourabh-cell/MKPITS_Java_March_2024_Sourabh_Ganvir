package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo21 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");



        // retrieve Last element of list
        System.out.println("The Last element of the list :-"+l_list.peekLast());

        // print the list
        System.out.println("The Original linked list: " + l_list);
    }
}
