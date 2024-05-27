//Write a Java program to iterate through all elements in a linked list.
package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {


        //creating Linked List
        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in list
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        //iterating through all the element
        Iterator it=list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}