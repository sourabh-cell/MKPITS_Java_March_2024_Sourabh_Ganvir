//Write a Java program to empty an hash set.
package hashset;

import java.util.HashSet;

public class HashsetDemo4 {
    public static void main(String[] args) {
        //creating Linked List
        HashSet<Integer> set =new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //printing The Hashset
        System.out.println("Before Removing elements :-"+set);

        //removing Elements
        set.removeAll(set);
        //printing The Hashset
        System.out.println("After Removing elements :-"+set);
    }
}
