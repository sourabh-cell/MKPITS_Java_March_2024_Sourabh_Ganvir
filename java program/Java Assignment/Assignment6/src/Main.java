import java.util.Scanner;
import calculator.*;


public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the Two number");
//        int num1= scanner.nextInt();
//        int num2=scanner.nextInt();
//        Calculator cl=new Calculator(num1,num2);
//        System.out.println("Please select the operator\n 1.+ \n 2.- \n 3.* \n 4./");
//        String operator= scanner.next();
//        switch (operator){
//            case"+":
//                cl.add();
//                break;
//            case"-":
//                cl.subtract();
//                break;
//            case"*":
//                cl.multiplication();
//                break;
//            case"/":
//                cl.division();
//                break;
//
//            default:
//                System.out.println("please select valid operator");
//                break;
//        }



//         int i,j;
//         i=0;
//         j=0;
//         Addressbook a[]= new Addressbook[4];
//         while(i<a.length) {
//
//             a[j] = new Addressbook();
//             System.out.println("please enter the name");
//             String name = scanner.next();
//             a[j].setName(name);
//             System.out.println("please enter the emailid");
//             a[j].setEmail_add(scanner.next());
//             System.out.println("please enter the Mob no");
//             a[j].setEmail_add(scanner.next());
//             j++;
//             i++;
//         }
//
//         for(int k=0;k<a.length;k++)
//         {
//             System.out.println(a[k].getName());
//             System.out.println(a[k].getMob_no());
//             System.out.println(a[k].getEmail_add());
//         }

        //Atm
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;
        Atm atm=new Atm();

        // calling display balance
        Atm.displayBalance(balance);
        // withdrawing amount

        balance= Atm.amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = Atm.amountDepositing(balance, depositAmount);
    }

}