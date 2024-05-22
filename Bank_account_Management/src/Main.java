import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account account=new Account();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the amount to withdraw");
            int amount=sc.nextInt();
            account.withdraw(amount);
        }
        catch (ExceptionHandling e){

            System.out.println(e.getMessage());
        }

    }
}