import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Join a list of strings with a custom separator.
public class JoinListOfStringWithCustomSeperator {
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

        //joining content of list in a string with custom seperator
        String l1=list.stream().collect(Collectors.joining("_"));
        System.out.println(l1);
    }
}
