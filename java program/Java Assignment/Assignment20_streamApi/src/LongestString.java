import java.util.*;
import java.util.stream.Collectors;

// **Find the longest string in the list.**
public class LongestString {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("shilpa");
            add("bobby");
            add("nirmal");
            add("shweta");
            add("guru");
        }};

        //Finding longest string in list
        String str=list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(str);
    }
}
