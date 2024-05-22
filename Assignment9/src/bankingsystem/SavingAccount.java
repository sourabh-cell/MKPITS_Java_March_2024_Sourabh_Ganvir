package bankingsystem;

import java.util.Scanner;

public class SavingAccount extends BankAccount{

   private long Balance=9800;
   private long Deposite=0000;
   private long withdrawl;
    Scanner scanner =new Scanner(System.in);
    @Override
    public void deposite() {
        System.out.println("enter the amount to deposite");
        Deposite=scanner.nextLong();
        Balance+=Deposite;
    }

    @Override
    public void withDrawl() {

        System.out.println("enter the amount to Withdrawl");
        withdrawl=scanner.nextLong();
        if(Balance>1000){
            System.out.println("Your transaction denied due to low balance");
        }
        else {
            Balance -= withdrawl;
        }
    }

    @Override
    public void chkBalance() {
        System.out.println(Balance);
    }
}
