import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Find the frequency of each string in a list.
public class FrequencyOfString {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("akshay");
            add("shilpa");
            add("akshay");
            add("sourabh");
            add("shilpa");
            add("guru");
        }};


        //displaying the frequency of string in a list
        System.out.println(list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())));
    }
}
