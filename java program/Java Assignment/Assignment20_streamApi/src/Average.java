import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Find the average of a list of integers
public class Average {
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

        //Average of list
       Double d= list.stream().collect(Collectors.averagingInt(n->n));
        System.out.println(d);
    }
}
