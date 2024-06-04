import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Create a list of strings and use a stream to sort them in ascending order
public class Sorting {
    public static void main(String[] args) {
        //Creating String list
        List<String> Strlist =new ArrayList<>(){{
            add("Akshay");
            add("Sourabh");
            add("Gautam");
            add("Pancham");
            add("Vijay");
            add("Bunty");
            add("Rajat");
        }};

        //sorting the list using lambda function
        Strlist.stream().sorted().forEach(System.out::println);




    }
}
