import java.util.LinkedList;
import java.util.List;

//Get a list of unique numbers from a list with duplicates
public class UniqueNumberFromList {
    public static void main(String[] args) {
        //Creating Linkedlist of Integer
        List<Integer> list=new LinkedList<>(){{
            add(45);
            add(32);
            add(45);
            add(39);
            add(32);
            add(46);
            add(39);
            add(88);

        }};

        //Unique number from dulicate list using distinct() method
        list.stream().distinct().forEach(System.out::println);
    }
}
