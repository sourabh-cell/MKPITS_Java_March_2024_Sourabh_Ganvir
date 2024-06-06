import java.util.LinkedList;
import java.util.List;

//Count the number of elements in a list
public class CountNumber {
    public static void main(String[] args) {
        //Creating Linkedlist of Integer
        List<Integer> list=new LinkedList<>(){{
            add(45);
            add(32);
            add(44);
            add(39);
            add(25);
            add(46);
            add(69);
            add(88);

        }};

        //counting the element in the list
      long count=  list.stream().count();
      System.out.println(count);
    }
}
