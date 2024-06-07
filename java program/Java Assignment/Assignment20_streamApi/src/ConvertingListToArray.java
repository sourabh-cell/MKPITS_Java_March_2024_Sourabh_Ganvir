// **Convert a list of integers to an array.**
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingListToArray {
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

        //Converting list of integer to Array
        Integer[] array= list.toArray(Integer[]::new);

        //Printing Array
        for (Integer i:array){
            System.out.println(i);
        }


    }
}
