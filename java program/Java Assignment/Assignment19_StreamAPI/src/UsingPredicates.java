import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of integers and use a stream to filter out numbers greater than 10 using a custom predicate.
public class UsingPredicates {
    public static void main(String[] args) {
        //creating list of integer
        List<Integer> Intlist =new ArrayList<>(){{
            add(45);
            add(5);
            add(71);
            add(6);
            add(83);
            add(4);
            add(32);
        }};

        //removing element which is greater than 10
        List<Integer> l1=Intlist.stream().filter(n->n<10).collect(Collectors.toList());
        System.out.println(l1);
    }

}
