package array;

import java.util.Scanner;

public class ArrayOp {

    private int array[] = new int[5];

    Scanner scanner = new Scanner(System.in);

    public void acceptArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of array");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();

        }


    }

    public void displayArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


    }

    public void sortArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }


        }

    }

    public void minimumMaximum() {

        sortArray();
        System.out.println("The maximum element of array" + array[array.length - 1]);
        System.out.println("The minimum element of array" + array[0]);
    }

    public void rotateArray() {
        int d, first, p = 1, len = array.length;
        System.out.println("please enter the no of cycle");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextInt();
        first = array[len - 1];
        while (p >= d) {
            for (int i = 1; i < len - 1; i++) {
                array[len - i] = array[len - (i + 1)];
            }
            array[0] = first;
            p++;

        }

        System.out.println(array[3]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public int medianArray() {
        int temp = 0, n = array.length;
        float temp2;
        if (n / 2 == 0) {
            sortArray();
            int first = n / 2;
            int second = n / 2;
            second = second + 1;
            temp2 = first + second;
            temp2 = temp2 / 2;
            System.out.println("The median is:" + temp2);
        } else {
            temp = n / 2 + 1;
            System.out.println("The median is:" + temp);
        }
        return temp;
    }

    public void peakElement() {
        if (array[0] > array[1]) {
            System.out.println("The peak Element is:" + array[0]);
        }
        if (array[array.length - 1] > array[array.length - 2]) {
            System.out.println("The peak element is:" + array[array.length - 1]);
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                System.out.println("The peak Element is:" + array[i]);
            }
        }
    }


    public void linearSearch(int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Element found on location" + i);
                break;
            }
        }
    }

    public void binarySearch(int n) {

        sortArray();
        int loc = array.length / 2 + 1;
        int median=array[loc];
        if (median == n) {

            System.out.println("value found on location" + loc);
        }
        if (n > median) {
            while (array[loc] < array.length) {
                loc += 1;
                if (array[loc] == n) {
                    System.out.println("Element found on location" + loc);
                }

            }
        } else {
            while (loc > 0) {
                loc =loc- 1;
                if (array[loc] == n) {
                    System.out.println("Element found on location" + loc);
                }
            }
        }
    }

    public void maxDifference(){
        int result= array[0]-array[1];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                result=Math.max(result, array[j]-array[i]);
            }

        }
        System.out.println("The max difference is "+result);
        //time complexity is bigO square
    }

    public void insert(int value)
    {
        System.out.println("please enter the index to insert in array");
        int index = scanner.nextInt();
        try {
            array[index] = value;
        } catch (Exception e)
        {
            System.out.println("please enter the index in valid range");
            insert(value);    // Recursion until the valid index

        }

    }

    public void delete(){
        System.out.println("please enter the index to insert in array");
        int index = scanner.nextInt();
        try {
            array[index]=0;
        }
        catch (Exception e)
        {
            System.out.println("please enter the index in valid range");
            delete();    // Recursion until the valid index

        }
        for (int i = index; i <array.length ; i++) {
            array[i]=array[i+1];
        }

    }

    public void oddEven(){
        int length =array.length;
        int arr_even[]=new int[length];
        int arr_odd[]=new int[length];

        for(int i=0;i< array.length;i++){
            if(i%2==0)
            {
                arr_even[i]=array[i];
            }
           else
           {
                arr_odd[i]=array[i];
           }


        }
    }
    public void incrementArray(){
        int temp = 0,count=0;
        for(int i:array){
            temp=i+1;
            array[count]=temp;
            count++;
        }
    }

    public void evenElementEvenIndex() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

        public void evenElementOddIndex(){
            for (int i = 0; i < array.length; i++) {
                if (i%2!=0 && array[i]%2==0) {
                    System.out.println(array[i]);
                }
            }

    }
}
