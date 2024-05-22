import array.ArrayOp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        int p=1;
        Scanner scanner=new Scanner(System.in);

        ArrayOp arr = new ArrayOp();

        arr.acceptArray();



        while (p==1) {

            System.out.println("1.Display \n 2.Sort\n 3.Minimum and Maximum \n 4.Median \n 5.Rotate\n 6.Peak Element\n 7.Binary Search\n 8.exit ");
            System.out.println("Please enter your choice");
            choice=scanner.nextInt();

            switch (choice){

                case 1:
                    arr.displayArray();
                    break;
                case 2:
                    arr.sortArray();
                    break;
                case 3:
                    arr.minimumMaximum();
                    break;
                case 4:
                    arr.medianArray();
                    break;
                case 5:
                    arr.rotateArray();
                    break;
                case 6:
                    arr.peakElement();
                    break;
                case 7:
                    System.out.println("please enter the number to find");
                    int n=scanner.nextInt();
                    arr.binarySearch(n);
                    break;
                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("please enter valid choice");
                    break;

            }

        }




    }
}