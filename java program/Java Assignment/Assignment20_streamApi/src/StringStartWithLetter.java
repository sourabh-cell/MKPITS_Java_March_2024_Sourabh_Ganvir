//Find the first string that starts with the letter 'A'
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StringStartWithLetter {
    public static void main(String[] args) {

        //creating list of string
        List<String> list = new LinkedList<>() {{
            add("akshay");
            add("sourabh");
            add("Anil");
            add("shilpa");
            add("Ajay");
            add("nirmal");
            add("amey");
            add("guru");
        }};

        //filtering string starting with letter a or A
        System.out.println( list.stream().filter(n->n.startsWith("A")).findFirst().get());
    }
}
