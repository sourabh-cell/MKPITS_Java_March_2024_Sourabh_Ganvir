import java.util.LinkedList;
import java.util.List;

//Find the sum of all numbers in a list.
public class ListSum {
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

        //Adding list element using lambda expression
        int sum =list.stream().mapToInt(n->n).sum();
        System.out.println(sum);
    }
}
