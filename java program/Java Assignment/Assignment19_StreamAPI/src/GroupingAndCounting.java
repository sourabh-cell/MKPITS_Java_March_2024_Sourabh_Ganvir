import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Create a list of strings and use a stream to group them by their length, and then count the number of strings in each group.
public class GroupingAndCounting {
    public static void main(String[] args) {

        //creating the string list
        List<String> Strlist =new ArrayList<>(){{
            add("Akshay");
            add("Sourabh");
            add("Gautam");
            add("Pancham");
            add("Vijay");
            add("Bunty");
            add("Rajat");
        }};


        //grouping string by their length and counting each group
      Map<Integer,Long> groupbyLength= Strlist.stream().collect(Collectors.groupingBy(n->n.length(),Collectors.counting()));
        System.out.println(groupbyLength);

    }
}
