//Write a Java program to test if a hash set is empty or not
package hashset;

import java.util.HashSet;

public class HashsetDemo5 {
    public static void main(String[] args) {

        //creating Linked List
        HashSet<Integer> set =new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        if (set.isEmpty())
            System.out.println("Hashset is Empty");
        else
            System.out.println("Hashset is not empty");
    }
}
