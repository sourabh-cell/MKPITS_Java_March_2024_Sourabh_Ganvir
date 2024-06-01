package case_insensetive_word_storage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CaseInsensetive {

    TreeSet<String> treeSet=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER){{
       add("akshay");
       add("Akshay");
       add("Akshay");
       add("Sourabh");
       add("sourabh");
       add("Sourabh");
       add("Ganvir");
       add("ganvir");
       add("Ganvir");

    }};



    public void displaySet() {
        for (String t : treeSet) {
            System.out.print(t+", ");

        }
    }
}
