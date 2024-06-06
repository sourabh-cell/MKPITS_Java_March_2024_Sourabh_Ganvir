import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition a list of integers into even and odd
public class EvenOdd {
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

        Map<Boolean,List<Integer>> result=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        result.forEach((m,n)-> System.out.println(n));

    }
}
