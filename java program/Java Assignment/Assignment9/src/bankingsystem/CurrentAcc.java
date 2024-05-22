package bankingsystem;

import java.util.Scanner;

public class CurrentAcc extends BankAccount{

    private long Balance = 100000;
    Scanner scanner=new Scanner(System.in);

    public void deposite() {
        System.out.println("enter the amount to deposite");
        Deposite=scanner.nextLong();
        Balance+=Deposite;
    }

    @Override
    public void withDrawl() {

        System.out.println("enter the amount to Withdrawl");
        withdrawl=scanner.nextLong();
        if(Balance>10000){
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
