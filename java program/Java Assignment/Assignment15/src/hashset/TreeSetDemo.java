//Write a Java program to find numbers less than 7 in a tree set.
package hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        //creating Linked List
        TreeSet<Integer> set =new TreeSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(5);
        set.add(9);
        set.add(2);
        set.add(8);
        set.add(3);

        System.out.println("Printing The Set :-"+set);

        System.out.print("Printing the number less than 7 in Treeset :-");
        for (Integer i:set){
            if (i<7){
                System.out.print(i+"  ");
            }
        }
    }
}
