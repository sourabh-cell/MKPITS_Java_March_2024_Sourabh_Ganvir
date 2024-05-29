public class Matrix_operation {

    public void lowerTraingularMatrix(int mat[][]) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i)
                {
                    System.out.print(0+" ");

                }
                else
                {
                    System.out.print(mat[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public void upperTraingularMatrix(int mat[][]) {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < i)
                {
                    System.out.print(0+" ");

                }
                else
                {
                    System.out.print(mat[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

}