//Create a list of strings and use a stream to filter out strings that start with the letter "A". Collect the filtered strings into a new list.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringAndCollecting {

    public static void main(String[] args) {

        //creating string type array list
        List<String> Strlist =new ArrayList<>(){{
            add("Akshay");
            add("Sourabh");
            add("Amol");
            add("Pancham");
            add("Ajay");
            add("Bunty");
            add("Rajat");
        }};

        //Name start with 'A' storing in another list using lambda function
        List<String> s1=Strlist.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(s1);



    }
}
