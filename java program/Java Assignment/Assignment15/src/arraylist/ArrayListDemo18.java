package arraylist;//Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;

public class ArrayListDemo18 {
    public static void main(String[] args) {

        //creating Array List of Integer
        ArrayList<Integer> list=new ArrayList<>();

        //Adding Element in list
        list.add(11);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);



        //checking  Arraylist empty or not
        if(list.isEmpty()==false)
           System.out.println("Array list is not empty");
        else
            System.out.println("Array list is empty");


    }
}
