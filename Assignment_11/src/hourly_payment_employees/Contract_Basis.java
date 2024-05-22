package hourly_payment_employees;

import javax.xml.namespace.QName;

public class Contract_Basis extends Employee{
    int total_work_hour;


  public Contract_Basis(int total_work_hour, String name,int hourly_pay)
   {
         super(name,hourly_pay);                      // calling constructor of super class
         this.total_work_hour=total_work_hour;

   }

    @Override
    public int calculateSalary() {
        System.out.println(name);
        return total_work_hour*hourly_pay;
    }


}
