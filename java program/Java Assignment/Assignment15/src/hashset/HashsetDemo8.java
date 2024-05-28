//Write a Java program to convert a hash set to a tree set
package hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashsetDemo8 {
    public static void main(String[] args) {

        //creating Hashset
        HashSet<Integer> set =new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //Creating Treeset
        TreeSet<Integer> tree=new TreeSet<>();
        tree.addAll(set);

        //Printing Treeset And Hashset
        System.out.println("Set :-"+set);
        System.out.println("Tree :-"+tree);
    }
}
