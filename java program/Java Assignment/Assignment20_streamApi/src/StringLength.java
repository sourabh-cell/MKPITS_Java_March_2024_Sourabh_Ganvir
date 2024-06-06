//Filter out strings with length less than 5
import java.util.LinkedList;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        //Creating Linkedlist of String
        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("shilpa");
            add("bobby");
            add("nirmala");
            add("shweta");
            add("guru");
        }};

        //filtering the string which has length less than 5
        list.stream().filter(n->n.length()<5).forEach(n-> System.out.println(n));

    }
}