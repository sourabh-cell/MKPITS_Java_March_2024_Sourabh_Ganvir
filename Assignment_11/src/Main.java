import hourly_payment_employees.Contract_Basis;
import hourly_payment_employees.Employee;
import hourly_payment_employees.PayRoll_Employee;
import multiple_interface.TwoWheeler;
import user_defined_exception_string_mismatch.Match;
import user_defined_exception_string_mismatch.StringMismatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        PayRoll_Employee p=new PayRoll_Employee(45,"sourabh",400);
//        System.out.println(p.calculateSalary());
//
//        Contract_Basis c = new Contract_Basis(20,"shubham",120);
//        System.out.println(c.calculateSalary());

        /*___________________________________________________________________________________________*/

//        TwoWheeler tw = new TwoWheeler();
//        tw.distance();
//        tw.speed();
//        tw.display();

   /*---------------------------------------------------------------------------------------------------*/


        Match m  = new Match();
        m.takeString();
        try
        {
            m.matchString();
        } catch (StringMismatch e)
        {
            System.out.println(e.getMessage());
        }


    }
}