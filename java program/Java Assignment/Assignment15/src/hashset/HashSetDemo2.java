package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {

        //creating HashSet
        HashSet<Integer> set = new HashSet<>();

        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //iterating through all the element
        Iterator it= set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    }

