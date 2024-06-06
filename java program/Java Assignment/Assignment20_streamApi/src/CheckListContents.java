import java.util.LinkedList;
import java.util.List;

//Check if any string in the list contains the letter 'a'
public class CheckListContents {
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

        //filtering element which contain letter 'a'
        list.stream().filter(n->n.contains("a")).forEach(n-> System.out.println(n));
    }
}
