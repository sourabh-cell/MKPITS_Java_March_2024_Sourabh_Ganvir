import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//Get a list of unique characters from a list of strings
public class UniqueCharecterFromList {
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

        //creating the list of charecter from each string
        List<Character> characters=list.stream().flatMapToInt(n->n.chars()).mapToObj(c->(char) c).collect(Collectors.toList());

        //removin duplicate chrecter in list by using distinct()
        characters=characters.stream().distinct().toList();
        System.out.println(characters);



    }
}
