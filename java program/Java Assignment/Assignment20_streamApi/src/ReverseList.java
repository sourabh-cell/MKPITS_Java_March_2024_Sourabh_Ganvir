import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//Reverse the order of a list of strings.
public class ReverseList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("shilpa");
            add("bob");
            add("nirmal");
            add("vishal");
            add("guru");
        }};

        //printing List in Reverse Order
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
