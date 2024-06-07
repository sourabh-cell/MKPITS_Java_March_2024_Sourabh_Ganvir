import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {
    public static void main(String[] args) {

        //creating list of Name
        List<String> name= Arrays.asList("Sourabh", "Akshay", "Nikhil", null, "Vinay",null);

        //removing null values from list c
        List<String> name1= name.stream().filter(n->n!=null).collect(Collectors.toList());

        System.out.println(name1);
    }
}
