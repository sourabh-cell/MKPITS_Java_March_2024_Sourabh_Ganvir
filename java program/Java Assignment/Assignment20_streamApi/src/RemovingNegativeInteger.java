import java.util.LinkedList;
import java.util.List;

//Filter out negative numbers from a list of integers.
public class RemovingNegativeInteger {
    public static void main(String[] args) {

        //Creating Linkedlist of Integer
        List<Integer> list=new LinkedList<>(){{
            add(-45);
            add(32);
            add(-44);
            add(39);
            add(25);
            add(-46);
            add(69);
            add(-88);

        }};

        //removing Negative number from list
        list.stream().filter(n->n>0).forEach(System.out::println);

    }
}
