import java.util.LinkedList;
import java.util.List;

//Calculate the total length of all strings in the list
public class CalculateAllStringLength {
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

        //calculating sum of all String Length
        int sum=list.stream().mapToInt(n->n.length()).sum();
        System.out.println(sum);
    }
}
