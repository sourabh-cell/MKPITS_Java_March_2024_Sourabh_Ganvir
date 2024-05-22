package hourly_payment_employees;

public class PayRoll_Employee extends Employee{

    int total_work_hour;

   public PayRoll_Employee(int total_work_hour, String name,int hourly_pay)
    {
        super(name,hourly_pay);
        this.total_work_hour=total_work_hour;

    }

    @Override
    public int calculateSalary() {
        System.out.println(name);
                return total_work_hour*hourly_pay;
    }
}
