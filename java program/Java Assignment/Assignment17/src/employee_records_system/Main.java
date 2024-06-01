package employee_records_system;

import sorted_contact_list.ContactList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        EmployeerecordSystem emp=new EmployeerecordSystem();

        while (true) {
            System.out.println("please enter choice\n1.Add Employee\n2.display All Employees\n3.Access Employee record\n4.Update Employee\n5.Delete Employee record\n6.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    emp.addEmployee(emp.inputId(), emp.inputName(),emp.inputAddress(), emp.inputAge());
                    break;

                case 2:
                    emp.displayEmployee();
                    break;

                case 3:
                    emp.retrieveEmployee(emp.inputId());
                    break;

                case 4:
                    Employee e=new Employee(emp.inputName(), emp.inputAge(), emp.inputAddress());
                    emp.updateEmployeeInfo(emp.inputId(),e);
                    break;

                case 5:
                    emp.deleteEmployee(emp.inputId());
                    break;

                case 6:
                    System.exit(0);
                    break;
            }


        }


    }
}
