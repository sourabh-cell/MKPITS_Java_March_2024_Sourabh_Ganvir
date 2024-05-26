package arraylist;
//Write a Java program to replace the second element of an ArrayList with the specified element.
import java.util.ArrayList;

public class ArrayListDemo21 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>(20);

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        //Replacint 2nd element of array list with specified object
        Integer num=23;
        list.add(2,num);

        //printing Arraylist
        System.out.println(list);
    }
}
