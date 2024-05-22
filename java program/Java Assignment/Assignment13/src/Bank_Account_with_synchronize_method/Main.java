package Bank_Account_with_synchronize_method;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        new Thread(){
            public void run(){
                bankAccount.withdraw(1500);}
        }.start();
        new Thread(){
            public void run(){
                bankAccount.deposit(10000);}
        }.start();

    }
}
