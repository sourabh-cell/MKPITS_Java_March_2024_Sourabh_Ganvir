import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Find the second highest number in a list of integers.
public class SecondHighest {
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

        //Second largest number in the list
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //1.reversing stream
        //2.skiping 1st element
        //3.taking 1st element
        //4.taking value intead of optional


    }
}
