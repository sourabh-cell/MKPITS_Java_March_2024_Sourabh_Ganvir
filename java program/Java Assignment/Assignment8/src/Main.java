import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //   Factorial f = new Factorial();
     //   System.out.println( f.factorial(6));


   //     Fizzbuzz fz= new Fizzbuzz();
//        fz.fizzbuzz();

//        int num[]={23,45,76,43,12};
//        Binarysearch b=new Binarysearch();
//        b.binarySearch(45,num);

//        MatrixMul m=new MatrixMul();
//        m.matrixMultiplication();


        Scanner scanner=new Scanner(System.in);
        Palindrome p=new Palindrome();
        p.chkpalindrome(scanner.next());
    }
}