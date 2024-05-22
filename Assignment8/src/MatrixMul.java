public class MatrixMul {

    public void matrixMultiplication()
    {
        int arr1[][]={{2,3,4,},
                       {4,5,6},
                       {7,8,9}};

        int arr2[][]={{2,3,4,},
                      {8,5,7},
                      {2,3,4}};

        int resultant[][]=new int[3][3];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                resultant[i][j]=0;
                for(int k=0;k<arr1.length;k++){
                    resultant[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(resultant[i][j]+" |");
            }
            System.out.println();
        }

    }

}
