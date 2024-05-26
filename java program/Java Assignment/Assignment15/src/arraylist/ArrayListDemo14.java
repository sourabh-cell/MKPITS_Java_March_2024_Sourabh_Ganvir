package arraylist;

import java.util.ArrayList;

//Write a Java program that swaps two elements in an array list.
public class ArrayListDemo14 {
    public static void main(String[] args) {
        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();



        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);

        System.out.println(list);

        //swapping list
        Integer temp =list.get(1);
        list.add(1,list.get(0));
        list.add(0,temp);
        System.out.println(temp);

        //printing list
        System.out.println(list);
    }
}
