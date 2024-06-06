// **Filter out even numbers from a list of integers.

import java.util.LinkedList;
import java.util.List;

public class FilterEven {
    public static void main(String[] args) {

        //Creating Linkedlist of Integer
        List<Integer> list=new LinkedList<>(){{
            add(45);
            add(32);
            add(44);
            add(39);
            add(25);
            add(46);
            add(69);
            add(88);

        }};

        //filtering Even number
        list.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
