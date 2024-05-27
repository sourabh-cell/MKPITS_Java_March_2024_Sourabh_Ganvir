//Write a Java program to iterate through all elements in a linked list starting at the specified position
package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        //creating Linked List
        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in list
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        //iterating through all the element
        Iterator it=list.listIterator(1);

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    }

