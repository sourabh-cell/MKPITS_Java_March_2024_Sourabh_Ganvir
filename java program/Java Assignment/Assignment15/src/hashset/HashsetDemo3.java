//Write a Java program to get the number of elements in a hash set
package hashset;

import java.util.HashSet;

public class HashsetDemo3 {
    public static void main(String[] args) {
        //creating Linked List
        HashSet<Integer> set =new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //Printing no of element in hash set
        System.out.println(set.size());

    }
}
