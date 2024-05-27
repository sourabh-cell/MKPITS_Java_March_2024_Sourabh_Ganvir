package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo6 {
    public static void main(String[] args) {
        //creating Linked List
        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in list
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        //adding element first and last
        list.addFirst(22);
        list.addLast(45);

        //printing linkedlist
        System.out.println(list);

    }
}
