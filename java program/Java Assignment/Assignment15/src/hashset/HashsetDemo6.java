//Write a Java program to clone a hash set to another hash set.
package hashset;

import java.util.HashSet;

public class HashsetDemo6 {
    public static void main(String[] args) {

        //creating Hashset
        HashSet<Integer> set =new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //printing HashSet
        System.out.println("Orignal Hashset :-"+set);

        //creating Hashset List
        HashSet<Integer> copy_set =new HashSet<>();

        copy_set = (HashSet)set.clone();

        //printing HashSet
        System.out.println("Copy of Hashset :-"+copy_set);

    }
}
