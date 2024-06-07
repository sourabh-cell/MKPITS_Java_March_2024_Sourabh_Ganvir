import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find the string with the minimum length.
public class MinimumString {
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

        //finding minimum length string
        String min =list.stream().min(Comparator.comparing(n->n.length())).get();

        System.out.println(min);
    }
}
