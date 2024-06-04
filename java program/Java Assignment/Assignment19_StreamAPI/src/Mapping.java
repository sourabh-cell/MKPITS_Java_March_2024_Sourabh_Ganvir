//Create a list of integers and use a stream to double each integer in the list.

import java.util.ArrayList;
import java.util.List;

public class Mapping {
    public static void main(String[] args) {

        //creating list of integer
        List<Integer> Intlist =new ArrayList<>(){{
            add(45);
            add(86);
            add(71);
            add(12);
            add(83);
            add(63);
            add(32);
        }};

        //double yhe number in list using lambda
        Intlist.stream().map(n->n*2).forEach(n-> System.out.println(n));
    }
}
