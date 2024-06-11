//Write a program to rotate a list for specified number of positions
package array_squar_every_third_number;

import java.util.LinkedList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {

        RotateList r= new RotateList();
        r.rotateright(2);
        r.rotateLeft(3);
    }
    List<Integer> list = new LinkedList<>()
    {{
        add(45);
        add(65);
        add(78);
        add(98);
        add(89);


    }};

    public void rotateright(int rotation)
    {

        int temp;
        for (int i = 0; i < rotation; i++) {
            temp= list.removeLast();
            list.addFirst(temp);

        }

        System.out.println("After rotation");
        list.stream().forEach(n-> System.out.print(" "+n));
    }

    public void rotateLeft(int rotation)
    {
        int temp;
        for (int i = 0; i < rotation; i++) {
            temp= list.removeFirst();
            list.addLast(temp);

        }

        System.out.println("After rotation");
        list.stream().forEach(n-> System.out.print(" "+n));
    }




}
