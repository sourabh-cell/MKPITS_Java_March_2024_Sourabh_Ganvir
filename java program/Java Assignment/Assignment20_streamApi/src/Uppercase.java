import java.util.LinkedList;
import java.util.List;

//Convert a list of strings to uppercase
public class Uppercase {
    public static void main(String[] args) {

        //Creating Linkedlist of Integer
        List<String> list=new LinkedList<>(){{
            add("akshay");
            add("sourabh");
            add("deepa");
            add("Shilpa");
            add("Bobby");
            add("nirmala");
            add("shweta");
            add("guru");

        }};

         //converting all element to Uppercaseusing lambda function
        list.stream().map(n->n.toUpperCase()).forEach(System.out::println);
    }
}
