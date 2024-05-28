// Write a Java program to convert a hash set to an array.
package hashset;

import java.lang.reflect.Array;
import java.util.HashSet;

public class HashsetDemo7 {
    public static void main(String[] args) {
        //creating Hashset
        HashSet<Integer> set =new HashSet<>();


        //Adding element in set
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        //converting Hashset To Array
        Integer[] array =new Integer[set.size()];
        set.toArray(array);

        //Printing array and Hashset
        int count=0;
        System.out.println("Printing Hashset"+set);
        System.out.print("Printing Array :-{ ");

        for (Integer a:array){
            System.out.print(a);

            if(count<array.length-1)
                System.out.print(", ");
            count++;
        }
        System.out.print(" }");
        }


    }

