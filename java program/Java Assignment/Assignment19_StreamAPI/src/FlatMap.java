import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//Create a list of lists of integers and use a stream to flatten the structure (i.e., merge all the lists into one) and then calculate the sum of all the integers.
public class FlatMap {

    public static void main(String[] args) {
        //creating list of integer
        List<Integer> list1 =new ArrayList<>(){{

            add(71);
            add(6);
            add(83);

        }};

        //creating list of integer
        List<Integer> list2 =new ArrayList<>(){{
            add(45);
            add(5);
            add(32);
        }};
        //creating list of integer
        List<Integer> list3 =new ArrayList<>(){{
            add(45);
            add(5);
            add(71);

        }};

        //Creating List of List
        List<List<Integer>> list =new ArrayList<>(){{
            add(list1);
            add(list2);
            add(list3);

        }};

        //flating the list and adding all the element
        int sum=list.stream().flatMap(List::stream).mapToInt(n->n).sum();
        System.out.println(sum);
    }

}
