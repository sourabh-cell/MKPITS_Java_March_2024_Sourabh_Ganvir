public class Account {

    private int withdrawl;
    private int balance=10000;

    public void deposit()
    {

    }

    public void withdraw(int withdrawl) throws ExceptionHandling
    {
      if (withdrawl>balance)
      {
          throw new ExceptionHandling();
      }
     balance-=withdrawl;
        System.out.println("withdrawl successfully\nBalance "+balance);
    }

    public void getBalance()
    {

    }

}
