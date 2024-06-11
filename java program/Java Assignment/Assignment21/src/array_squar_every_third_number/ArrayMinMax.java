package array_squar_every_third_number;

import java.util.Arrays;

//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers
public class ArrayMinMax {
    public static void main(String[] args) {

        int[] array={1,3,5,8,6,9};
        int min=0,max=0;

        //Sorting Array
        array=Arrays.stream(array).sorted().toArray();

        //Adding four small element in array
        for (int i = 0; i < 4; i++) {
            min+=array[i];
        }
        System.out.println("Addition of first four small element "+min);

        //Adding four large element in array
        for (int i = array.length-1; i > array.length-5 ; i--) {
            max+=array[i];
        }
        System.out.println("Addition of first four large.. element "+max);
    }
}
