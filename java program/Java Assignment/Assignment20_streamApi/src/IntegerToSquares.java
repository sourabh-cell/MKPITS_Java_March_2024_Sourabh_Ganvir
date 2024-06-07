import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of integers to a list of their squares.
public class IntegerToSquares {
    public static void main(String[] args) {

        //Creating Linkedlist of Integer
        List<Integer> list=new LinkedList<>(){{
            add(4);
            add(3);
            add(14);
            add(9);
            add(5);
            add(6);
            add(2);
            add(8);

        }};

        //Converting list of integer to their Square
        list=list.stream().map(n->n*n).collect(Collectors.toList());

        System.out.println("List Of Integer :"+list);


    }
}
