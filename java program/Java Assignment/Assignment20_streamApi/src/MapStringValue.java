import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Create a map from a list of strings with the string as the key and its length as the value
public class MapStringValue {
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

        Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length,n->n));
        System.out.println(map);

    }
}
