
//Write a Java program to append the specified element to the end of a linked list.
package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        //creating Linked List
        LinkedList<Integer> list =new LinkedList<>();

        //Adding element in list
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        //Appending element in last in list
        list.addLast(74);


        //printing The LinkedList
        System.out.println(list);
    }
}
