import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//**Find the maximum number in a list of integers.
public class MaxNumber {
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

        //finding max number using method reference
        Optional<Integer> max=list.stream().max(Integer::compareTo);
        System.out.println(max);

    }
}
