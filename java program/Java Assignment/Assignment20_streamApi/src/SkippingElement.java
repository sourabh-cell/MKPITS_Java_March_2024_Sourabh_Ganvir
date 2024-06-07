import java.util.LinkedList;
import java.util.List;

//Skip the first 2 elements in a list.
public class SkippingElement {
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

        //skipping the first two element
        list.stream().skip(2).forEach(System.out::println);
    }
}
