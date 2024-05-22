package banking_management_system_using_anonymous_inner_class;

public class Main {
    public static void main(String[] args) {

        Account ac_saving = new Account() {

            @Override
            public void calculateInterest(float interest)
            {
                System.out.println("Interest of Saving Account is :-"+interest);
            }

            @Override
            public void accountDetails(int account_number, String name)
            {
                System.out.println("Name :-"+name+"\n Account number :-"+account_number);
            }
        };


        Account ac_current = new Account() {
            @Override
            public void calculateInterest(float interest)
            {
                System.out.println("Interest of Current Account is :-"+interest);

            }

            @Override
            public void accountDetails(int account_number, String name)
            {
                System.out.println("Name :-"+name+"\n Account number :-"+account_number);
            }
        };

        Account ac_fixed_dep=new Account() {
            @Override
            public void calculateInterest(float interest)
            {
                System.out.println("Interest of Fixed Deposite is :-"+interest);
            }

            @Override
            public void accountDetails(int account_number, String name)
            {
                System.out.println("Name :-"+name+"\n Account number :-"+account_number);
            }
        };

    }
}