package arraylist;//Write a Java program to insert an element into the array list at the first position
import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //Adding Element in first position
        list.addFirst(45);

        //printing list
        System.out.println(list);

    }
}
