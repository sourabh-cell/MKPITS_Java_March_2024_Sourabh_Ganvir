//Concatenate all strings in the list, separated by commas.
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateStringInTheList {
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


        //Concatenate all strings in the list, separated by commas. using joining function
        String string=list.stream().collect(Collectors.joining(","));
        System.out.println(string);
    }
}