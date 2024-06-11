package array_squar_every_third_number;

public class ArrayThirdNumberSquare {
    public static void main(String[] args) {

        //declaring arrray
        int[] array={1,2,3,4,5,6,7,8,9,0};


        //squaring every third element in array
        for (int i = 2; i < array.length; i+=3) {

            array[i]=array[i]*array[i];
        }

        //printing array
        for (int a:array){
            System.out.println(a);
        }
    }
}
