//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};

        Matrix_operation m = new Matrix_operation();
        m.lowerTraingularMatrix(mat);
        m.upperTraingularMatrix(mat);
    }
}