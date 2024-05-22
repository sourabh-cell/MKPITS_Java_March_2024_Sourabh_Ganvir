package Bank_Account_with_synchronize_method;

public class BankAccount {
    int amount=10000;
    //synchronised method withdraw
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            }
            catch(Exception e)
            {

            }
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }
    //synchronised deposit method

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notify();
    }
}


