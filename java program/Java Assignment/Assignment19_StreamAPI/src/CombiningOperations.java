import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a list of integers and use a stream to filter out the even numbers, double each remaining number, and then find the sum of the doubled numbers.
public class CombiningOperations {
    public static void main(String[] args) {
        //creating list of integer
        List<Integer> Intlist =new ArrayList<>(){{
            add(45);
            add(86);
            add(71);
            add(12);
            add(83);
            add(63);
            add(32);
        }};

        //filtering odd number double it and the sum the whole list
       int sum=Intlist.stream().filter(n->n%2!=0).mapToInt(n->n*2).sum();


        System.out.println(sum);
    }
}
