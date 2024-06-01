//Create a program that reads a sequence of integers from user input and stores them in the order they were entered, ensuring no duplicates.
package Order_of_Insertion_Preservation;

import java.util.LinkedHashSet;

public class InsertionOrder {
    LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();

    int index=0;

    public void addElement(String str)
    {
        linkedHashSet.add(str);
        System.out.println("The Word "+"'"+str+"'"+" inserted on location "+index);
        index++;
    }

    public void displayElement()
    {
        int i=0;
        for (String s:linkedHashSet)
        {
            System.out.println("Location :"+i+ " Word "+s);
            i++;
    }
}
}
