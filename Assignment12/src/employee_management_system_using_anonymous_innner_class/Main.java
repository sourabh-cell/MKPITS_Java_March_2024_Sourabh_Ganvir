package employee_management_system_using_anonymous_innner_class;

public class Main {
    public static void main(String[] args) {

        //overiding method using anonymous class


        //overridng for permenent employee

       Employee emp_permenant=new Employee() {
           @Override
           public void calculateSalary(int pay_per_hour,int  total_time) {
               System.out.println("Salary of permenant Employee "+pay_per_hour*total_time);

           }

           @Override
           public void displaydetails(int id, String name) {

               System.out.println("ID :-"+id +"\nName :-"+name);
           }
       };
        //overridng for part-time employee

        Employee emp_parttime=new Employee() {
            @Override
            public void calculateSalary(int pay_per_hour,int  total_time) {
                System.out.println("Salary of part-time Employee "+pay_per_hour*total_time);

            }

            @Override
            public void displaydetails(int id, String name) {

                System.out.println("ID :-"+id +"\nName :-"+name);
            }
        };
        //overridng for contract employee

        Employee emp_contract=new Employee() {
            @Override
            public void calculateSalary(int pay_per_hour,int  total_time) {
                System.out.println("Salary of contract Employee "+pay_per_hour*total_time);

            }

            @Override
            public void displaydetails(int id, String name) {

                System.out.println("ID :-"+id +"\nName :-"+name);
            }
        };

        emp_permenant.calculateSalary(400,200);
        emp_permenant.displaydetails(1204,"Sourabh");

        emp_parttime.calculateSalary(250,100);
        emp_parttime.displaydetails(1205,"Deepak");

        emp_contract.calculateSalary(300,180);
        emp_contract.displaydetails(1206,"Shubham");

    }
}
