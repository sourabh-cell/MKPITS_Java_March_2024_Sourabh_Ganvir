package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list.
public class ArraylistDemo2 {
    public static void main(String[] args) {

        //creating Array List
        ArrayList<String> colors=new ArrayList<>();

        //Adding color in list
        colors.add("violate");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("yellow");
        colors.add("Orange");
        colors.add("Red");

        System.out.println("iterating through arraylist using iterator");
        //iterating through arraylist using iterator
        Iterator it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("iterating through arraylist using Foreach");
        //iterating through arraylist using Foreach
        for (String s:colors)
        {
            System.out.println(s);
        }

        }
}

