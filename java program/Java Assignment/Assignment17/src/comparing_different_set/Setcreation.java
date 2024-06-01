package comparing_different_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setcreation {
    HashSet<Integer> hashSet=new HashSet<>();
    LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
    TreeSet<Integer> treeSet=new TreeSet<>();

    public void addHashset(Integer arr[])
    {
        long star_time=System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        long end_time=System.nanoTime();
        long result = end_time-star_time;
        System.out.println("Total time taken for adding element in HashSet :-"+result+" NanoSecond");
    }

    public void addLinkedHashset(Integer arr[])
    {
        long star_time=System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            linkedHashSet.add(arr[i]);
        }
        long end_time=System.nanoTime();
        long result = end_time-star_time;
        System.out.println("Total time taken for adding element in LinkedHashset :-"+result+" NanoSecond");
    }

    public void addTreeset(Integer arr[])
    {
        long star_time=System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }
        long end_time=System.nanoTime();
        long result = end_time-star_time;
        System.out.println("Total time taken for adding element in Treeset :-"+result+" NanoSecond");
    }

    public void displayLinkedHashset()
    {
        long start_time=System.nanoTime();
        System.out.println("LinkedHashset :-");
        for (Integer l:linkedHashSet)
        {
            System.out.println(l);
        }
        long end_time=System.nanoTime();
        long result = end_time-start_time;
        System.out.println("Total time taken for retrieving element in LinkedHashset :-"+result+" NanoSecond");
    }

    public void displayTreeset()
    {
        long start_time=System.nanoTime();
        System.out.println("Treeset :-");
        for (Integer t:treeSet)
        {
            System.out.println(t);
        }
        long end_time=System.nanoTime();
        long result = end_time-start_time;
        System.out.println("Total time taken for reiteiving element in Treeset :-"+result+" NanoSecond");
    }

    public void displayHashset()
    {
        long start_time=System.nanoTime();
        System.out.println("Hashset :-");
        for (Integer h:hashSet)
        {
            System.out.println(h);
        }
        long end_time=System.nanoTime();
        long result = end_time-start_time;
        System.out.println("Total time taken for Reitreiving element in Hashset :-"+result+" NanoSecond");
    }

}
