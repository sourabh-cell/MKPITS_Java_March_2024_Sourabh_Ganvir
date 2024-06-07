//Create a comma-separated string from a list of integers
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class CommaSeperatedStringOfInteger {
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

        String str=list.stream().collect(Collectors.joining(","));
        System.out.println(str);
    }
}
