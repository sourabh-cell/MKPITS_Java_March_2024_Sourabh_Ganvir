public class Binarysearch {

    public void sortArray(int []array) {
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

    public void binarySearch(int n,int []array) {
        sortArray(array);
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
}
