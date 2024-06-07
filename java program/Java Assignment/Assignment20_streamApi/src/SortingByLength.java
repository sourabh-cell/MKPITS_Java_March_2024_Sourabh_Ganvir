import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sort a list of strings by their lengths.
public class SortingByLength {
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



        //Sorting list according to there string Length
       List <String> sorted= list.stream().sorted((x,y)->Integer.compare(x.length(),y.length())).collect(Collectors.toList());

        System.out.println(sorted);
    }

}
