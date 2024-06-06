//**Check if all strings in the list are non-empty.**
import java.util.LinkedList;
import java.util.List;

public class ISListElementEmpty {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("shilpa");
            add("bobby");
            add("nirmal");
            add("");
            add("guru");
        }};

        //checking if any element in list is empty
        list.stream().map(n-> {if (n.isEmpty()) System.out.print("String is empty");
                return n;}).forEach(System.out::println);
    }
}
