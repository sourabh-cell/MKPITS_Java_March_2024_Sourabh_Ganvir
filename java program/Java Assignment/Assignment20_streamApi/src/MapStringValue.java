import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
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

        //map from a list of strings with the string as the key and its length as the value using lambda
    Map<String,Integer> map=list.stream().collect(Collectors.toMap(n->n,n->n.length()));


    //map from a list of strings with the string as the key and its length as the value using Method reference
        Map<String,Integer> map1=list.stream().collect(Collectors.toMap(Function.identity(),String::length));

        System.out.println(map1);


    }
}
