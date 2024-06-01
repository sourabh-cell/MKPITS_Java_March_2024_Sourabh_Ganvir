package inventory_management_system;

import employee_records_system.Employee;
import employee_records_system.EmployeerecordSystem;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        InventoryManagement in=new InventoryManagement();

        while (true) {
            System.out.println("please enter choice\n1.Add Item\n2.display All Item\n3.Access Item record\n4.Update Item\n5.Delete Item record\n6.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    in.addItem(in.inputName(),in.inputQuantity());
                    break;

                case 2:
                     in.displayItem();
                    break;

                case 3:
                    in.retrieveItem(in.inputName());
                    break;

                case 4:
                    in.updateItem(in.inputName(),in.inputQuantity());
                    break;

                case 5:
                    in.deleteItem(in.inputName());
                    break;

                case 6:
                    System.exit(0);
                    break;
            }


        }


    }
}
