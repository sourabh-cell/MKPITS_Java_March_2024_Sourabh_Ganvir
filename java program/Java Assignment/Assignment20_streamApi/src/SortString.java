//Sort a list of strings alphabetically.
import java.util.LinkedList;
import java.util.List;

public class SortString {
    public static void main(String[] args) {

        //Creating Linkedlist of String
         List<String> list=new LinkedList<>(){{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("shilpa");
            add("bobby");
            add("nirmala");
            add("shweta");
            add("guru");

        }};

        //sorting element using lambda function
        list.stream().sorted().forEach(n-> System.out.println(n));
    }
}
