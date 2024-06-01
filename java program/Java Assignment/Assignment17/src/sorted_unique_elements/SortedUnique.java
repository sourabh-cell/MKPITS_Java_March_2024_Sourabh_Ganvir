package sorted_unique_elements;

import java.util.Scanner;
import java.util.TreeSet;

public class SortedUnique {
    Scanner scanner = new Scanner(System.in);

    TreeSet<Integer> set = new TreeSet<>();

    public void addDuplicate()
    {
        System.out.println("please enter the value");
        set.add(scanner.nextInt());
        System.out.println("Do you want to enter another value(Y/N)");
        String choice= scanner.next();
        if (choice.equalsIgnoreCase("y"))
            addDuplicate();


    }



    public void displaySortedUnique() {
        for (Integer s:set) {
            System.out.println(s);
        }
    }

}
