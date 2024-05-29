package acc;

public class Account {
    private String acc_no, name;
    private int balance;

    public Account(){
        acc_no = "KKBK8546";
        name = "sourabh";
        balance = 7000;

    }

    public Account(String name,String acc_no,int balance)
    {
        this.name=name;
        this.acc_no=acc_no;
        this.balance=balance;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
