import java.util.LinkedList;
import java.util.List;

public class ListIntegerToString {
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

        //integer representation of string
        list.stream().map(Object::toString).forEach(System.out::println);
    }
}
